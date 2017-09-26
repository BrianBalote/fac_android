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
import com.fujitsu.fac.activities.about.AboutActivity;
import com.fujitsu.fac.domain.FAQ;
import com.fujitsu.fac.utils.TypeFaceUtil;

import java.util.List;

public class FaqsActivity extends ListActivity {

    private View backBtn;

    private LayoutInflater inflater;

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

        inflater = (LayoutInflater) FaqsActivity.this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        FaqsListAdapter faqsListAdapter = new FaqsListAdapter(R.layout.list_row_faqs, FaqsData.getInstance().getFaqList());
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

            convertView = inflater.inflate(this.viewResourceId, parent, false);

            TextView textQuestion = (TextView) convertView.findViewById(R.id.text_question);
            TextView textAnswer = (TextView) convertView.findViewById(R.id.text_answer);

            textQuestion.setTypeface(TypeFaceUtil.getFujitsuSansBold(FaqsActivity.this));
            textAnswer.setTypeface(TypeFaceUtil.getFujitsuSansMedium(FaqsActivity.this));

            final FAQ f = faqsList.get(position);

            StringBuilder sb = new StringBuilder();
            sb.append(f.getQuestion());
            sb.append("\n");

            textQuestion.setText(sb.toString());
            textAnswer.setText(f.getAnswer());

            return convertView;
        }

    }
}
