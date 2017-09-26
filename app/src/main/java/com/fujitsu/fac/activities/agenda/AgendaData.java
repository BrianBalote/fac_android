package com.fujitsu.fac.activities.agenda;

import com.fujitsu.fac.domain.Agenda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by b.balote on 9/18/2017.
 */

public class AgendaData {

    private List<Agenda> agendaList;

    private static AgendaData instance = null;

    public static AgendaData getInstance() {
        if(instance == null) {
            instance = new AgendaData();
        }
        return instance;
    }

    private AgendaData() {
        this.agendaList = new ArrayList<>(13);

        Agenda a1 = new Agenda();
        a1.setName("Registration");
        a1.setTime("09:00 AM");
        this.agendaList.add(a1);

        Agenda a2 = new Agenda();
        a2.setName("Main Conference");
        a2.setTime("10:00 AM to 11:30 AM");
        this.agendaList.add(a2);

        Agenda a3 = new Agenda();
        a3.setName("Opening Speech");
        a3.setSpeakers("\nSpeakers:");
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Toshio Hirose\n");
        sb1.append("Head of Asia Region\n");
        sb1.append("Fujitsu Limited\n\n");
        sb1.append("Raul Santiago\n");
        sb1.append("Country President\n");
        sb1.append("Fujitsu Philippines, Inc.");
        a3.setDescription(sb1.toString());
        this.agendaList.add(a3);

        Agenda a4 = new Agenda();
        a4.setName("Guest Speech\nIDC Analyst: Philippine ICT 2020 and Beyond");
        a4.setSpeakers("\nSpeaker:");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alon Anthony Rejano\n");
        sb2.append("IDC Philippines");
        a4.setDescription(sb2.toString());
        this.agendaList.add(a4);

        Agenda a5 = new Agenda();
        a5.setName("Keynote Message\nHuman Centric Innovation: Digital Co-creation");
        a5.setSpeakers("\nSpeaker:");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Craig Baty\n");
        sb3.append("VP International Marketing & Digital Services Business");
        sb3.append("Fujitsu Limited");
        a5.setDescription(sb3.toString());
        this.agendaList.add(a5);

        Agenda a6 = new Agenda();
        a6.setName("Guest Speech\nFujitsu Die-tech: A Journey to Smarter Factory");
        a6.setSpeakers("\nSpeakers:");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Danilo Sadio\n");
        sb4.append("Senior Manager, Manufacturing\n");
        sb4.append("Fujitsu Die Tech Corp\n\n");
        sb4.append("Sherwin Pastolero\n");
        sb4.append("Manager, Assembly\n");
        sb4.append("Fujitsu Die Tech Corp");
        a6.setDescription(sb4.toString());
        this.agendaList.add(a6);

        Agenda a7 = new Agenda();
        a7.setName("Lunch");
        a7.setTime("11:10 AM to 1:30 PM");
        this.agendaList.add(a7);

        Agenda a8 = new Agenda();
        a8.setName("Business Session");
        a8.setTime("1:30 PM to 03:30 PM");
        this.agendaList.add(a8);

        Agenda a9 = new Agenda();
        a9.setName("Internet of Things");
        a9.setSpeakers("\nSpeaker:");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Alfee Lee\n");
        sb5.append("VP Offering Development");
        sb5.append("Fujitsu ASIA PTE LTD");
        a9.setDescription(sb5.toString());
        this.agendaList.add(a9);

        Agenda a10 = new Agenda();
        a10.setName("Fujitsu Security Business");
        a10.setSpeakers("\nSpeaker:");
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Ryuichi Senoo\n");
        sb6.append("VP International Marketing & Digital Services Business\n");
        sb6.append("Fujitsu Limited");
        a10.setDescription(sb6.toString());
        this.agendaList.add(a10);

        Agenda a11 = new Agenda();
        a11.setName("Smart and Secure Mobility\nUnlocking New Business from Your Wireless Infrastructure");
        a11.setSpeakers("\nSpeaker:");
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Vasudevan Venkatakrishnan\n");
        sb7.append("Business Developmnent - APAC\n");
        sb7.append("Ruckus Wireless");
        a11.setDescription(sb7.toString());
        this.agendaList.add(a11);

        Agenda a12 = new Agenda();
        a12.setName("Hyper-converged Infra:\nPrimeflex & All-Flash Storage");
        a12.setSpeakers("\nSpeaker:");
        StringBuilder sb8 = new StringBuilder();
        sb8.append("Byung Mo Chung\n");
        sb8.append("Senior Consultant\n");
        sb8.append("Fujitsu ASIA PTE LTD");
        a12.setDescription(sb8.toString());
        this.agendaList.add(a12);

        Agenda a14 = new Agenda();
        a14.setName("Closing Remarks and Raffle Draw");
        a14.setTime("3:30 PM to 03:45 PM");
        this.agendaList.add(a14);
    }

    public List<Agenda> getAgendaList() {
        return agendaList;
    }

}
