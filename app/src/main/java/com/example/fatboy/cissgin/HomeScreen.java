package com.example.fatboy.cissgin;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.drawable.*;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    TextView a;
    TextView b;
    TextView c;
    TextView d;
    TextView e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getSupportActionBar().hide();


        a = (TextView) findViewById(R.id.cissgin);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);

        b = (TextView) findViewById(R.id.theyear);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        b.setTypeface(myCustomFont2);

        c = (TextView) findViewById(R.id.pleaseselectyourconference);
        Typeface myCustomFont3 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        c.setTypeface(myCustomFont3);

        d = (TextView) findViewById(R.id.Bcissmun);
        Typeface myCustomFont4 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        d.setTypeface(myCustomFont4);

        e = (TextView) findViewById(R.id.Bginasia);
        Typeface myCustomFont5 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        e.setTypeface(myCustomFont5);




    }
    public void onButtonClick(View v)
    {

        if(v.getId() == R.id.Bcissmun)
        {
            Intent i = new Intent(HomeScreen.this,cissmunmain.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bginasia)
        {
            Intent i = new Intent(HomeScreen.this,ginasiamain.class);
            startActivity(i);
        }

    }
}
