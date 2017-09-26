package com.fujitsu.fac.domain;

/**
 * Created by b.balote on 8/4/2017.
 */

public class Agenda {

    private String name;
    private String time;
    private String speakers;
    private String description;

    public Agenda() {
        name = "";
        time = "";
        speakers = "";
        description = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpeakers() {
        return speakers;
    }

    public void setSpeakers(String speakers) {
        this.speakers = speakers;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
