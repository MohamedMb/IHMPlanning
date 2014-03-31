package org.miage.ihm.fragments;


import org.miage.ihm.R;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RdvFragment extends Fragment {
    public RdvFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rdv, container, false);
        return rootView;
    }
}
