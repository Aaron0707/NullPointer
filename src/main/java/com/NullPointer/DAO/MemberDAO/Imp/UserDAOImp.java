package com.NullPointer.DAO.MemberDAO.Imp;

import com.NullPointer.DAO.BaseDAO.GeneticDAOImp;
import com.NullPointer.DAO.MemberDAO.IUserDAO;
import com.NullPointer.Models.Member.User;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Aaron on 11/18/16.
 */
@Repository
public class UserDAOImp extends GeneticDAOImp<User> implements IUserDAO {

    public User findByAccount(String account) {

        String sql = "select * from User where account = "+account;
        SQLQuery query =  super.getCurrentSession().createSQLQuery(sql);
        query.addEntity(User.class);
        List userList = query.list();
        if (!userList.isEmpty()) {
            return (User) userList.get(0);
        }else {
            return null;
        }
    }
}
