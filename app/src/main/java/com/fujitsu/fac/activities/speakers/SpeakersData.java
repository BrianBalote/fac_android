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

        this.speakerList = new ArrayList<Speaker>(11);

        Speaker s1 = new Speaker();
        s1.setName("Toshio Hirose");
        s1.setPosition("Head of Asia Region");
        s1.setCompany("Fujitsu Limited");
        s1.setImageSrc("toshio_hirose.png");
        this.speakerList.add(s1);

        /*
        Speaker s2 = new Speaker();
        s2.setName("Hiroshi Nishikawa");
        s2.setPosition("Director Marketing Strategy");
        s2.setCompany("Fujitsu Limited");
        this.speakerList.add(s2);
        */

        Speaker s3 = new Speaker();
        s3.setName("Raul Santiago");
        s3.setPosition("Country President");
        s3.setCompany("Fujitsu Philippines, Inc.");
        s3.setImageSrc("raul_santiago.png");
        this.speakerList.add(s3);

        Speaker s4 = new Speaker();
        s4.setName("Alon Anthony Rejano");
        s4.setPosition("Market Analyst");
        s4.setCompany("IDC Philippines");
        s4.setImageSrc("alon_anthony_rejano.png");
        this.speakerList.add(s4);

        Speaker s5 = new Speaker();
        s5.setName("Craig Baty");
        s5.setPosition("VP International Marketing & Digital Services Business");
        s5.setCompany("Fujitsu Limited");
        s5.setImageSrc("craig_baty.png");
        this.speakerList.add(s5);

        Speaker s6 = new Speaker();
        s6.setName("Danilo Sadio");
        s6.setPosition("Senior Manager, Manufacturing");
        s6.setCompany("Fujitsu Die Tech Corp");
        s6.setImageSrc("danilo_sadio.png");
        this.speakerList.add(s6);

        Speaker s7 = new Speaker();
        s7.setName("Sherwin Pastolero");
        s7.setPosition("Manager, Assembly");
        s7.setCompany("Fujitsu Die Tech Corp");
        s7.setImageSrc("sherwin_pastolero.png");
        this.speakerList.add(s7);

        Speaker s8 = new Speaker();
        s8.setName("Alfee Lee");
        s8.setPosition("VP Offering Development");
        s8.setCompany("Fujitsu Asia PTE LTD");
        s8.setImageSrc("alfee_lee.png");
        this.speakerList.add(s8);

        Speaker s9 = new Speaker();
        s9.setName("Ryuichi Senoo");
        s9.setPosition("VP Offering Development");
        s9.setCompany("Fujitsu Limited");
        s9.setImageSrc("ryuichi_senoo.png");
        this.speakerList.add(s9);

        Speaker s10 = new Speaker();
        s10.setName("Vasudevan Venkatakrishnan");
        s10.setPosition("Business Developmnent - AP");
        s10.setCompany("Ruckus Wireless");
        s10.setImageSrc("vasudevan_venkatakrishnan.png");
        this.speakerList.add(s10);

        Speaker s11 = new Speaker();
        s11.setName("Byung Mo Chung");
        s11.setPosition("Senior Consultant");
        s11.setCompany("Fujitsu Asia PTE LTD");
        s11.setImageSrc("byung_mo_chung.png");
        this.speakerList.add(s11);
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }
}
