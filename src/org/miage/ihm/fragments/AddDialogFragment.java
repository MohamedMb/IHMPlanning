package org.miage.ihm.fragments;

import org.miage.ihm.activity.AddCourseActivity;
import org.miage.ihm.activity.AddMenuActivity;
import org.miage.ihm.activity.AddRdvActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Mohamed on 31/03/14.
 */

public class AddDialogFragment extends DialogFragment {
    public static String[] code = new String[]{
            "une liste de course",
            "un rendez-vous",
            "un menu"
    };
    //private int day, month, year;


    public AddDialogFragment() {
        // Empty constructor required for DialogFragment
    }

    public static AddDialogFragment newInstance(int day, int month, int year) {
        AddDialogFragment frag = new AddDialogFragment();
        Bundle args = new Bundle();
        args.putString("title", "Ajouter...");
        args.putInt("day", day);
        args.putInt("month", month);
        args.putInt("year", year);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Bundle bundle = getArguments();
        final int day = bundle.getInt("day");
        final int month = bundle.getInt("month");
        final int year = bundle.getInt("year");

        String title = getArguments().getString("title");
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());

        alertDialogBuilder.setTitle(title);

        alertDialogBuilder.setSingleChoiceItems(AddDialogFragment.code, 0, null);

        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Si bouton OK cliqué

                AlertDialog alert = (AlertDialog)dialog;
                int itemSelected = alert.getListView().getCheckedItemPosition();

                //Toast.makeText(getActivity().getApplicationContext(), AddDialogFragment.code[itemSelected],
                        //Toast.LENGTH_LONG).show();

                Intent addIntent;

                switch (itemSelected) {
                case 0:
                    addIntent = new Intent(getActivity(), AddCourseActivity.class);
                    addIntent.putExtra("day", day);
                    addIntent.putExtra("month", month);
                    addIntent.putExtra("year", year);
                    startActivity(addIntent);
                    break;
                case 1:
                    addIntent = new Intent(getActivity(), AddRdvActivity.class);
                    addIntent.putExtra("day", day);
                    addIntent.putExtra("month", month);
                    addIntent.putExtra("year", year);
                    startActivity(addIntent);
                    break;
                case 2:
                    addIntent = new Intent(getActivity(), AddMenuActivity.class);
                    addIntent.putExtra("day", day);
                    addIntent.putExtra("month", month);
                    addIntent.putExtra("year", year);
                    startActivity(addIntent);
                    break;
                }
            }
        });
        alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        return alertDialogBuilder.create();
    }
}
