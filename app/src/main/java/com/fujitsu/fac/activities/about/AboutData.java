package com.fujitsu.fac.activities.about;

import com.fujitsu.fac.domain.About;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by b.balote on 9/18/2017.
 */

public class AboutData {

    private List<About> aboutList = null;

    public AboutData() {

        this.aboutList = new ArrayList<About>(5);

        About a1 = new About();
        a1.setAbout("Fujitsu Philippines, Inc. (FPI)");
        this.aboutList.add(a1);

        About a2 = new About();
        a2.setAbout("Corporate Profile");
        a2.setDetails("\nFujitsu Philippines Inc. (FPI) is one of the country’s leading Information and Communications Technology (ICT) system integrators. Our local knowledge comes from almost 40 years of operations in the Philippines, while our global expertise comes from our affiliation with Fujitsu Ltd. of Japan, an international leader in computers, telecommunication, electronic components, software and services.\n" +
                "\n" +
                "Originally established in 1975, the company has grown beyond its original mission of promoting, selling, and supporting the Fujitsu-branded computer hardware line, and has now recast itself as a complete one-stop- shop for ICT solutions and services.");
        this.aboutList.add(a2);

        About a3 = new About();
        a3.setAbout("Company Facts");
        a3.setDetails("\n" +
                "•\t Date Established: 1975\n\n" +
                "•\t One of the largest ICT Company in the Philippines.\n\n" +
                "•\t Business Focus:\n\n" +
                "•\t ICT Infrastructure Services\n\n" +
                "•\t Operation Support Solutions\n\n" +
                "•\t Managed Services / Support Services\n\n" +
                "•\t Number of Employees: Over 500\n\n" +
                "•\t Workforce comprised of 100+ engineers\n\n" +
                "•\t Process Aligned to International Quality Standards\n\n" +
                "•\t Quality Management System\n\n" +
                "•\t ISO 9001: 2008\n\n" +
                "•\t IT Service Management System\n\n" +
                "•\t ISO 20000:2005\n\n" +
                "•\t Information Security Management System\n\n" +
                "•\t ISO 27001:2005\n\n" +
                "•\t Philippine Offices Makati City (HQ)\n\n" +
                "•\t Established office in Cebu & Davao to support VizMin business\n\n" +
                "•\t Established office in Sta. Rosa to support business in the south");
        this.aboutList.add(a3);

        About a4 = new About();
        a4.setDetails("With over five hundred full-time Filipino technology professionals and more than 30 years of operations in the country, FPI is uniquely positioned to apply the best-of-breed technology solutions to assist its customers in solving complex business problems. By leveraging the collective expertise, experience, and work ethics of its workforce, FPI has an unmatched track record in designing, building, implementing, and maintaining ICT solutions, especially in difficult projects with complex technology architectures, nation-wide geographic scope, and tight implementation schedules.");
        this.aboutList.add(a4);

        About a5 = new About();
        a5.setAbout("FPI Partner Certifications");
        a5.setDetails("\nOur technology partners agree that FPI has a solid base of technical skills, experience, support infrastructure and processes for their products and solutions. We are continuously expanding our partnerships to better serve our clients.\n\n" +
                "•\tCisco GOLD Partner (Below are the Current Awards)\n" +
                "   o\tTop Services Provider Partner of the Year (7 consecutive Years)\n" +
                "   o\tTop Cisco Services Sales Partner of the Year (3 consecutive Years)\n" +
                "   o\tBest Completive WIN Partner\n\n" +
                "•\tF5 Gold Partner\n\n" +
                "•\tCheckpoint Gold Partner\n\n" +
                "•\tPalo Alto Platinum Partner\n\n" +
                "•\tMicrosoft GOLD Partner\n\n" +
                "•\tHP Premier Partner (Network)\n\n" +
                "•\tRuckus Wireless Gold/Top Dog Partner\n\n" +
                "•\tSolarwinds Platinum Reseller\n\n" +
                "•\tNetscout Tier 2 Reseller\n\n" +
                "•\tOracle Platinum Partner\n\n" +
                "•\tNetApp Star Partner");
        this.aboutList.add(a5);
    }

    public List<About> getAboutList() {
        return aboutList;
    }

}
