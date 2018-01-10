package com.example.fatboy.cissgin;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hslist extends AppCompatActivity {


    private Button h1,h2,h3,h4,h5,h6,hb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hs);
        getSupportActionBar().hide();


        h1 = (Button)findViewById(R.id.hs1);
        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openh1();
            }
        });

        h2 = (Button)findViewById(R.id.hs2);
        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openh2();
            }
        });

        h3 = (Button)findViewById(R.id.hs3);
        h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openh3();
            }
        });

        h4 = (Button)findViewById(R.id.hs4);
        h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openh4();
            }
        });

        h5 = (Button)findViewById(R.id.hs5);
        h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openh5();
            }
        });

        h6 = (Button)findViewById(R.id.hs6);
        h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openh6();
            }
        });

        hb1 = (Button)findViewById(R.id.hsb1);
        hb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhb1();
            }
        });

    }

    public void openh1()
    {
        Intent i = new Intent(this, h1.class);
        startActivity(i);
    }

    public void openh2()
    {
        Intent j = new Intent(this, h2.class);
        startActivity(j);
    }

    public void openh3()
    {
        Intent k = new Intent(this, h3.class);
        startActivity(k);
    }

    public void openh4()
    {
        Intent k = new Intent(this, h4.class);
        startActivity(k);
    }

    public void openh5()
    {
        Intent k = new Intent(this, h5.class);
        startActivity(k);
    }

    public void openh6()
    {
        Intent k = new Intent(this, h6.class);
        startActivity(k);
    }

    public void openhb1()
    {
        Intent k = new Intent(this, hb1.class);
        startActivity(k);
    }

}
