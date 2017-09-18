package com.fujitsu.fac.activities.speakers;

import com.fujitsu.fac.domain.Speaker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by b.balote on 9/18/2017.
 */

public class SpeakersData {

    private List<Speaker> speakerList = null;

    public SpeakersData() {
        this.initSpeakerList();
    }

    private void initSpeakerList() {

        this.speakerList = new ArrayList<Speaker>();

        Speaker s1 = new Speaker();
        s1.setName("Toshio Hirose");
        s1.setPosition("Head of Asia Region");
        s1.setCompany("Fujitsu Limited");
        this.speakerList.add(s1);

        Speaker s2 = new Speaker();
        s2.setName("Hiroshi Nishikawa");
        s2.setPosition("Director Marketing Strategy");
        s2.setCompany("Fujitsu Limited");
        this.speakerList.add(s2);

        Speaker s3 = new Speaker();
        s3.setName("Raul Santiago");
        s3.setPosition("Country President");
        s3.setCompany("Fujitsu Philippines, Inc.");
        this.speakerList.add(s3);
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
