package com.fujitsu.fac.activities.about;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.fujitsu.fac.R;
import com.fujitsu.fac.domain.About;
import com.fujitsu.fac.utils.TypeFaceUtil;

import java.util.List;

public class AboutActivity extends ListActivity {

    private View backBtn;

    private LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        this.backBtn = (View) findViewById(R.id.back_button);
        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        inflater = (LayoutInflater) AboutActivity.this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        AboutListAdapter aboutListAdapter = new AboutListAdapter(R.layout.list_row_about,
                AboutData.getInstance().getAboutList());
        this.setListAdapter(aboutListAdapter);
    }

    private class AboutListAdapter extends BaseAdapter {

        private int viewResourceId;
        private List<About> aboutList;

        public AboutListAdapter(int viewResourceId,
                               List<About> aboutList) {

            this.viewResourceId = viewResourceId;
            this.aboutList = aboutList;
        }

        @Override
        public int getCount() {
            return aboutList.size();
        }

        @Override
        public Object getItem(int position) {
            return aboutList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView,
                            ViewGroup parent) {

            convertView = inflater.inflate(this.viewResourceId, parent, false);

            About f = aboutList.get(position);

            TextView textAbout = (TextView) convertView.findViewById(R.id.text_about);
            TextView textDetails = (TextView) convertView.findViewById(R.id.text_details);

            textAbout.setTypeface(TypeFaceUtil.getFujitsuSansBold(AboutActivity.this));
            textDetails.setTypeface(TypeFaceUtil.getFujitsuSansMedium(AboutActivity.this));

            textAbout.setText(f.getAbout());
            textDetails.setText(f.getDetails());

            if(TextUtils.isEmpty(f.getAbout())) {
                textAbout.setVisibility(View.GONE);
            }
            if(TextUtils.isEmpty(f.getDetails())) {
                textDetails.setVisibility(View.GONE);
            }
            return convertView;
        }
    }
}
