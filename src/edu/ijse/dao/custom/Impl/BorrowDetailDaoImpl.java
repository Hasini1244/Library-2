/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.Impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.BorrowDetailDao;
import edu.ijse.entity.BorrowDetailEntity;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class BorrowDetailDaoImpl implements BorrowDetailDao{

    @Override
    public String save(BorrowDetailEntity t) throws Exception {
        boolean isBorrowDetailSaved = CrudUtil.executeUpdate("INSERT INTO borrowdetail VALUES (?,?,?)", t.getBorrowId(), t.getBookId(), t.getQty());
        return isBorrowDetailSaved ? "Success" : "Fail";
    }

    @Override
    public String update(BorrowDetailEntity t) throws Exception {
return null;
    }

    @Override
    public String delete(Object id) throws Exception {
return null;
    }

    @Override
    public BorrowDetailEntity get(Object id) throws Exception {
return null;
    }

    @Override
    public ArrayList<BorrowDetailEntity> getAll() throws Exception {
return null;
    }
    
}
