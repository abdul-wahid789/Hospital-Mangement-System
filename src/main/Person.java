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
public class Person extends Login implements Serializable {

    private String name;
    private String age;
    private String gender;
    private String address;
    private String maritial;
    private String phone;
    private String blood;

    public Person(String name, String age, String gender, String address, String maritial, String phone, String blood, String username, String password) {
        super(username, password);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.maritial = maritial;
        this.phone = phone;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaritial() {
        return maritial;
    }

    public void setMaritial(String maritial) {
        this.maritial = maritial;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

}
