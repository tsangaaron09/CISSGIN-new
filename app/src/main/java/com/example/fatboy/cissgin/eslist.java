package com.example.fatboy.cissgin;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class eslist extends AppCompatActivity {


    private Button e1,e2,e3,e4,h5,h6,hb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.es);
        getSupportActionBar().hide();


        e1 = (Button)findViewById(R.id.e1);
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opene1();
            }
        });

        e2 = (Button)findViewById(R.id.e2);
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opene2();
            }
        });

        e3 = (Button)findViewById(R.id.e3);
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opene3();
            }
        });

        e4 = (Button)findViewById(R.id.e4);
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opene4();
            }
        });



    }

    public void opene1()
    {
        Intent i = new Intent(this, e1.class);
        startActivity(i);
    }

    public void opene2()
    {
        Intent j = new Intent(this, e2.class);
        startActivity(j);
    }

    public void opene3()
    {
        Intent k = new Intent(this, e3.class);
        startActivity(k);
    }

    public void opene4()
    {
        Intent k = new Intent(this, e4.class);
        startActivity(k);
    }


}
