/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.MemberDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface MemberService extends SuperService{
    public String save(MemberDto dto) throws Exception;
    public String update(MemberDto dto) throws Exception;
    public String delete(String memberId) throws Exception;
    public MemberDto get(String memberId) throws Exception;
    public ArrayList<MemberDto> getAll() throws Exception;
}