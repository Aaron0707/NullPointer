package com.NullPointer.Models.CoreItem;

import com.NullPointer.Models.Base.BaseModel;

import javax.persistence.Entity;

/**
 * Created by Aaron on 11/19/16.
 */
@Entity
public class OpenProject extends BaseModel {
    private String  title;
    private String  description;
    private String  doucumentAddress;
    private String  photoAddress1;
    private String  photoAddress2;
    private String  photoAddress3;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDoucumentAddress() {
        return doucumentAddress;
    }

    public void setDoucumentAddress(String doucumentAddress) {
        this.doucumentAddress = doucumentAddress;
    }

    public String getPhotoAddress1() {
        return photoAddress1;
    }

    public void setPhotoAddress1(String photoAddress1) {
        this.photoAddress1 = photoAddress1;
    }

    public String getPhotoAddress2() {
        return photoAddress2;
    }

    public void setPhotoAddress2(String photoAddress2) {
        this.photoAddress2 = photoAddress2;
    }

    public String getPhotoAddress3() {
        return photoAddress3;
    }

    public void setPhotoAddress3(String photoAddress3) {
        this.photoAddress3 = photoAddress3;
    }
}
