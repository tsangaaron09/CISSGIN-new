package com.example.fatboy.cissgin;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Fatboy on 6/1/2018.
 */

public class ginschedule extends AppCompatActivity {

    TextView a;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.menu_home:
                    Intent p = new Intent(ginschedule.this, ginasiamain.class);
                    startActivity(p);
                    return true;

                case R.id.menu_map:
                    Intent o = new Intent(ginschedule.this, ginmapnew.class);
                    startActivity(o);
                    return true;
                case R.id.menu_more:
                    Intent intent1 = new Intent(ginschedule.this, moreTab.class);
                    startActivity(intent1);
                    return true;

                case R.id.menu_keynote:
                    Intent i = new Intent(ginschedule.this, keynotespeakers.class);
                    startActivity(i);
                    return true;


                case R.id.menu_schedule:

                    return true;


            }
            return true;
        }

    };

    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ginschedule);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationGin);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.menu_schedule);

        a = (TextView) findViewById(R.id.schedule);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);
    }
}