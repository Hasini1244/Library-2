/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ReturnDto {
 private String returnId;
    private String date;
    private String MemberId;
    private Double fine;
    
    private ArrayList<ReturnDetailDto> returnDetailDtos;

    public ReturnDto() {
    }

    public ReturnDto(String returnId, String date, String MemberId, Double fine, ArrayList<ReturnDetailDto> returnDetailDtos) {
        this.returnId = returnId;
        this.date = date;
        this.MemberId = MemberId;
        this.fine = fine;
        this.returnDetailDtos = returnDetailDtos;
    }

    /**
     * @return the returnId
     */
    public String getReturnId() {
        return returnId;
    }

    /**
     * @param returnId the returnId to set
     */
    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the MemberId
     */
    public String getMemberId() {
        return MemberId;
    }

    /**
     * @param MemberId the MemberId to set
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * @return the fine
     */
    public Double getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(Double fine) {
        this.fine = fine;
    }

    /**
     * @return the returnDetailDtos
     */
    public ArrayList<ReturnDetailDto> getReturnDetailDtos() {
        return returnDetailDtos;
    }

    /**
     * @param returnDetailDtos the returnDetailDtos to set
     */
    public void setReturnDetailDtos(ArrayList<ReturnDetailDto> returnDetailDtos) {
        this.returnDetailDtos = returnDetailDtos;
    }

    @Override
    public String toString() {
        return "ReturnDto{" + "returnId=" + returnId + ", date=" + date + ", MemberId=" + MemberId + ", fine=" + fine + ", returnDetailDtos=" + returnDetailDtos + '}';
    }
}