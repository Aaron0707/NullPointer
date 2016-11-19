package com.NullPointer.Models.Base;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aaron on 11/18/16.
 */

@MappedSuperclass
public class BaseModel implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false)
    private long ID;

    private String updateTime;

    private String createTime;

    private String updateMark;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateMark() {
        return updateMark;
    }

    public void setUpdateMark(String updateMark) {
        this.updateMark = updateMark;
    }
}
