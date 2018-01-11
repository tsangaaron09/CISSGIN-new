package com.example.fatboy.cissgin;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by Fatboy on 6/1/2018.
 */

public class ginmapnew extends AppCompatActivity{

    private Button hs,pc,ms,es,ritt;
    ImageView img;
    TextView a;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.menu_home:
                    Intent p = new Intent(ginmapnew.this, ginasiamain.class);
                    startActivity(p);
                    return true;

                case R.id.menu_map:

                    return true;
                case R.id.menu_more:
                    Intent intent1 = new Intent(ginmapnew.this, moreTab.class);
                    startActivity(intent1);
                    return true;

                case R.id.menu_keynote:
                    Intent i = new Intent(ginmapnew.this, keynotespeakers.class);
                    startActivity(i);
                    return true;


                case R.id.menu_schedule:
                    Intent j = new Intent(ginmapnew.this, ginschedule.class);
                    startActivity(j);
                    return true;


            }
            return true;
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ginmapnew);
        getSupportActionBar().hide();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationCiss);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.menu_map);

        hs = (Button)findViewById(R.id.hsbuilding);
        hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhs();
            }
        });

        pc = (Button)findViewById(R.id.pcbuilding);
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpc();
            }
        });

        ms = (Button)findViewById(R.id.msbuilding);
        ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openms();
            }
        });

        es = (Button)findViewById(R.id.esbuilding);
        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openes();
            }
        });

        ritt = (Button)findViewById(R.id.rittmann);
        ritt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openritt();
            }
        });

        a = (TextView) findViewById(R.id.map);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);

    }

    public void openhs()
    {
        Intent i = new Intent(this, hslist.class);
        startActivity(i);
    }
    public void openpc()
    {
        Intent i = new Intent(this, pclist.class);
        startActivity(i);
    }
    public void openms()
    {
        Intent i = new Intent(this, mslist.class);
        startActivity(i);
    }
    public void openes()
    {
        Intent i = new Intent(this, eslist.class);
        startActivity(i);
    }

    public void openritt()
    {
        Intent i = new Intent(this, ritt.class);
        startActivity(i);
    }





}

