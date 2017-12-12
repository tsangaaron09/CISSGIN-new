package com.example.fatboy.cissgin;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.ImageButton;
import android.view.View;

/**
 * Created by ethanwang on 9/6/17.
 */


public class moreTab extends AppCompatActivity{
    ImageButton shanghai;
    ImageButton jinqiao;
    ImageButton contact;

    TextView a;
    TextView b;
    TextView c;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menu_home:

                    return true;
                case R.id.menu_map:

                    return true;
                case R.id.menu_more:

                    return true;



                case R.id.menu_procedure:
                    return true;
                case R.id.menu_schedule:

                    return true;
            }
            return true;
        }

    };

    protected void onCreate(final Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.more);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationMore);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.menu_more);

        shanghai = (ImageButton) findViewById(R.id.shanghaiButton);

        shanghai.setOnClickListener(new View.OnClickListener()
                                    {
                                        public void onClick(View v)
                                        {
                                            Intent i = new Intent(moreTab.this, shanghaiPage.class);
                                            startActivity(i);
                                        }
                                    }
        );

        jinqiao = (ImageButton) findViewById(R.id.jinqiaoButton);

        jinqiao.setOnClickListener(new View.OnClickListener()
                                    {
                                        public void onClick(View v)
                                        {
                                            Intent i = new Intent(moreTab.this, jinqiao_page.class);
                                            startActivity(i);
                                        }
                                    }
        );

        contact = (ImageButton) findViewById(R.id.contactButton);

        contact.setOnClickListener(new View.OnClickListener()
                                   {
                                       public void onClick(View v)
                                       {
                                           Intent i = new Intent(moreTab.this, contactPage.class);
                                           startActivity(i);
                                       }
                                   }
        );

        a = (TextView) findViewById(R.id.shanghaiTab);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);

        b = (TextView) findViewById(R.id.jinqiaoTab);
       //Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        b.setTypeface(myCustomFont);

        c = (TextView) findViewById(R.id.contactTab);
        //Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        c.setTypeface(myCustomFont);






    }


}
