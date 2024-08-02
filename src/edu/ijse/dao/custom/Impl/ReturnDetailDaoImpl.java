/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.Impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.ReturnDetailDao;
import edu.ijse.entity.ReturnDetailEntity;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ReturnDetailDaoImpl implements ReturnDetailDao{

    @Override
    public String save(ReturnDetailEntity t) throws Exception {
 boolean isReturnDetailSaved = CrudUtil.executeUpdate("INSERT INTO returnsdetail VALUES (?,?,?)", t.getReturnId(), t.getBookId(), t.getQty());
        return isReturnDetailSaved ? "Success" : "Fail";    }

    @Override
    public String update(ReturnDetailEntity t) throws Exception {
return null;
    }

    @Override
    public String delete(Object id) throws Exception {
return null;
    }

    @Override
    public ReturnDetailEntity get(Object id) throws Exception {
return null;
    }

    @Override
    public ArrayList<ReturnDetailEntity> getAll() throws Exception {
return null;
    }
    
}
