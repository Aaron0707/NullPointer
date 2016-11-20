package com.NullPointer.Models.CoreItem;

import com.NullPointer.Models.Base.BaseModel;

import javax.persistence.Entity;

/**
 * Created by Aaron on 11/19/16.
 * Email: aaronyang.memory@gmail.com
 */
@Entity
public class Team extends BaseModel {
    private String  title;
    private String  avater;
    private String  description;
    private Double  teamRating;
    private long    leaderId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTeamRating() {
        return teamRating;
    }

    public void setTeamRating(Double teamRating) {
        this.teamRating = teamRating;
    }

    public long getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(long leaderId) {
        this.leaderId = leaderId;
    }
}
