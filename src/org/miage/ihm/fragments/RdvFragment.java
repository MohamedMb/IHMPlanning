package org.miage.ihm.fragments;


import java.util.ArrayList;
import org.miage.ihm.R;
import org.miage.ihm.adapters.RendezVousAdapter;
import org.miage.ihm.database.model.RendezVous;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RdvFragment extends ListFragment {

    public static ArrayList<RendezVous> rendezVous = new ArrayList<RendezVous>();

    public RdvFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rdv, container, false);

        // ajout de la liste des rendezVous dans le fragment des rendezVous
     	RendezVousAdapter rendezVousAdapter = new RendezVousAdapter(getActivity(), R.layout.row_item_rdv, rendezVous);
     	setListAdapter(rendezVousAdapter);

        return rootView;
    }
}
