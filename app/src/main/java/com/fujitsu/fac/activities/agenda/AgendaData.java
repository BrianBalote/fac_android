package com.fujitsu.fac.activities.agenda;

import com.fujitsu.fac.domain.Agenda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by b.balote on 9/18/2017.
 */

public class AgendaData {

    private List<Agenda> agendaList;

    public AgendaData() {
        this.initAgendaData();
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
        a2.setSpeakers("Speakers: Toshio Hirose, Raul Santiago, Alon Anthony Rejano, Craig Baty");
        a2.setDescription("Opening Speech by Toshio Hirose.\n\nKeynote talk about Human Centric Innovation and Digital Co-Creation by Craig Baty and Raul Santiago\n\nGuest Speech; Customer testimonial about Smart Factory by Fujitsu Die-Tech Corp.");
        this.agendaList.add(a2);

        Agenda a3 = new Agenda();
        a3.setName("Lunch");
        a3.setDate("Oct 10, 2017");
        a3.setStartTime("11:10 AM");
        a3.setEndTime("to 12:30 PM");
        a3.setSpeakers("Speakers: n/a");
        a3.setDescription("Location: ?");
        this.agendaList.add(a3);

        Agenda a4 = new Agenda();
        a4.setName("Business Session");
        a4.setDate("Oct 10, 2017");
        a4.setStartTime("12:30 PM");
        a4.setEndTime("to 03:30 PM");
        a4.setSpeakers("Speakers: Alfee Lee, Ryuichi Senoo, Vasudevan Venkatakrishnan, Byung Mo Chung");
        a4.setDescription("Topics are: Internet of Things (IoT), Cyber Security and Mobility.");
        this.agendaList.add(a4);
    }

    public List<Agenda> getAgendaList() {
        return agendaList;
    }

    public void setAgendaList(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }
}
