package com.example.fatboy.cissgin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class mslist extends AppCompatActivity {

    private Button m1, m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ms);
        getSupportActionBar().hide();

        m1 = (Button) findViewById(R.id.m1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openm1();
            }
        });
        m2 = (Button) findViewById(R.id.m2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openm2();
            }
        });


    }

    public void openm1() {
        Intent i = new Intent(this, m1.class);
        startActivity(i);
    }

    public void openm2() {
        Intent j = new Intent(this, m2.class);
        startActivity(j);
    }
}
