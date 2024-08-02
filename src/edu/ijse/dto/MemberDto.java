/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author USER
 */
public class MemberDto {
   private String MemberId;
     private String Title;
    private String Name;
    private String Dob;
      private String Address;
        private String City;
          private String PostalCode;
   
   
     public  MemberDto() {
    }

    public  MemberDto(String MemberId,String Title,String Name,String Dob,String Address,String City,String PostalCode) {
        this.MemberId= MemberId;
        this.Title=Title;
        this.Name= Name;
        this.Dob = Dob;
        this.Address = Address;
        this.City = City;
        this.PostalCode=PostalCode;
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
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Dob
     */
    public String getDob() {
        return Dob;
    }

    /**
     * @param Dob the Dob to set
     */
    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City the City to set
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return the PostalCode
     */
    public String getPostalCode() {
        return PostalCode;
    }

    /**
     * @param PostalCode the PostalCode to set
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    @Override
    public String toString() {
        return "MemberDto{" + "MemberId=" + MemberId + ", Title=" + Title + ", Name=" + Name + ", Dob=" + Dob + ", Address=" + Address + ", City=" + City + ", PostalCode=" + PostalCode + '}';
    }

}