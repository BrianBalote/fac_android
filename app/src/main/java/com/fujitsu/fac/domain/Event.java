package com.fujitsu.fac.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by b.balote on 8/8/2017.
 */

public class Event {

    private String name;
    private Date startDate;
    private Date endDate;
    private String description;
    private List<Agenda> agendaList;
    private List<Speaker> speakerList;
    private List<Sponsor> sponsorList;
    private List<FAQ> faqList;
    private List<Survey> surveyList;

    public Event() {
    }

    public Event(boolean forTesting) {

        this.agendaList = new ArrayList<Agenda>();
        for(int i=0; i<10; i++) {
            this.agendaList.add(new Agenda(true));
        }

        this.speakerList = new ArrayList<Speaker>();
        for(int i=0; i<7;i ++) {
            this.speakerList.add(new Speaker(true));
        }

        this.sponsorList = new ArrayList<Sponsor>();
        for(int i=0; i<5; i++) {
            this.sponsorList.add(new Sponsor(true));
        }

        this.faqList = new ArrayList<FAQ>();
        for(int i=0; i<10; i++) {
            this.faqList.add(new FAQ(true));
        }

        this.surveyList = new ArrayList<Survey>();
        for(int i=0; i<7; i++) {
            this.surveyList.add(new Survey(true,3));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Agenda> getAgendaList() {
        return agendaList;
    }

    public void setAgendaList(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }

    public List<Sponsor> getSponsorList() {
        return sponsorList;
    }

    public void setSponsorList(List<Sponsor> sponsorList) {
        this.sponsorList = sponsorList;
    }

    public List<FAQ> getFaqList() {
        return faqList;
    }

    public void setFaqList(List<FAQ> faqList) {
        this.faqList = faqList;
    }

    public List<Survey> getSurveyList() {
        return surveyList;
    }

    public void setSurveyList(List<Survey> surveyList) {
        this.surveyList = surveyList;
    }
}
