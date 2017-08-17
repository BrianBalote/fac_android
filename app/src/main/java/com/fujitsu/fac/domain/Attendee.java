package com.fujitsu.fac.domain;

/**
 * Created by b.balote on 8/3/2017.
 */

public class Attendee {

    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String company = "";
    private String position = "";
    private String phone = "";
    private String role = "";

    public Attendee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("firstName: ");
        sb.append(firstName);

        sb.append(" | lastName: ");
        sb.append(lastName);

        sb.append(" | email: ");
        sb.append(email);

        sb.append(" | companyName: ");
        sb.append(company);

        sb.append(" | position: ");
        sb.append(position);

        sb.append(" | phoneNumber: ");
        sb.append(phone);

        sb.append(" | role: ");
        sb.append(role);

        return sb.toString();

    }
}
