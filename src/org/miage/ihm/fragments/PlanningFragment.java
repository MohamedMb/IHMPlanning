package org.miage.ihm.fragments;

import org.miage.ihm.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

public class PlanningFragment extends Fragment {
    CalendarView calendar;
    public PlanningFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_planning, container, false);

        calendar = (CalendarView)rootView.findViewById(R.id.calendar);

        //désactive les numéros de semaine à droite
        calendar.setShowWeekNumber(false);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            private CalendarView view;
            private int year;
            private int month;
            private int dayOfMonth;

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
            //Méthode sur clique d'une date
                Toast.makeText(getActivity().getApplicationContext(),
                        dayOfMonth + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
                this.view = view;
                this.year = year;
                this.month = month;
                this.dayOfMonth = dayOfMonth;
            }
        });

        return rootView;
    }
}
