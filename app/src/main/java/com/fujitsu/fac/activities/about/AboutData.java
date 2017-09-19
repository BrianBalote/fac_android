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
        this.initAboutList();
    }

    private void initAboutList() {
        this.aboutList = new ArrayList<>();

        About a1 = new About();
        a1.setAbout("About item 1");
        a1.setDetails("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.aboutList.add(a1);

        About a2 = new About();
        a2.setAbout("About item 2");
        a2.setDetails("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.aboutList.add(a2);

        About a3 = new About();
        a3.setAbout("About item 3");
        a3.setDetails("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.aboutList.add(a3);

        About a4 = new About();
        a4.setAbout("About item 4");
        a4.setDetails("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.aboutList.add(a4);

        About a5 = new About();
        a5.setAbout("About item 5");
        a5.setDetails("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.aboutList.add(a5);

        About a6 = new About();
        a6.setAbout("About item 6");
        a6.setDetails("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.aboutList.add(a6);

        About a7 = new About();
        a7.setAbout("About item 7");
        a7.setDetails("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.aboutList.add(a7);
    }

    public List<About> getAboutList() {
        return aboutList;
    }

    public void setAboutList(List<About> aboutList) {
        this.aboutList = aboutList;
    }
}
