package com.fujitsu.fac.activities.faqs;

import com.fujitsu.fac.domain.FAQ;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by b.balote on 9/18/2017.
 */

public class FaqsData {

    private List<FAQ> faqList;

    public FaqsData() {
        this.initFaqsData();
    }

    private void initFaqsData() {

        this.faqList = new ArrayList<FAQ>();

        FAQ f1 = new FAQ();
        f1.setQuestion("Q: What is FAC?");
        f1.setAnswer("A: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.faqList.add(f1);

        FAQ f2 = new FAQ();
        f2.setQuestion("Q: Why should I attend FAC?");
        f2.setAnswer("A: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.faqList.add(f2);

        FAQ f3 = new FAQ();
        f3.setQuestion("Q: Who should attend FAC?" );
        f3.setAnswer("A: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.faqList.add(f3);

        FAQ f4 = new FAQ();
        f4.setQuestion("Q: Can I bring a colleague?");
        f4.setAnswer("A: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.faqList.add(f4);

        FAQ f5 = new FAQ();
        f5.setQuestion("Q: Can I walk-in?");
        f5.setAnswer("A: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.faqList.add(f5);

        FAQ f6 = new FAQ();
        f6.setQuestion("Q: How do I register?");
        f6.setAnswer("A: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.faqList.add(f6);

        FAQ f7 = new FAQ();
        f7.setQuestion("Q: Dress Code?");
        f7.setAnswer("A: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.faqList.add(f7);

        FAQ f8 = new FAQ();
        f8.setQuestion("Q: What should I bring with me?");
        f8.setAnswer("A: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
        this.faqList.add(f8);
    }

    public List<FAQ> getFaqList() {
        return faqList;
    }

    public void setFaqList(List<FAQ> faqList) {
        this.faqList = faqList;
    }
}
