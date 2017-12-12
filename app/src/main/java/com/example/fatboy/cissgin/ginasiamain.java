package com.example.fatboy.cissgin;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;

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

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.menu_home:
                    return true;
                case R.id.menu_map:
                    return true;
                case R.id.menu_more:
                    return true;
                case R.id.menu_keynote:
                    Intent intent = new Intent(ginasiamain.this, keynotespeakers.class);
                    startActivity(intent);
                    break;


                case R.id.menu_schedule:

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

        a = (TextView) findViewById(R.id.leeannelavender);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);

        b = (TextView) findViewById(R.id.gindirector);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        b.setTypeface(myCustomFont2);

        c = (TextView) findViewById(R.id.karenma);
        Typeface myCustomFont3 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        c.setTypeface(myCustomFont3);

        d = (TextView) findViewById(R.id.ginstudenthead);
        Typeface myCustomFont4 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        d.setTypeface(myCustomFont4);

        e = (TextView) findViewById(R.id.karendesc);
        Typeface myCustomFont5 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        e.setTypeface(myCustomFont5);

        f = (TextView) findViewById(R.id.lavenderdesc);
        Typeface myCustomFont6 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        f.setTypeface(myCustomFont6);

    }
}
