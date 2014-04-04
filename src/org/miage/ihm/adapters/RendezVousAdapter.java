package org.miage.ihm.adapters;

import java.util.ArrayList;

import org.miage.ihm.R;
import org.miage.ihm.database.model.RendezVous;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class RendezVousAdapter extends ArrayAdapter<RendezVous> {

	private Context context;
	
	public RendezVousAdapter(Context context, int textViewRessourceId, ArrayList<RendezVous> rendezVous) {
		super(context, textViewRessourceId, rendezVous);
		this.context = context;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_item_course, parent, false);
        }
        
        
        RendezVous rendezVous = getItem(position);
        if (rendezVous != null) {
            TextView titre = (TextView) row.findViewById(R.id.label);
            TextView description = (TextView) row.findViewById(R.id.description);   
            
            titre.setText(rendezVous.getTitre());
            description.setText(rendezVous.getDescription());
        }

        return row;
    }
}
