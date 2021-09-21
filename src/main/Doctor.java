package main;

import java.io.Serializable;

public class Doctor extends Person implements Serializable{

   private String qualification;
   private String specialization;
   private String joinningDate;
   private String leavingDate;

    public Doctor(String qualification, String specialization, String joinningDate, String leavingDate, String name, String age, String gender, String address, String maritial, String phone, String blood, String username, String password) {
        super(name, age, gender, address, maritial, phone, blood, username, password);
        this.qualification = qualification;
        this.specialization = specialization;
        this.joinningDate = joinningDate;
        this.leavingDate = leavingDate;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getJoinningDate() {
        return joinningDate;
    }

    public void setJoinningDate(String joinningDate) {
        this.joinningDate = joinningDate;
    }

    public String getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(String leavingDate) {
        this.leavingDate = leavingDate;
    }

   

}