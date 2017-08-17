package com.fujitsu.fac.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by b.balote on 8/4/2017.
 */

public class Agenda {

    private String name;
    private Date date;
    private Date startTime;
    private Date endTime;
    private List<Speaker> speakerList;
    private String description;

    public Agenda() {
    }

    public Agenda(boolean forTesting) {
        this.name = "Agenda Name";
        this.date = new Date(System.currentTimeMillis());
        this.startTime = new Date(System.currentTimeMillis());
        this.endTime = new Date(System.currentTimeMillis());
        this.description = "Agenda Descripton";
        this.speakerList = new ArrayList<Speaker>();
        for(int i=0; i<2; i++) {
            this.speakerList.add(new Speaker(true));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
