package com.fujitsu.fac.activities.faqs;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.fujitsu.fac.R;
import com.fujitsu.fac.domain.FAQ;

import java.util.List;

public class FaqsActivity extends ListActivity {

    private View backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        backBtn = (View) findViewById(R.id.back_button);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        FaqsData faqsData = new FaqsData();

        FaqsListAdapter faqsListAdapter = new FaqsListAdapter(R.layout.list_row_faqs, faqsData.getFaqList());
        setListAdapter(faqsListAdapter);
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

            return row;
        }

        class MyPlaceHolder {

            TextView textQuestion;
            TextView textAnswer;
        }
    }
}
