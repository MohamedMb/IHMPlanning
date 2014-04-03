package org.miage.ihm.fragments;


import java.util.ArrayList;
import java.util.List;

import org.miage.ihm.R;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class RdvFragment extends ListFragment {

    public static List<String> titre = new ArrayList<String>();

    public RdvFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rdv, container, false);

        String[] values = new String[titre.size()];
        values = titre.toArray(values);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.row_item_rdv, R.id.label, values);
        setListAdapter(adapter);

        return rootView;
    }
}
