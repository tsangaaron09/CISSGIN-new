package com.example.fatboy.cissgin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Fatboy on 6/1/2018.
 */

public class ginmap extends AppCompatActivity {

    ImageView img;
    private Button hs, pc, ms, es, ritt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ginmap);
        getSupportActionBar().hide();


        hs = (Button) findViewById(R.id.hsbuilding);
        hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhs();
            }
        });

        pc = (Button) findViewById(R.id.pcbuilding);
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpc();
            }
        });

        ms = (Button) findViewById(R.id.msbuilding);
        ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openms();
            }
        });

        es = (Button) findViewById(R.id.esbuilding);
        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openes();
            }
        });

        ritt = (Button) findViewById(R.id.rittmann);
        ritt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openritt();
            }
        });


    }

    public void openhs() {
        Intent i = new Intent(this, hslist.class);
        startActivity(i);
    }

    public void openpc() {
        Intent i = new Intent(this, pclist.class);
        startActivity(i);
    }

    public void openms() {
        Intent i = new Intent(this, mslist.class);
        startActivity(i);
    }

    public void openes() {
        Intent i = new Intent(this, eslist.class);
        startActivity(i);
    }

    public void openritt() {
        Intent i = new Intent(this, ritt.class);
        startActivity(i);
    }


}

