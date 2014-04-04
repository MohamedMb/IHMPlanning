package org.miage.ihm.adapters;

import java.util.ArrayList;

import org.miage.ihm.R;
import org.miage.ihm.database.model.Menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MenuAdapter extends ArrayAdapter<Menu>{

	private Context context;
	
	public MenuAdapter(Context context, int textViewRessourceId, ArrayList<Menu> menus) {
		super(context, textViewRessourceId, menus);
		this.context = context;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_item_menu, parent, false);
        }
        
        
        Menu menu = getItem(position);
        if (menu != null) {
            TextView titre = (TextView) row.findViewById(R.id.label);
            TextView description = (TextView) row.findViewById(R.id.description);   
            
            titre.setText(menu.getTitre());
            description.setText(menu.getDescription());
        }

        return row;
    }
}
