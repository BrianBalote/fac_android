package com.fujitsu.fac.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by balote on 15/08/2017.
 */

public class Survey {

    private String question;
    private List<String> choices;

    public Survey() {
    }

    public Survey(boolean test, int numberOfAnswers) {
        this.question = "Question: ";
        this.choices = new ArrayList<String>(numberOfAnswers);
        for (int i = 0; i < numberOfAnswers; i++) {
            this.choices.add(Integer.toString(i));
        }
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }
}
