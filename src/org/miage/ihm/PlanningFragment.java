package org.miage.ihm;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlanningFragment extends Fragment {
    public PlanningFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.simple_calendar_view, container, false);
        /*Bundle b = new Bundle();
        b.putInt(DatePickerDialogFragment.YEAR, 2012);
        b.putInt(DatePickerDialogFragment.MONTH, 6);
        b.putInt(DatePickerDialogFragment.DATE, 17);
        DialogFragment picker = new DatePickerDialogFragment();
        picker.setArguments(b);
        picker.show(getActivity().getFragmentManager(), "frag_date_picker");
        selectedDayMonthYear = (Button)getActivity().findViewById(R.id.selectedDayMonthYear);

        selectedDayMonthYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putInt(DatePickerDialogFragment.YEAR, 2014);
                b.putInt(DatePickerDialogFragment.MONTH, 2);
                b.putInt(DatePickerDialogFragment.DATE, 10);
                DialogFragment picker;
                picker = new DatePickerDialogFragment();
                picker.setArguments(b);
                FragmentManager fm;
                fm = getActivity().getFragmentManager();
                //picker.show(getActivity().getFragmentManager(), "frag_date_picker");
                picker.show(fm, "My Picker");
            }
        });
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        cal.add(Calendar.MONTH, 2);
        long time = cal.getTime().getTime();
        Uri.Builder builder = CalendarContract.CONTENT_URI.buildUpon();
        builder.appendPath("time");
        builder.appendPath(Long.toString(time));
        Intent intent =
                new Intent(Intent.ACTION_VIEW, builder.build());
        startActivity(intent);*/
        return rootView;
    }
}
