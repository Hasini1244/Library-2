/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.Impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.ReturnDao;
import edu.ijse.entity.ReturnEntity;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ReturnDaoImpl implements ReturnDao{

    @Override
    public String save(ReturnEntity  t) throws Exception {
 boolean isReturnSaved = CrudUtil.executeUpdate("INSERT INTO returns VALUES (?,?,?,?)", t.getReturnId(), t.getDate(), t.getMemberId(),t.getFine());
        return isReturnSaved ? "Success" : "Fail";    }

    @Override
    public String update(ReturnEntity t) throws Exception {
return null;
    }

    @Override
    public String delete(String id) throws Exception {
return null;
    }

    @Override
    public  ReturnEntity get(String id) throws Exception {
return null;
    }

    @Override
    public ArrayList<ReturnEntity> getAll() throws Exception {
return null;
    }
    
}
