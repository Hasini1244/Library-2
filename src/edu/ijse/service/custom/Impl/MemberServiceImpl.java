/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.Impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.MemberDao;
import edu.ijse.dto.MemberDto;
import edu.ijse.entity.MemberEntity;
import edu.ijse.service.custom.MemberService;
import java.util.ArrayList;



/**
 *
 * @author USER
 */
public class MemberServiceImpl implements MemberService{
 private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);

    @Override
    public String save(MemberDto dto) throws Exception {
 MemberEntity entity = getMemberEntity(dto);
        return memberDao.save(entity);
    }

    @Override
    public String update(MemberDto dto) throws Exception {
MemberEntity entity = getMemberEntity(dto);
        return memberDao.update(entity);
    }

    @Override
    public String delete(String memberId) throws Exception {
        return memberDao.delete(memberId);

    }

    @Override
    public MemberDto get(String memberId) throws Exception {
 MemberEntity entity = memberDao.get(memberId);
       if(entity!=null){
        return getMemberDto(entity);
       }
       return null;
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
 ArrayList<MemberDto> memberDtos = new ArrayList<>();
        ArrayList<MemberEntity>memberEntitys = memberDao.getAll();
        for (MemberEntity memberEntity : memberEntitys) {
            MemberDto dto = getMemberDto(memberEntity);
            memberDtos.add(dto);
        }
        return memberDtos;
    }

     private MemberDto getMemberDto(MemberEntity entity){
        MemberDto memberDto = new MemberDto(entity.getMemberId(), entity.getTitle(),
                entity.getName(),
                entity.getDob(), entity.getAddress(), entity.getCity(), entity.getPostalCode());
        return memberDto;
    }

    private MemberEntity  getMemberEntity(MemberDto dto){
 MemberEntity entity = new MemberEntity(dto.getMemberId(), dto.getTitle(), dto.getName(),dto.getDob(), dto.getAddress(), dto.getCity(), dto.getPostalCode());
 return entity;
}
}
