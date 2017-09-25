package com.fujitsu.fac.activities.speakers;

import android.app.ListActivity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fujitsu.fac.R;
import com.fujitsu.fac.domain.Speaker;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SpeakersActivity extends ListActivity {

    private View backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speakers);

        backBtn = (View) findViewById(R.id.back_button);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        SpeakersListAdapter speakersListAdapter = new SpeakersListAdapter(R.layout.list_row_speakers, SpeakersData.getInstance().getSpeakerList());
        setListAdapter(speakersListAdapter);
    }

    private class SpeakersListAdapter extends BaseAdapter {

        private int viewResourceId;
        private List<Speaker> speakersList;

        public SpeakersListAdapter(int viewResourceId, List<Speaker> speakersList) {
            this.viewResourceId = viewResourceId;
            this.speakersList = speakersList;
        }

        @Override
        public int getCount() {
            return speakersList.size();
        }

        @Override
        public Object getItem(int position) {
            return speakersList.get(position);
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

                LayoutInflater inflater = (LayoutInflater) SpeakersActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(this.viewResourceId, parent, false);
                holder = new MyPlaceHolder();

                holder.imgPortrait = (ImageView) row.findViewById(R.id.img_portrait);
                holder.textName = (TextView) row.findViewById(R.id.text_name);
                holder.textPosition = (TextView) row.findViewById(R.id.text_position);
                holder.textCompany = (TextView) row.findViewById(R.id.text_company);
                holder.textBio = (TextView) row.findViewById(R.id.text_bio);

                row.setTag(holder);

            } else {

                holder = (MyPlaceHolder) row.getTag();
            }

            final Speaker s = speakersList.get(position);

            holder.textName.setText(s.getName());
            holder.textPosition.setText(s.getPosition());
            holder.textCompany.setText(s.getCompany());
            holder.textBio.setText(s.getBio());

            if(s.getBio().length() <= 0) {
                holder.textBio.setVisibility(View.GONE);
            }

            Bitmap b = loadBitmapFromAssets(s.getImageSrc());
            holder.imgPortrait.setImageBitmap(b);

            return row;
        }

        class MyPlaceHolder {

            ImageView imgPortrait;
            TextView textName;
            TextView textPosition;
            TextView textCompany;
            TextView textBio;
        }
    }

    private Bitmap loadBitmapFromAssets(String imageName) {
        try {
            InputStream is = getAssets().open(imageName);
            Bitmap bitmap = BitmapFactory.decodeStream(is);
            is.close();
            return bitmap;
        }
        catch(IOException ex) {
            return null;
        }
    }

}
