package com.fujitsu.fac.domain;

/**
 * Created by b.balote on 8/8/2017.
 */

public class FAQ {

    private String question;
    private String answer;

    public FAQ() {
    }

    public FAQ(boolean test) {
        this.question = "Q: Question?";
        this.answer = "A: Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
