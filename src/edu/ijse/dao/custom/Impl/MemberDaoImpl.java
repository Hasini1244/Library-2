/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.Impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.MemberDao;
import edu.ijse.entity.MemberEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author USER
 */
public class MemberDaoImpl implements MemberDao{

    @Override
    public String save(MemberEntity t) throws Exception {
boolean isSaved = CrudUtil.executeUpdate("INSERT INTO member VALUES(?,?,?,?,?,?,?)", 
               t.getMemberId(), t.getTitle(),t.getName(),t.getDob(), t.getAddress(), t.getCity(), t.getPostalCode());
        return isSaved ? "Success" : "Fail";
        }

    @Override
    public String update(MemberEntity t) throws Exception {
boolean isUpdated = CrudUtil.executeUpdate("UPDATE member SET Title=?, Name = ?, Dob=?,Address=?,City=?,PostalCode=?  WHERE MemberId =?",
      t.getTitle(),t.getName(),t.getDob(), t.getAddress(), t.getCity(), t.getPostalCode(), t.getMemberId());         
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String delete(String id) throws Exception {
boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM member WHERE MemberId =?", id);
        return isDeleted ? "Success" : "Fail";    }

    @Override
    public MemberEntity get(String id) throws Exception {
 ResultSet rst = CrudUtil.executeQuery("SELECT * FROM member WHERE MemberId =?", id);
        if (rst.next()) {
            return new MemberEntity(rst.getString("MemberId"), rst.getString("Title"),rst.getString("Name"),rst.getString("Dob"), rst.getString("Address"), rst.getString("City"), rst.getString("PostalCode"));         

        }
           return null;  
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
 ArrayList<MemberEntity>memberEntitys = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Member");
        while (rst.next()) {
           MemberEntity entity = new MemberEntity( rst.getString("MemberId"), rst.getString("Title"),rst.getString("Name"),rst.getString("Dob"), rst.getString("Address"), rst.getString("City"), rst.getString("PostalCode")); 
            memberEntitys.add(entity);
        }

        return memberEntitys;
    }    }
    

