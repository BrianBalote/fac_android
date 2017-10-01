package com.fujitsu.fac.activities.questions;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.fujitsu.fac.R;
import com.fujitsu.fac.rest.QuestionRestService;
import com.fujitsu.fac.services.EmailPersistenceService;
import com.fujitsu.fac.utils.TypeFaceUtil;

public class QuestionsActivity extends ListActivity {

    private static final String[] topics = {"Ask something about the Opening Speech.",
            "Ask something about Human Centric Innovation.",
            "Ask something about Digital Co-Creation.",
            "Ask something about Smart Factory.",
            "Ask something about Internet of Things (IoT).",
            "Ask something about Cyber Security.",
            "Ask something about Mobility.",
            "Inquire about Fujitsu's Products and Services",
            "Other questions or requests."};

    private View backBtn;

    private LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        backBtn = (View) findViewById(R.id.back_button);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        inflater = (LayoutInflater) QuestionsActivity.this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        QuestionListAdapter questionListAdapter = new QuestionListAdapter(R.layout.list_row_question_topic, topics);
        setListAdapter(questionListAdapter);
    }

    private class QuestionListAdapter extends BaseAdapter {

        private int viewResourceId;
        private String[] topicArr;

        public QuestionListAdapter(int viewResourceId,
                                   String[] topicArr) {
            this.viewResourceId = viewResourceId;
            this.topicArr = topicArr;
        }

        @Override
        public int getCount() {
            return topicArr.length;
        }

        @Override
        public Object getItem(int position) {
            return topicArr[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView,
                            ViewGroup parent) {

            convertView = inflater.inflate(this.viewResourceId, parent, false);

            TextView textTopic = (TextView) convertView.findViewById(R.id.text_topic);
            textTopic.setText(topicArr[position]);
            textTopic.setTypeface(TypeFaceUtil.getFujitsuSansMedium(QuestionsActivity.this));

            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showDialog(topicArr[position]);
                }
            });

            return convertView;
        }

    }

    private void showDialog(String title) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);

        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        input.setLines(2);
        builder.setView(input);

        builder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String question = input.getText().toString();

                QuestionRestService questionRestService = new QuestionRestService();
                questionRestService.postQuestion(EmailPersistenceService.getEmail(QuestionsActivity.this), question);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }
}
