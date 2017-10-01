package com.fujitsu.fac.domain;

/**
 * Created by b.balote on 8/3/2017.
 */

public class Attendee {

    private String name = "";
    private String email = "";
    private String company = "";
    private String position = "";
    private String phone = "";
    private String mobile = "";

    public Attendee() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("name: ");
        sb.append(name);

        sb.append(" | email: ");
        sb.append(email);

        sb.append(" | companyName: ");
        sb.append(company);

        sb.append(" | position: ");
        sb.append(position);

        sb.append(" | phoneNumber: ");
        sb.append(phone);

        return sb.toString();

    }
}
