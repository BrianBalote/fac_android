package com.fujitsu.fac.activities.faqs;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.fujitsu.fac.R;
import com.fujitsu.fac.domain.FAQ;
import com.fujitsu.fac.font.RobotoFontUtil;
import com.fujitsu.fac.services.EventService;

import java.util.List;

import roboguice.activity.RoboListActivity;
import roboguice.inject.InjectView;

public class FaqsActivity extends RoboListActivity {

    @InjectView(R.id.back_button)
    private View backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        List<FAQ> faqList = EventService.getInstance().getCurrentEvent().getFaqList();

        FaqsListAdapter faqsListAdapter = new FaqsListAdapter(R.layout.list_row_faqs, faqList);
        this.setListAdapter(faqsListAdapter);

        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private class FaqsListAdapter extends BaseAdapter {

        private int viewResourceId;
        private List<FAQ> faqsList;

        public FaqsListAdapter(int viewResourceId,
                               List<FAQ> faqsList) {

            this.viewResourceId = viewResourceId;
            this.faqsList = faqsList;
        }

        @Override
        public int getCount() {
            return faqsList.size();
        }

        @Override
        public Object getItem(int position) {
            return faqsList.get(position);
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

                LayoutInflater inflater = (LayoutInflater) FaqsActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(this.viewResourceId, parent, false);
                holder = new MyPlaceHolder();

                holder.textQuestion = (TextView) row.findViewById(R.id.text_question);
                holder.textAnswer = (TextView) row.findViewById(R.id.text_answer);

                row.setTag(holder);

            } else {

                holder = (MyPlaceHolder) row.getTag();
            }

            final FAQ f = faqsList.get(position);

            holder.textQuestion.setText(f.getQuestion());
            holder.textAnswer.setText(f.getAnswer());

            holder.textQuestion.setTypeface(RobotoFontUtil.getRobotoLightFont(FaqsActivity.this));
            holder.textAnswer.setTypeface(RobotoFontUtil.getRobotoLightFont(FaqsActivity.this));

            return row;
        }

        class MyPlaceHolder {

            TextView textQuestion;
            TextView textAnswer;
        }
    }
}
