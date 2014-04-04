package org.miage.ihm.fragments;

import java.util.ArrayList;
import org.miage.ihm.R;
import org.miage.ihm.adapters.CourseAdapter;
import org.miage.ihm.database.model.Course;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CoursesFragment extends ListFragment {

    public static ArrayList<Course> courses = new ArrayList<Course>();
    
    public CoursesFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_courses, container, false);

        // ajout de la liste des courses dans le fragment des courses
        CourseAdapter courseAdapter = new CourseAdapter(getActivity(), R.layout.row_item_course, courses);
     	setListAdapter(courseAdapter);
        
     	return rootView;
    }
}