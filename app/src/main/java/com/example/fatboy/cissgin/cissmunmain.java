package com.example.fatboy.cissgin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.TextView;





/**
 * Created by Fatboy on 22/6/2017.
 */

public class cissmunmain extends Activity
{

    TextView a;
    TextView b;
    TextView c;
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    TextView j;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menu_home:

                    return true;
                case R.id.menu_map:
                    Intent o = new Intent(cissmunmain.this, ginmap.class);
                    startActivity(o);
                    return true;

                case R.id.menu_more:
                    Intent i = new Intent(cissmunmain.this, moreTab.class);
                    startActivity(i);
                    return true;



                case R.id.menu_procedure:
                    Intent j = new Intent(cissmunmain.this, cissmunprocedure.class);
                    startActivity(j);
                    return true;


                case R.id.menu_schedule:
                    Intent k = new Intent(cissmunmain.this, munschedule.class);
                    startActivity(k);
                    return true;
            }
            return true;
        }

    };

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.cissmunmain);

        // mTextMessage = (TextView) findViewById(R.id);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationCiss);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.menu_home);

        a = (TextView) findViewById(R.id.cissmunix);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);

        b = (TextView) findViewById(R.id.desc1paulson);
        b.setTypeface(myCustomFont);

        c = (TextView) findViewById(R.id.desc2paulson);
        c.setTypeface(myCustomFont);

        d = (TextView) findViewById(R.id.CISSMUNDirector);
        d.setTypeface(myCustomFont);

        e = (TextView) findViewById(R.id.WELCOME);
        e.setTypeface(myCustomFont);

        f = (TextView) findViewById(R.id.desc1katherine);
        f.setTypeface(myCustomFont);

        g = (TextView) findViewById(R.id.ErikPaulson);
        g.setTypeface(myCustomFont);

        h = (TextView) findViewById(R.id.desc2katherine);
        h.setTypeface(myCustomFont);

        i = (TextView) findViewById(R.id.SecretaryGeneral);
        i.setTypeface(myCustomFont);

        j = (TextView) findViewById(R.id.KatherineHou);
        j.setTypeface(myCustomFont);






    }
}

