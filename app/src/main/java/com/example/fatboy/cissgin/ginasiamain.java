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

public class ginasiamain extends Activity {



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
                    Intent o = new Intent(ginasiamain.this, ginmap.class);
                    startActivity(o);
                    return true;
                case R.id.menu_more:
                    Intent intent1 = new Intent(ginasiamain.this, moreTab.class);
                    startActivity(intent1);
                    return true;

                case R.id.menu_keynote:
                    Intent i = new Intent(ginasiamain.this, keynotespeakers.class);
                    startActivity(i);
                    return true;


                case R.id.menu_schedule:
                    Intent j = new Intent(ginasiamain.this, ginschedule.class);
                    startActivity(j);
                    return true;


            }
            return true;
        }

    };


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ginasiamain);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationGin);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.menu_home);

        a = (TextView) findViewById(R.id.GINASIA);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);

        b = (TextView) findViewById(R.id.desc1leeanne);
        b.setTypeface(myCustomFont);

        c = (TextView) findViewById(R.id.desc2leeanne);
        c.setTypeface(myCustomFont);

        d = (TextView) findViewById(R.id.gindirector);
        d.setTypeface(myCustomFont);

        e = (TextView) findViewById(R.id.WELCOME);
        e.setTypeface(myCustomFont);

        f = (TextView) findViewById(R.id.desc1karen);
        f.setTypeface(myCustomFont);

        g = (TextView) findViewById(R.id.leeanne);
        g.setTypeface(myCustomFont);

        h = (TextView) findViewById(R.id.desc2karen);
        h.setTypeface(myCustomFont);

        i = (TextView) findViewById(R.id.ginstudenthead);
        i.setTypeface(myCustomFont);

        j = (TextView) findViewById(R.id.karenma);
        j.setTypeface(myCustomFont);




    }
}