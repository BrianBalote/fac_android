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

        initAgendaData();

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

    private void initAgendaData() {
        this.agendaList = new ArrayList<Agenda>();

        Agenda a1 = new Agenda();
        a1.setName("Registration");
        a1.setDate("Oct 10, 2017");
        a1.setStartTime("09:00 AM");
        a1.setSpeakers("Speakers: n/a");
        a1.setDescription("To be done at 2F Rizal Ballroom B.");
        this.agendaList.add(a1);

        Agenda a2 = new Agenda();
        a2.setName("Conference");
        a2.setDate("Oct 10, 2017");
        a2.setStartTime("10:00 AM");
        a2.setEndTime("to 10:40 AM");
        a2.setSpeakers("Speakers: Toshio Hirose, Hiroshi Nishikawa, Raul Santiago");
        a2.setDescription("Opening Speech by Toshio Hirose.\n\nKeynote talk about Human Centric Innovation and Digital Co-Creation by Hiroshi Nishikawa and Raul Santiago\n\nGuest Speech; Customer testimonial about Smart Factory by Fujitsu Die-Tech Corp.");
        this.agendaList.add(a2);

        Agenda a3 = new Agenda();
        a3.setName("CEO Lunch");
        a3.setDate("Oct 10, 2017");
        a3.setStartTime("11:00 AM");
        a3.setSpeakers("Speakers: n/a");
        a3.setDescription("Location: ?");
        this.agendaList.add(a3);

        Agenda a4 = new Agenda();
        a4.setName("Business Session");
        a4.setDate("Oct 10, 2017");
        a4.setStartTime("01:00 PM");
        a4.setStartTime("to 03:30 PM");
        a4.setSpeakers("Speakers: n/a");
        a4.setDescription("Topics are: Internet of Things (IoT), Cyber Security and Mobility.");
        this.agendaList.add(a4);
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
