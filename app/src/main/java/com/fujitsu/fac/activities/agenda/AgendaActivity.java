package com.fujitsu.fac.activities.agenda;

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
import com.fujitsu.fac.domain.Agenda;
import com.fujitsu.fac.utils.TypeFaceUtil;

import java.util.List;

public class AgendaActivity extends ListActivity {

    private static final String TAG = "AgendaActivity";

    private LayoutInflater inflater;
    private View backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        backBtn = (View) findViewById(R.id.back_button);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        inflater = (LayoutInflater) AgendaActivity.this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        AgendaListAdapter agendaListAdapter = new AgendaListAdapter(R.layout.list_row_agenda, AgendaData.getInstance().getAgendaList());
        setListAdapter(agendaListAdapter);
    }

    private class AgendaListAdapter extends BaseAdapter {

        private int viewResourceId;
        private List<Agenda> agendaList;

        public AgendaListAdapter(int viewResourceId,
                                 List<Agenda> agendaList) {
            this.viewResourceId = viewResourceId;
            this.agendaList = agendaList;
        }

        @Override
        public int getCount() {
            return agendaList.size();
        }

        @Override
        public Object getItem(int position) {
            return agendaList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView,
                            ViewGroup parent) {

            convertView = inflater.inflate(this.viewResourceId, parent, false);

            Agenda a = agendaList.get(position);

            TextView textAgendaName = (TextView) convertView.findViewById(R.id.text_agenda_name);
            TextView textAgendaTime = (TextView) convertView.findViewById(R.id.text_agenda_time);
            TextView textAgendaSpeakers = (TextView) convertView.findViewById(R.id.text_agenda_speakers);
            TextView textAgendaDescription = (TextView) convertView.findViewById(R.id.text_agenda_description);

            textAgendaName.setTypeface(TypeFaceUtil.getFujitsuSansBold(AgendaActivity.this));
            textAgendaTime.setTypeface(TypeFaceUtil.getFujitsuSansMedium(AgendaActivity.this));
            textAgendaSpeakers.setTypeface(TypeFaceUtil.getFujitsuSansBold(AgendaActivity.this));
            textAgendaDescription.setTypeface(TypeFaceUtil.getFujitsuSansMedium(AgendaActivity.this));

            textAgendaName.setText(a.getName());
            textAgendaTime.setText(a.getTime());
            textAgendaSpeakers.setText(a.getSpeakers());
            textAgendaDescription.setText(a.getDescription());

            if(TextUtils.isEmpty(a.getTime())) {
                textAgendaTime.setVisibility(View.GONE);
            }
            if(TextUtils.isEmpty(a.getSpeakers())) {
                textAgendaSpeakers.setVisibility(View.GONE);
            }
            if(TextUtils.isEmpty(a.getDescription())) {
                textAgendaDescription.setVisibility(View.GONE);
            }
            return convertView;
        }
    }
}
