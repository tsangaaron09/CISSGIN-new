package com.example.fatboy.cissgin;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ethanwang on 9/6/17.
 */


public class shanghaiPage extends AppCompatActivity{

    TextView a;
    TextView b;
    TextView c;
    TextView d;
    TextView e;
    Button transportation;
    Button attractions;
    Button dining;


    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shanghai_page);
        getSupportActionBar().hide();


        a = (TextView) findViewById(R.id.shanghaiMain);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);



        b = (TextView) findViewById(R.id.shanghaiPageDescription);
        //Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        b.setTypeface(myCustomFont, Typeface.ITALIC);

        c = (TextView) findViewById(R.id.attractionsButton);
        //Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        c.setTypeface(myCustomFont);

        d = (TextView) findViewById(R.id.transportationButton);
        //Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        d.setTypeface(myCustomFont);

        e = (TextView) findViewById(R.id.diningButton);
        //Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        e.setTypeface(myCustomFont);

        transportation = (Button) findViewById(R.id.transportationButton);

        transportation.setOnClickListener(new View.OnClickListener()
                                    {
                                        public void onClick(View v)
                                        {
                                            Intent i = new Intent(shanghaiPage.this, transportationPage.class);
                                            startActivity(i);
                                        }
                                    }
        );

        attractions = (Button) findViewById(R.id.attractionsButton);

        attractions.setOnClickListener(new View.OnClickListener()
                                          {
                                              public void onClick(View v)
                                              {
                                                  Intent i = new Intent(shanghaiPage.this, shanghaiAttractions.class);
                                                  startActivity(i);
                                              }
                                          }
        );

        dining = (Button) findViewById(R.id.diningButton);

        dining.setOnClickListener(new View.OnClickListener()
                                       {
                                           public void onClick(View v)
                                           {
                                               Intent i = new Intent(shanghaiPage.this, shanghaiDining.class);
                                               startActivity(i);
                                           }
                                       }
        );



    }
}
