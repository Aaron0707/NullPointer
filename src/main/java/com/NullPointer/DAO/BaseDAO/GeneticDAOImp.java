package com.NullPointer.DAO.BaseDAO;

import com.NullPointer.Models.Base.BaseModel;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.ObjectInputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;


/**
 * Created by annezhao on 9/19/16.
 * Email: aaronyang.memory@gmail.com
 */
public class GeneticDAOImp<T extends BaseModel> implements IGeneticDAO<T> {
    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> entityClass = null;

    public Session getCurrentSession() {
        if (entityClass == null) {
            Type genType = getClass().getGenericSuperclass();
            entityClass = (Class)((ParameterizedType)genType).getActualTypeArguments()[0];
        }
        return sessionFactory.getCurrentSession();
    }

    public void insert(T t) {
        getCurrentSession().save(t);
    }

    public void updateByObject(T t) {
        getCurrentSession().saveOrUpdate(t);
    }

    public void deleteById(long id) {
        T t = (T) getCurrentSession().get(entityClass.getName(), id);
        if (t != null)
        getCurrentSession().delete(t);
    }

    public T findById(long id) {
        T t = (T) getCurrentSession().get(entityClass.getName(), id);
        return t;
    }

    public List<T> findAll() {
        List<T> result = getCurrentSession().createCriteria(entityClass.getName()).list();
        return result;
    }

    public List<T> queryBySql(String sql, Map<String,Object> param) {
        SQLQuery query = getCurrentSession().createSQLQuery(sql);
        query.addEntity(entityClass);
        for(String key : param.keySet()){
            query.setParameter(key, param.get(key));
        }

        List<T> result = query.list();
        return result;
    }
}
