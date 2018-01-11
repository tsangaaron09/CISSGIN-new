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



public class munschedule extends AppCompatActivity {

    TextView a;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menu_home:
                    Intent p = new Intent( munschedule.this, cissmunmain.class);
                    startActivity(p);
                    return true;
                case R.id.menu_map:
                    Intent o = new Intent(munschedule.this, ginmap.class);
                    startActivity(o);
                    return true;

                case R.id.menu_more:
                    Intent i = new Intent(munschedule.this, moreTab.class);
                    startActivity(i);
                    return true;



                case R.id.menu_procedure:
                    Intent j = new Intent(munschedule.this, cissmunprocedure.class);
                    startActivity(j);
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
        setContentView(R.layout.munschedule);

        a = (TextView) findViewById(R.id.scheduletitle);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationCiss);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.menu_schedule);
    }
}