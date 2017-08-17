package com.fujitsu.fac.domain;

/**
 * Created by b.balote on 8/7/2017.
 */

public class Sponsor {

    private String name;
    private String description;

    public Sponsor() {
    }

    public Sponsor(boolean test) {
        this.name = "Sponsor Name";
        this.description = "Description: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
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
}
