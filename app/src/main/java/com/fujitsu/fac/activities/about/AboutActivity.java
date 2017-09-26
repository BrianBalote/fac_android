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

        AboutListAdapter aboutListAdapter = new AboutListAdapter(R.layout.list_row_about, AboutData.getInstance().getAboutList());
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
            View row = convertView;
            MyPlaceHolder holder = null;

            if (row == null) {

                LayoutInflater inflater = (LayoutInflater) AboutActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(this.viewResourceId, parent, false);
                holder = new MyPlaceHolder();

                holder.textAbout = (TextView) row.findViewById(R.id.text_about);
                holder.textDetails = (TextView) row.findViewById(R.id.text_details);

                row.setTag(holder);

            } else {

                holder = (MyPlaceHolder) row.getTag();
            }

            final About f = aboutList.get(position);

            holder.textAbout.setText(f.getAbout());
            holder.textDetails.setText(f.getDetails());

            if(!TextUtils.isEmpty(f.getAbout())) {
                holder.textAbout.setVisibility(View.VISIBLE);
            }

            if(!TextUtils.isEmpty(f.getDetails())) {
                holder.textDetails.setVisibility(View.VISIBLE);
            }

            holder.textAbout.setTypeface(TypeFaceUtil.getFujitsuSansBold(AboutActivity.this));
            holder.textDetails.setTypeface(TypeFaceUtil.getFujitsuSansRegular(AboutActivity.this));

            return row;
        }

        class MyPlaceHolder {

            TextView textAbout;
            TextView textDetails;
        }
    }
}
