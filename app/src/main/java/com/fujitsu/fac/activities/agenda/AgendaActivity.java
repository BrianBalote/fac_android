package com.fujitsu.fac.activities.agenda;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.fujitsu.fac.R;
import com.fujitsu.fac.domain.Agenda;

import java.util.List;

import roboguice.activity.RoboListActivity;
import roboguice.inject.InjectView;

public class AgendaActivity extends RoboListActivity {

    private static final String TAG = "AgendaActivity";

    @InjectView(R.id.back_button)
    private View backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        AgendaData agendaData = new AgendaData();
        List<Agenda> agendaList = agendaData.getAgendaList();

        AgendaListAdapter agendaListAdapter = new AgendaListAdapter(R.layout.list_row_agenda, agendaList);

        this.setListAdapter(agendaListAdapter);

        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
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
            View row = convertView;
            MyPlaceHolder holder = null;

            if (row == null) {

                LayoutInflater inflater = (LayoutInflater) AgendaActivity.this
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(this.viewResourceId, parent, false);
                holder = new MyPlaceHolder();

                holder.textAgendaName = (TextView) row.findViewById(R.id.text_agenda_name);
                holder.textAgendaDate = (TextView) row.findViewById(R.id.text_agenda_date);
                holder.textAgendaStartTime = (TextView) row.findViewById(R.id.text_agenda_start_time);
                holder.textAgendaEndTime = (TextView) row.findViewById(R.id.text_agenda_end_time);
                holder.textAgendaSpeakers = (TextView) row.findViewById(R.id.text_agenda_speakers);
                holder.textAgendaDescription = (TextView) row.findViewById(R.id.text_agenda_description);

                row.setTag(holder);

            } else {

                holder = (MyPlaceHolder) row.getTag();
            }

            final Agenda a = agendaList.get(position);

            holder.textAgendaName.setText(a.getName());
            holder.textAgendaDate.setText(a.getDate());
            holder.textAgendaStartTime.setText(a.getStartTime());
            holder.textAgendaEndTime.setText(a.getEndTime());
            holder.textAgendaDescription.setText(a.getDescription());
            holder.textAgendaSpeakers.setText(a.getSpeakers());

            return row;
        }

        class MyPlaceHolder {

            TextView textAgendaName;
            TextView textAgendaDate;
            TextView textAgendaStartTime;
            TextView textAgendaEndTime;
            TextView textAgendaSpeakers;
            TextView textAgendaDescription;
        }
    }
}
