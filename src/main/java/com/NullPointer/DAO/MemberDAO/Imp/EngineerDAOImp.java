package com.NullPointer.DAO.MemberDAO.Imp;

import com.NullPointer.DAO.BaseDAO.GeneticDAOImp;
import com.NullPointer.DAO.MemberDAO.IEngineerDAO;
import com.NullPointer.Models.Member.Engineer;
import org.springframework.stereotype.Repository;

/**
 * Created by Aaron on 11/19/16.
 */
@Repository
public class EngineerDAOImp extends GeneticDAOImp<Engineer> implements IEngineerDAO{
}
