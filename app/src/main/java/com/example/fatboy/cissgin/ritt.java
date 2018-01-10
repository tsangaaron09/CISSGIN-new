package com.example.fatboy.cissgin;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ritt extends AppCompatActivity {


    private Button r1,r2,r3,r4,h5,h6,hb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rittmann);
        getSupportActionBar().hide();


        r1 = (Button)findViewById(R.id.r1);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openr1();
            }
        });

        r2 = (Button)findViewById(R.id.r2);
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openr2();
            }
        });

        r3 = (Button)findViewById(R.id.r3);
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openr3();
            }
        });

        r4 = (Button)findViewById(R.id.r4);
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openr4();
            }
        });



    }

    public void openr1()
    {
        Intent i = new Intent(this, r1.class);
        startActivity(i);
    }

    public void openr2()
    {
        Intent j = new Intent(this, r2.class);
        startActivity(j);
    }

    public void openr3()
    {
        Intent k = new Intent(this, r3.class);
        startActivity(k);
    }

    public void openr4()
    {
        Intent k = new Intent(this, r4.class);
        startActivity(k);
    }


}
