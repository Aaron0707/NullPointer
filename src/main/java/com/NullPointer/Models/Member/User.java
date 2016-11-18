package com.NullPointer.Models.Member;

import com.NullPointer.Models.Base.Person;

import javax.persistence.Entity;

/**
 * Created by Aaron on 11/18/16.
 */

enum AccountType {
    INDIVIDUAL(0), ENTERPRISE(1);
    private int n_code;

    AccountType(int n_code) {
        this.n_code = n_code;
    }
}

@Entity
public class User extends Person {
    private String          account;
    private String          passWord;
    private LanguageType    languageType;
    private AccountType     accountType;
    private boolean         isEngineer;
    private long            engineerId;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public LanguageType getLanguageType() {
        return languageType;
    }

    public void setLanguageType(LanguageType languageType) {
        this.languageType = languageType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public boolean isEngineer() {
        return isEngineer;
    }

    public void setEngineer(boolean engineer) {
        isEngineer = engineer;
    }

    public long getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(long engineerId) {
        this.engineerId = engineerId;
    }
}
