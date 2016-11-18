package com.NullPointer.Models.Member;

import com.NullPointer.Models.Base.BaseModel;
import com.NullPointer.Models.Base.Person;

import javax.persistence.Entity;

/**
 * Created by Aaron on 11/18/16.
 */

enum LanguageType{

    JAVA(0),GO(1),HTML(2),JAVASCRIPT(3),CSS(4),NOTEJS(5),OBJECT_C(6),SWIFT(7),PHP(8);

    private int n_code;

    LanguageType(int n_code) {
        this.n_code = n_code;
    }
}

enum workType{

    APPLE_APP(0),ANDROID_APP(1),WEB_DESIGN(2),DATABASE_DESIGN(3),SYSTEM_DESIGN(4);

    private int n_code;

    workType(int n_code) {
        this.n_code = n_code;
    }
}
@Entity
public class Engineer extends BaseModel{
    private LanguageType    languageType;
    private workType        workType;
    private workType        bastWork;

    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    public com.NullPointer.Models.Member.workType getWorkType() {
        return workType;
    }

    public void setWorkType(com.NullPointer.Models.Member.workType workType) {
        this.workType = workType;
    }

    public com.NullPointer.Models.Member.workType getBastWork() {
        return bastWork;
    }

    public void setBastWork(com.NullPointer.Models.Member.workType bastWork) {
        this.bastWork = bastWork;
    }
}
