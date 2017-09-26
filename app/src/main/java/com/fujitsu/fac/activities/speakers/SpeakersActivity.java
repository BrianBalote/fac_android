package com.fujitsu.fac.activities.speakers;

import android.app.ListActivity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fujitsu.fac.R;
import com.fujitsu.fac.domain.Speaker;
import com.fujitsu.fac.utils.TypeFaceUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SpeakersActivity extends ListActivity {

    private View backBtn;

    private LayoutInflater inflater;

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

        inflater = (LayoutInflater) SpeakersActivity.this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

            convertView = inflater.inflate(this.viewResourceId, parent, false);

            ImageView imgPortrait = (ImageView) convertView.findViewById(R.id.img_portrait);
            TextView textName = (TextView) convertView.findViewById(R.id.text_name);
            TextView textPosition = (TextView) convertView.findViewById(R.id.text_position);
            TextView textCompany = (TextView) convertView.findViewById(R.id.text_company);
            TextView textBio = (TextView) convertView.findViewById(R.id.text_bio);

            textName.setTypeface(TypeFaceUtil.getFujitsuSansBold(SpeakersActivity.this));
            textPosition.setTypeface(TypeFaceUtil.getFujitsuSansMedium(SpeakersActivity.this));
            textCompany.setTypeface(TypeFaceUtil.getFujitsuSansMedium(SpeakersActivity.this));
            textBio.setTypeface(TypeFaceUtil.getFujitsuSansMedium(SpeakersActivity.this));

            final Speaker s = speakersList.get(position);

            textName.setText(s.getName());
            textPosition.setText(s.getPosition());
            textCompany.setText(s.getCompany());
            textBio.setText(s.getBio());

            if(TextUtils.isEmpty(s.getPosition())) {
                textPosition.setVisibility(View.GONE);
            }
            if(TextUtils.isEmpty(s.getBio())) {
                textBio.setVisibility(View.GONE);
            }

            Bitmap b = loadBitmapFromAssets(s.getImageSrc());
            imgPortrait.setImageBitmap(b);

            return convertView;
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
