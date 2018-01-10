package com.example.fatboy.cissgin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ethanwang on 9/6/17.
 */


public class moreTab extends AppCompatActivity{
    Button shanghai;
    Button jinqiao;
    Button contact;

    TextView a;
    TextView b;
    TextView c;



    protected void onCreate(final Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.more);
        getSupportActionBar().hide();


        shanghai = (Button) findViewById(R.id.shanghaiButton);

        shanghai.setOnClickListener(new View.OnClickListener()
                                    {
                                        public void onClick(View v)
                                        {
                                            Intent i = new Intent(moreTab.this, shanghaiPage.class);
                                            startActivity(i);
                                        }
                                    }
        );

        jinqiao = (Button) findViewById(R.id.jinqiaobutton);

        jinqiao.setOnClickListener(new View.OnClickListener()
                                    {
                                        public void onClick(View v)
                                        {
                                            Intent i = new Intent(moreTab.this, jinqiao_page.class);
                                            startActivity(i);
                                        }
                                    }
        );

        contact = (Button) findViewById(R.id.contactbutton);

        contact.setOnClickListener(new View.OnClickListener()
                                   {
                                       public void onClick(View v)
                                       {
                                           Intent i = new Intent(moreTab.this, contactPage.class);
                                           startActivity(i);
                                       }
                                   }
        );






    }


}
