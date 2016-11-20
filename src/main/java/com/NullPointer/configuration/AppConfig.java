/**
 * Created by Aaron on 11/18/16.
 * Email: aaronyang.memory@gmail.com
 */

package com.NullPointer.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.NullPointer")
public class AppConfig extends WebMvcConfigurerAdapter{
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

//	@Bean
//	public RedisConnectionFactory jedisConnectionFactory() {
//		JedisPoolConfig poolConfig = new JedisPoolConfig();
//		poolConfig.setMaxTotal(5);
//		poolConfig.setTestOnBorrow(true);
//		poolConfig.setTestOnReturn(true);
//		JedisConnectionFactory ob = new JedisConnectionFactory(poolConfig);
//		ob.setUsePool(true);
//		ob.setHostName("localhost");
//		ob.setPort(6379);
//		return ob;
//	}
//	@Bean
//	public StringRedisTemplate stringRedisTemplate(){
//		return new StringRedisTemplate(jedisConnectionFactory());
//	}
}

