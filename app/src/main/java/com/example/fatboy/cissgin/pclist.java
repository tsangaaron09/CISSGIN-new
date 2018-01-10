package com.example.fatboy.cissgin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class pclist extends AppCompatActivity {

    private Button pc1, pc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pc);
        getSupportActionBar().hide();

        pc1 = (Button) findViewById(R.id.pc1);
        pc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpc1();
            }
        });
        pc2 = (Button) findViewById(R.id.pc2);
        pc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpc2();
            }
        });


    }

    public void openpc1() {
        Intent i = new Intent(this, pc1.class);
        startActivity(i);
    }

    public void openpc2() {
        Intent j = new Intent(this, pc2.class);
        startActivity(j);
    }
}
