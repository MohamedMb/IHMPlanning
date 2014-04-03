package org.miage.ihm.fragments;

import java.util.ArrayList;
import java.util.List;

import org.miage.ihm.R;
import org.miage.ihm.customcalendar.Day;
import org.miage.ihm.customcalendar.ExtendedCalendarView;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

public class PlanningFragment extends Fragment {
    private List listRdv = new ArrayList();
    private List listMenu = new ArrayList();
    private List listCourse = new ArrayList();

    public final static int REQ_RDV = 0;
    public final static int REQ_COURSE = 1;
    public final static int REQ_MENU = 2;

    public PlanningFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_planning, container, false);

        ExtendedCalendarView calendar = (ExtendedCalendarView)rootView.findViewById(R.id.calendar);
        calendar.setOnDayClickListener(new ExtendedCalendarView.OnDayClickListener() {
            int year;
            int month;
            int dayOfMonth;

            @Override
            public void onDayClicked(AdapterView<?> adapter, View view, int position, long id, Day day) {
                year = day.getYear();
                month = day.getMonth(); //mois de 0 à 11
                dayOfMonth = day.getDay();

                AddDialogFragment dialog = AddDialogFragment.newInstance(dayOfMonth, month, year);
                dialog.show(getFragmentManager(), "fragmentDialog");
            }
        });

        calendar.refreshCalendar();
        return rootView;
    }
}
