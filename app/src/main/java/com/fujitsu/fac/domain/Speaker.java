package com.fujitsu.fac.domain;

/**
 * Created by b.balote on 8/7/2017.
 */

public class Speaker {

    private String name = "";
    private String company = "";
    private String position = "";
    private String bio = "";

    public Speaker() {
    }

    public Speaker(boolean forTesting) {
        this.name = "Firstname Lastname";
        this.company = "Company";
        this.position = "Position, ";
        this.bio = "Bio: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
