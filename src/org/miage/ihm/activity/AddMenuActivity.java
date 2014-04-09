package org.miage.ihm.activity;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.miage.ihm.R;
import org.miage.ihm.customcalendar.CalendarProvider;
import org.miage.ihm.customcalendar.Event;
import org.miage.ihm.database.model.Menu;
import org.miage.ihm.fragments.MenuFragment;
import org.miage.ihm.fragments.PlanningFragment;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Mohamed on 02/04/14.
 * Ajout de menu, rdv et liste de course
 */
public class AddMenuActivity extends Activity {
    private String [] addTitleItems;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_activity_menu);

        addTitleItems = getResources().getStringArray(R.array.add_elements_items);
        setTitle(addTitleItems[1]);


        final Intent intent = new Intent(AddMenuActivity.this, MainActivity.class);
        final int day = getIntent().getIntExtra("day", 0);
        final int month = getIntent().getIntExtra("month", 0);
        final int year = getIntent().getIntExtra("year", 0);

        intent.putExtra("day", day);
        intent.putExtra("month", month);
        intent.putExtra("year", year);
        
        //--- clic sur le bouton d'ajout d'un menu ---
        Button submit = (Button)findViewById(R.id.submit_menu);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText titre = (EditText) findViewById(R.id.libelle_menu);
                EditText contenu = (EditText) findViewById(R.id.contenu_menu);
                //EditText lieu = (EditText) findViewById(R.id.lieu_rdv);
                
                Menu menu = new Menu(titre.getText().toString(), contenu.getText().toString(), null, null);
                MenuFragment.menus.add(menu);
                
                intent.putExtra("titre", titre.getText().toString());
                intent.putExtra("lieu", "");
                intent.putExtra("description", contenu.getText().toString());
                
                //ajout d'un marqueur dans le calendrier au bon jour
                insertElement(year, month, day,
                        	  titre.getText().toString(), contenu.getText().toString(),
                        	  "", Event.COLOR_BLUE);
                
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                
                startActivityForResult(intent, PlanningFragment.REQ_MENU);
                Toast.makeText(getApplicationContext(), "Un menu vient d'être ajouté", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        
        //--- clic sur le bouton annuler ---
		Button btn_cancel = (Button)findViewById(R.id.cancel_menu);
		btn_cancel.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				finish();
			}
			
		});
    }

    /**
     *
     * @param year
     * @param month
     * @param day
     * @param titre
     * @param description
     * @param location
     * @param color
     */
    public void insertElement(int year, int month,int day,
                              String titre, String description, String location, int color) {
        //Event.COLOR_RED
        ContentValues values = new ContentValues();
        values.put(CalendarProvider.COLOR, color);
        values.put(CalendarProvider.DESCRIPTION, description);
        values.put(CalendarProvider.LOCATION, location);
        values.put(CalendarProvider.EVENT, titre);

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);

        TimeZone tz = TimeZone.getDefault();

        int dayJulian = Time.getJulianDay(cal.getTimeInMillis(),
                TimeUnit.MILLISECONDS.toSeconds(tz.getOffset(cal
                        .getTimeInMillis())));

        values.put(CalendarProvider.START, cal.getTimeInMillis());
        values.put(CalendarProvider.START_DAY, dayJulian);

        values.put(CalendarProvider.END, cal.getTimeInMillis());
        values.put(CalendarProvider.END_DAY, dayJulian);

        Uri uri = getContentResolver().insert(
                CalendarProvider.CONTENT_URI, values);
    }
}
