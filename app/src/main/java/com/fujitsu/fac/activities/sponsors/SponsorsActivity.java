package com.fujitsu.fac.activities.sponsors;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fujitsu.fac.R;
import com.fujitsu.fac.domain.Sponsor;
import com.fujitsu.fac.font.RobotoFontUtil;
import com.fujitsu.fac.services.EventService;

import java.util.List;

import roboguice.activity.RoboListActivity;
import roboguice.inject.InjectView;

public class SponsorsActivity extends RoboListActivity {

    @InjectView(R.id.back_button)
    private View backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        List<Sponsor> sponsorsList = EventService.getInstance().getCurrentEvent().getSponsorList();

        SponsorsListAdapter sponsorsListAdapter = new SponsorsListAdapter(R.layout.list_row_sponsors, sponsorsList);
        this.setListAdapter(sponsorsListAdapter);

        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private class SponsorsListAdapter extends BaseAdapter {

        private int viewResourceId;
        private List<Sponsor> sponsorsList;

        public SponsorsListAdapter(int viewResourceId, List<Sponsor> sponsorsList) {
            this.viewResourceId = viewResourceId;
            this.sponsorsList = sponsorsList;
        }

        @Override
        public int getCount() {
            return sponsorsList.size();
        }

        @Override
        public Object getItem(int position) {
            return sponsorsList.get(position);
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

                LayoutInflater inflater = (LayoutInflater) SponsorsActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(this.viewResourceId, parent, false);
                holder = new MyPlaceHolder();

                holder.imgPortrait = (ImageView) row.findViewById(R.id.img_portrait);
                holder.textName = (TextView) row.findViewById(R.id.text_name);
                holder.textDescription = (TextView) row.findViewById(R.id.text_description);

                row.setTag(holder);
            } else {

                holder = (MyPlaceHolder) row.getTag();
            }

            final Sponsor s = sponsorsList.get(position);

            holder.textName.setText(s.getName());
            holder.textDescription.setText(s.getDescription());

            holder.textName.setTypeface(RobotoFontUtil.getRobotoLightFont(SponsorsActivity.this));
            holder.textDescription.setTypeface(RobotoFontUtil.getRobotoLightFont(SponsorsActivity.this));

            return row;
        }

        class MyPlaceHolder {

            ImageView imgPortrait;
            TextView textName;
            TextView textDescription;
        }
    }

}
