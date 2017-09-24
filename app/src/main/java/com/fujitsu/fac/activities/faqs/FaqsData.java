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

        this.faqList = new ArrayList<FAQ>(10);

        FAQ f1 = new FAQ();
        f1.setQuestion("1. What is Fujitsu World Tour 2017-Asia Conference Manila?");
        f1.setAnswer("Fujitsu World Tour 2017-Asia Conference Manila is Fujitsu’s annual event that takes place in" +
                "more than 30 countries around the world. It is now the 4 th run here in Manila. The event brings" +
                "customers, technology partners and Fujitsu in one place for opportunities to share and" +
                "collaborate new ideas pertaining to the power of ICT to change businesses and the world.");
        this.faqList.add(f1);

        FAQ f2 = new FAQ();
        f2.setQuestion("2. What is the theme of this year’s Fujitsu World Tour?");
        f2.setAnswer("This year’s theme is Human Centric Innovation: Digital Co-creation. Technologies such as" +
                "artificial intelligence (AI) and the Internet of Things (IoT) are starting to make digital" +
                "transformation a reality for businesses and society. Centered around data, collaboration" +
                "beyond the boundaries of sectors, industries, or countries has spread, generating innovative" +
                "services and business models. Fujitsu has long been committed to developing technologies for" +
                "business growth and society&#39;s advancement. We have also been cultivating expertise in diverse" +
                "operations together with our customers in a wide range of sectors throughout the world. By" +
                "leveraging such experience and knowledge, we will continue to strive to develop and advance" +
                "key technologies in the digital age, while also making digital transformation a reality together" +
                "with our customers, and creating new value through Co-creation.");
        this.faqList.add(f2);

        FAQ f3 = new FAQ();
        f3.setQuestion("3. Why should I attend FAC?" );
        f3.setAnswer("The conference will showcase the latest technologies, from IoT, security, mobility and cloud." +
                "Presentations by industry leaders and experts in their fields will help to shape the ideas and" +
                "plans that we can work on together to contribute to the future social and economic" +
                "development of the country and even the rest of Asia. It will be a great opportunity to meet and" +
                "collaborate with leaders from across the industries.");
        this.faqList.add(f3);

        FAQ f4 = new FAQ();
        f4.setQuestion("4. Who should attend FAC?");
        f4.setAnswer("If you are a person directly involved in the roadmap of your organizations to business" +
                "transformations through ICT, or if you have influence over it’s a direction by being a user of" +
                "technology, you are the right person to attend this event. Or you maybe just purely interested in" +
                "where technology is bringing the businesses and society of today and the near future, you are" +
                "more than welcome to come and join us.");
        this.faqList.add(f4);

        FAQ f5 = new FAQ();
        f5.setQuestion("5. Can I bring a colleague?");
        f5.setAnswer("Yes, as long as you are both pre-registered. Please ask your colleague to download the app" +
                "and register or he/she may call &lt;&lt;phone&gt;&gt; or email us at &lt;&lt;email&gt;&gt;. A confirmation call will be" +
                "made to you a few days before the event.");
        this.faqList.add(f5);

        FAQ f6 = new FAQ();
        f6.setQuestion("6. Can I walk in?");
        f6.setAnswer("This Event is by invitation only. Thus, all attendees should be pre-registered. While we will try" +
                "our best to accommodate everyone, there is no guarantee that we can allow walk ins to" +
                "participate as we need to prepare for event materials and the likes.");
        this.faqList.add(f6);

        FAQ f7 = new FAQ();
        f7.setQuestion("7. How do I register?");
        f7.setAnswer("You may e-mail us at fpi.marketing@fujitsu.com or Download the Fujitsu PH app available in" +
                "Apple Store and Google Play store.");
        this.faqList.add(f7);

        FAQ f8 = new FAQ();
        f8.setQuestion("8. Dress Code?");
        f8.setAnswer("Kindly come in business attire or smart casual. Please avoid wearing rubber shoes or collarless" +
                "shirts. You may also opt to come on your business uniforms if need be.");
        this.faqList.add(f8);

        FAQ f9 = new FAQ();
        f9.setQuestion("9. What should I bring with me?");
        f9.setAnswer("Please bring business card, at least 2 pcs because we will request to drop them for the raffle" +
                "draw at the end of the event. We however encourage to bring more as partner booth exhibitors" +
                "may request that you also leave your business cards with them for prizes and others.");
        this.faqList.add(f9);

        FAQ f10 = new FAQ();
        f10.setQuestion("10. Where is the venue of the event and what time do I need to be there?");
        f10.setAnswer("Registration opens at 9:00am. Customers may take a simple snack when they arrive and go" +
                "around the booth area. We will open the main conference at 10:00am. We expect to finish with" +
                "raffle prizes to be given to away to luck winners before 4:00pm.");
        this.faqList.add(f10);
    }

    public List<FAQ> getFaqList() {
        return faqList;
    }

}
