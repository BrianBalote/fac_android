package com.fujitsu.fac.domain;

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
