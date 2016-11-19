package com.NullPointer.Models.Member;

import com.NullPointer.CoreDefine.CoreDefine.AccountType;
import com.NullPointer.Models.Base.Person;
import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Aaron on 11/18/16.
 */


@Entity
public class User extends Person {
    @NotNull
    @Column(unique = true)
    private String          account;
    @NotNull
    private String          password;
    private AccountType     accountType;
    private boolean         isEngineer;
    private long            engineerId;
    private boolean         isActive;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
