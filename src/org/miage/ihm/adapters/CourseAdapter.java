package org.miage.ihm.adapters;

import java.util.ArrayList;

import org.miage.ihm.R;
import org.miage.ihm.database.model.Course;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CourseAdapter extends ArrayAdapter<Course>{

	private Context context;
	
	public CourseAdapter(Context context, int textViewRessourceId, ArrayList<Course> courses) {
		super(context, textViewRessourceId, courses);
		this.context = context;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_item_course, parent, false);
        }
        
        
        Course course = getItem(position);
        if (course != null) {
            TextView titre = (TextView) row.findViewById(R.id.label);
            TextView description = (TextView) row.findViewById(R.id.description);   
            
            titre.setText(course.getLibelle());
            description.setText(course.getDescription());
        }

        return row;
    }
}
