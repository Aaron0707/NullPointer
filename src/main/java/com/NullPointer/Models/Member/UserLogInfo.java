package com.NullPointer.Models.Member;

import com.NullPointer.Models.Base.BaseModel;

/**
 * Created by Aaron on 11/20/16.
 *
 * Email: aaronyang.memory@gmail.com
 * =======================================================
 */
public class UserLogInfo extends BaseModel {
    private User    user;
    private String  token;
    private String  expire;
    private String  platform;
    private String  ipAddress;
    private boolean isSuccess;
    private String  statMessage;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getStatMessage() {
        return statMessage;
    }

    public void setStatMessage(String statMessage) {
        this.statMessage = statMessage;
    }
}
