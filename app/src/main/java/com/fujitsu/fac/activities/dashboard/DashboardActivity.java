package com.fujitsu.fac.activities.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fujitsu.fac.R;
import com.fujitsu.fac.activities.map.MapActivity;
import com.fujitsu.fac.activities.agenda.AgendaActivity;
import com.fujitsu.fac.activities.faqs.FaqsActivity;
import com.fujitsu.fac.activities.questions.QuestionsActivity;
import com.fujitsu.fac.activities.social.SocialActivity;
import com.fujitsu.fac.activities.speakers.SpeakersActivity;
import com.fujitsu.fac.activities.sponsors.SponsorsActivity;
import com.fujitsu.fac.activities.surveys.SurveyActivity;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class DashboardActivity extends RoboActivity {

    @InjectView(R.id.agenda_btn)
    private View agendaBtn;

    @InjectView(R.id.speakers_btn)
    private View speakersBtn;

    @InjectView(R.id.sponsors_btn)
    private View sponsorsBtn;

    @InjectView(R.id.social_btn)
    private View socialBtn;

    @InjectView(R.id.faqs_btn)
    private View faqsBtn;

    @InjectView(R.id.feedback_btn)
    private View feedbackBtn;

    @InjectView(R.id.survey_btn)
    private View surveyBtn;

    @InjectView(R.id.settings_btn)
    private View settingsBtn;

    @InjectView(R.id.map_btn)
    private View mapBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        this.agendaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, AgendaActivity.class);
                startActivity(intent);
                System.out.println("+++ agenda btn clicked");
            }
        });

        this.speakersBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, SpeakersActivity.class);
                startActivity(intent);
                System.out.println("+++ speaker btn clicked");
            }
        });

        this.sponsorsBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, SponsorsActivity.class);
                startActivity(intent);
                System.out.println("+++ sponsor btn clicked");
            }
        });

        this.socialBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, SocialActivity.class);
                startActivity(intent);
                System.out.println("+++ social btn clicked");
            }
        });

        this.faqsBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, FaqsActivity.class);
                startActivity(intent);
                System.out.println("+++ faqs btn clicked");
            }
        });

        this.feedbackBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, QuestionsActivity.class);
                startActivity(intent);
                System.out.println("+++ feedback btn clicked");
            }
        });

        this.surveyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, SurveyActivity.class);
                startActivity(intent);
                System.out.println("+++ survey btn clicked");
            }
        });

        this.settingsBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO
                System.out.println("+++ sestings btn clicked");
            }
        });

        this.mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, MapActivity.class);
                startActivity(intent);
                System.out.println("+++ survey btn clicked");
            }
        });
    }

}
