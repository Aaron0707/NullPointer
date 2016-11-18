package com.NullPointer.Models.Base;


import com.NullPointer.CoreDefine.coreDefine;

import javax.persistence.Column;
import javax.persistence.Transient;

/**
 * Created by Aaron on 11/18/16.
 */

enum Gender{
    male(0),female(1);

    private int n_code;

    private Gender(int n_code){
        this.n_code = n_code;
    }
}

public class Person extends BaseModel {
    private String      firstName;
    private String      lastName;
    private String      email;
    private Integer     age;
    private Gender      gender;
    private String      birthday;
    private String      profilePhotoUrl;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }
}
