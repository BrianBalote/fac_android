package com.fujitsu.fac.services;

import com.fujitsu.fac.domain.Survey;

import java.util.List;

/**
 * Created by b.balote on 8/17/2017.
 */

public class SurveyService {

    private static SurveyService instance = null;

    private List<Survey> surveyList;

    private  SurveyService() {
    }

    public static SurveyService getInstance() {

        if(instance == null) {
            instance = new SurveyService();
        }

        return instance;
    }

    public List<Survey> getSurveyList() {
        return surveyList;
    }

    public void setSurveyList(List<Survey> surveyList) {
        this.surveyList = surveyList;
    }
}
