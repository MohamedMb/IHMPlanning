package org.miage.ihm.fragments;


import org.miage.ihm.R;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OptionFragment extends ListFragment {
	
	public OptionFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_option, container, false);
         
        return rootView;
    }
}
