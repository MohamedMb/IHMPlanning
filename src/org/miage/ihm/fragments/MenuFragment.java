package org.miage.ihm.fragments;

import java.util.ArrayList;
import java.util.List;

import org.miage.ihm.R;
import org.miage.ihm.adapters.MenuAdapter;
import org.miage.ihm.database.model.Menu;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class MenuFragment extends ListFragment {

	public static ArrayList<Menu> menus = new ArrayList<Menu>();
	
	public MenuFragment() {}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_menu, container, false);
		
		// ajout de la liste des menus dans le fragment des menus
		MenuAdapter menuAdapter = new MenuAdapter(getActivity(), R.layout.row_item_menu, menus);
		setListAdapter(menuAdapter);

		return rootView;
	}
}