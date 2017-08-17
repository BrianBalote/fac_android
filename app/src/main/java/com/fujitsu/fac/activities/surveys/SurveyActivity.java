package com.fujitsu.fac.activities.surveys;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.fujitsu.fac.R;
import com.fujitsu.fac.domain.Survey;
import com.fujitsu.fac.services.EventService;

import java.util.ArrayList;
import java.util.List;

import roboguice.activity.RoboListActivity;
import roboguice.inject.InjectView;

public class SurveyActivity extends RoboListActivity {

    @InjectView(R.id.back_button)
    private View backBtn;

    @InjectView(R.id.submit_button)
    private View submitBtn;

    private Dialog surveyQuestionsDialog = null;

    private List<Survey> surveyList = null;
    private List<String> surveyAnswerList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        surveyList = EventService.getInstance().getCurrentEvent().getSurveyList();

        surveyAnswerList = new ArrayList<String>();
        for(int i=0; i<surveyList.size(); i++) {
            surveyAnswerList.add("");
        }

        System.out.println("+++ "+surveyList.size());
        System.out.println("+++ "+surveyAnswerList);

        SurveyListAdapter surveyListAdapter = new SurveyListAdapter(R.layout.list_row_surveys, surveyList);
        this.setListAdapter(surveyListAdapter);

        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        this.submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("+++ SUBMIT CLICKED");

                System.out.println("+++ "+surveyAnswerList);
            }
        });
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(
                SurveyActivity.this);
        dialogBuilder.setView(prepareDialogCustomView(position));
        this.surveyQuestionsDialog = dialogBuilder.create();
        this.surveyQuestionsDialog.show();
    }

    private View prepareDialogCustomView(int position) {

        View v = (View) getLayoutInflater().inflate(
                R.layout.dialog_survey_questions, null);

        final SurveyAnswersListAdapter surveyAnswersListAdapter
                = new SurveyAnswersListAdapter(R.layout.list_row_survey_choices, this.surveyList.get(position).getChoices());

        ListView lv = (ListView) v.findViewById(R.id.item_type_list_view);
        lv.setAdapter(surveyAnswersListAdapter);

        View dialogBottomBar = (View) v.findViewById(R.id.dialog_bottom_bar);
        dialogBottomBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SurveyActivity.this.surveyQuestionsDialog.dismiss();
            }
        });


        return v;
    }

    private class SurveyAnswersListAdapter extends BaseAdapter {

        private int viewResourceId;
        private List<String> surveyChoicesList;
        private RadioButton selectedRadioButton = null;

        public SurveyAnswersListAdapter(int viewResourceId, List<String> surveyAnswersList) {
            this.viewResourceId = viewResourceId;
            this.surveyChoicesList = surveyAnswersList;
        }

        @Override
        public int getCount() {
            return surveyChoicesList.size();
        }

        @Override
        public Object getItem(int position) {
            return surveyChoicesList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView,
                            ViewGroup parent) {
            View row = convertView;
            final MyPlaceHolder holder;

            if (row == null) {

                LayoutInflater inflater = (LayoutInflater) SurveyActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(this.viewResourceId, parent, false);
                holder = new MyPlaceHolder();

                holder.radioSurveyAnswer = (RadioButton) row.findViewById(R.id.radio_survey);

                row.setTag(holder);
            } else {
                holder = (MyPlaceHolder) row.getTag();
            }

            final String s = surveyChoicesList.get(position);

            if (position == getCount() - 1) {
                if (selectedRadioButton == null) {
                    holder.radioSurveyAnswer.setChecked(false);
                    //selectedRadioButton = holder.radioSurveyAnswer;
                }
            }

            holder.radioSurveyAnswer.setText(s);
            holder.radioSurveyAnswer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (selectedRadioButton != null) {
                        selectedRadioButton.setChecked(false);
                    }
                    holder.radioSurveyAnswer.setChecked(true);
                    selectedRadioButton = holder.radioSurveyAnswer;
                    surveyAnswerList.set(position, holder.radioSurveyAnswer.getText().toString());
                }
            });

            return row;
        }

        class MyPlaceHolder {
            RadioButton radioSurveyAnswer;
        }
    }

    private class SurveyListAdapter extends BaseAdapter {

        private int viewResourceId;
        private List<Survey> surveyList;

        public SurveyListAdapter(int viewResourceId, List<Survey> surveyList) {
            this.viewResourceId = viewResourceId;
            this.surveyList = surveyList;
        }

        @Override
        public int getCount() {
            return surveyList.size();
        }

        @Override
        public Object getItem(int position) {
            return surveyList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView,
                            ViewGroup parent) {
            View row = convertView;
            MyPlaceHolder holder = null;

            if (row == null) {

                LayoutInflater inflater = (LayoutInflater) SurveyActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(this.viewResourceId, parent, false);
                holder = new MyPlaceHolder();

                holder.textQuestion = (TextView) row.findViewById(R.id.text_question);

                row.setTag(holder);
            } else {
                holder = (MyPlaceHolder) row.getTag();
            }

            final Survey s = surveyList.get(position);

            holder.textQuestion.setText(s.getQuestion());

            return row;
        }

        class MyPlaceHolder {
            TextView textQuestion;
        }
    }
}
