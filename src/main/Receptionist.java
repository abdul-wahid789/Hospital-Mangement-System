/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.Serializable;

/**
 *
 * @author Parvez
 */
public class Receptionist extends Person implements Serializable{
private String qualifiacation;
    private String joinningDate;
    private String leavingDate;

    public Receptionist(String qualifiacation, String joinningDate, String leavingDate, String name, String age, String gender, String address, String maritial, String phone, String blood, String username, String password) {
        super(name, age, gender, address, maritial, phone, blood, username, password);
        this.qualifiacation = qualifiacation;
        this.joinningDate = joinningDate;
        this.leavingDate = leavingDate;
    }

    public String getQualifiacation() {
        return qualifiacation;
    }

    public void setQualifiacation(String qualifiacation) {
        this.qualifiacation = qualifiacation;
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
