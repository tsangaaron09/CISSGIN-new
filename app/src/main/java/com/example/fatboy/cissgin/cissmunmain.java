package com.example.fatboy.cissgin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;


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


private Button vigil1, vigil2, vigil3;

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

        vigil1 = (Button)findViewById(R.id.vigil1);
        vigil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openvigil1();
            }
        });

        vigil2 = (Button)findViewById(R.id.vigil2);
        vigil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openvigil2();
            }
        });

        vigil3 = (Button)findViewById(R.id.vigil3);
        vigil3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openvigil3();
            }
        });




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

        j = (TextView) findViewById(R.id.AnnaWei);
        j.setTypeface(myCustomFont);






    }

    public void openvigil1()
    {
        Intent k = new Intent(this, vigilpage1.class);
        startActivity(k);
    }

    public void openvigil2()
    {
        Intent k = new Intent(this, vigilpage2.class);
        startActivity(k);
    }

    public void openvigil3()
    {
        Intent k = new Intent(this, vigilpage3.class);
        startActivity(k);
    }




}

