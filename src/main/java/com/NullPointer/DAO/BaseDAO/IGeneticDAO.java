package com.NullPointer.DAO.BaseDAO;


import com.NullPointer.Models.Base.BaseModel;

import java.util.List;

/**
 * Created by annezhao on 9/19/16.
 * Email: aaronyang.memory@gmail.com
 */
public interface IGeneticDAO <T extends BaseModel> {
    public void insert(T t);
    public T findById(long id);
    public List<T> findAll();
    public void deleteById(long id);
    public void updateByObject(T t);
}
