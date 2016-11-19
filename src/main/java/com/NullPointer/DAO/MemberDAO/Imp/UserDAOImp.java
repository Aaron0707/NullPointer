package com.NullPointer.DAO.MemberDAO.Imp;

import com.NullPointer.DAO.BaseDAO.GeneticDAOImp;
import com.NullPointer.DAO.MemberDAO.IUserDAO;
import com.NullPointer.Models.Member.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Aaron on 11/18/16.
 */
@Repository
public class UserDAOImp extends GeneticDAOImp<User> implements IUserDAO {

}
