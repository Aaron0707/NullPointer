package com.NullPointer.Utils;

import com.NullPointer.Models.Base.BaseModel;
import com.NullPointer.configuration.RedisConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by Aaron on 11/19/16.
 *
 * Email: aaronyang.memory@gmail.com
 * =======================================================
 */
public final class RedisUtil {

    private static JedisPool jedisPool = null;
    /**
     *  init Redis pool
     */
    static {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(RedisConfig.MAX_ACTIVE);
            config.setMaxIdle(RedisConfig.MAX_IDLE);
            config.setMaxWaitMillis(RedisConfig.MAX_WAIT);
            config.setTestOnBorrow(RedisConfig.TEST_ON_BORROW);
            jedisPool = new JedisPool(config, RedisConfig.ADDR, RedisConfig.PORT, RedisConfig.TIMEOUT, RedisConfig.AUTH);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized static Jedis getJedis() {
        try {
            if (jedisPool != null) {
                Jedis resource = jedisPool.getResource();
                return resource;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void returnResource(final Jedis jedis) {
        if (jedis != null) {
            jedisPool.returnResource(jedis);
        }
    }

    /**
     *
     * @param key
     * @param i
     * @param object
     * @return if success return code else null
     */
    public static String  setex(String key, int i, BaseModel object) {
        Jedis jedis = getJedis();
        if (jedis==null){
            return null;
        }

        String result = jedis.setex(key.getBytes(),i,SerializeUtil.serialize(object));
        returnResource(jedis);
        return result;
    }

    public static String set(String key,String value){
        Jedis jedis = getJedis();
        if (jedis==null){
            return null;
        }
        String result = jedis.set(key,value);
        returnResource(jedis);
        return result;
    }

    /**
     *
     * @param key
     * @return Integer reply, specifically: an integer greater than 0 if one or more keys were removed
     *         0 if none of the specified key existed
     */
    public static Long del(String key){
        Jedis jedis = getJedis();
        Long l =  jedis.del(key);
        returnResource(jedis);
        return l;
    }

    public static byte[] get(String token) {
        Jedis jedis = getJedis();
        if (jedis==null){
            return null;
        }
        return jedis.get(token.getBytes());
    }
}
