package com.NullPointer.Models.Member;

import com.NullPointer.Models.Base.BaseModel;
import com.NullPointer.Models.Base.Person;

import javax.persistence.Entity;
import com.NullPointer.CoreDefine.CoreDefine.*;
/**
 * Created by Aaron on 11/18/16.
 */

@Entity
public class Engineer extends BaseModel{
    private LanguageType    languageType;
    private WorkType        workType;
    private WorkType        bastWork;

    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public WorkType getBastWork() {
        return bastWork;
    }

    public void setBastWork(WorkType bastWork) {
        this.bastWork = bastWork;
    }
}
