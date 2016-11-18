package com.NullPointer.Models.Base;


import javax.persistence.*;
import java.io.Serializable;
import com.NullPointer.CoreDefine.*;

/**
 * Created by Aaron on 11/18/16.
 */

@MappedSuperclass
public class BaseModel implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long ID;

    private String updateTime;

    private String creatTime;

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

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getUpdateMark() {
        return updateMark;
    }

    public void setUpdateMark(String updateMark) {
        this.updateMark = updateMark;
    }
}
