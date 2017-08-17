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
import com.fujitsu.fac.domain.Speaker;
import com.fujitsu.fac.font.RobotoFontUtil;
import com.fujitsu.fac.services.EventService;
import com.fujitsu.fac.utils.DateTimeUtil;

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

        List<Agenda> agendaList = EventService.getInstance().getCurrentEvent().getAgendaList();

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
            holder.textAgendaDate.setText(DateTimeUtil.convertDateToString(a.getDate()));
            holder.textAgendaStartTime.setText(DateTimeUtil.convertTimeToString(a.getStartTime()));
            holder.textAgendaEndTime.setText(DateTimeUtil.convertTimeToString(a.getEndTime()));
            holder.textAgendaDescription.setText(a.getDescription());

            StringBuilder sb = new StringBuilder();
            for (Speaker s : a.getSpeakerList()) {
                sb.append(s.getName());
                sb.append(" ");
            }

            holder.textAgendaSpeakers.setText(sb.toString());

            holder.textAgendaName.setTypeface(RobotoFontUtil.getRobotoLightFont(AgendaActivity.this));
            holder.textAgendaDate.setTypeface(RobotoFontUtil.getRobotoLightFont(AgendaActivity.this));
            holder.textAgendaStartTime.setTypeface(RobotoFontUtil.getRobotoLightFont(AgendaActivity.this));
            holder.textAgendaEndTime.setTypeface(RobotoFontUtil.getRobotoLightFont(AgendaActivity.this));
            holder.textAgendaDescription.setTypeface(RobotoFontUtil.getRobotoLightFont(AgendaActivity.this));
            holder.textAgendaSpeakers.setTypeface(RobotoFontUtil.getRobotoLightFont(AgendaActivity.this));

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
