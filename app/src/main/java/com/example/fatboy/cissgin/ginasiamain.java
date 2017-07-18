package com.example.fatboy.cissgin;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Fatboy on 22/6/2017.
 */

public class ginasiamain extends Activity {



    TextView a;
    TextView b;
    TextView c;
    TextView d;
    TextView e;
    TextView f;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ginasiamain);

        a = (TextView) findViewById(R.id.leeannelavender);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);

        b = (TextView) findViewById(R.id.gindirector);
        Typeface myCustomFont2 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        b.setTypeface(myCustomFont2);

        c = (TextView) findViewById(R.id.karenma);
        Typeface myCustomFont3 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        c.setTypeface(myCustomFont3);

        d = (TextView) findViewById(R.id.ginstudenthead);
        Typeface myCustomFont4 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        d.setTypeface(myCustomFont4);

        e = (TextView) findViewById(R.id.karendesc);
        Typeface myCustomFont5 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        e.setTypeface(myCustomFont5);

        f = (TextView) findViewById(R.id.lavenderdesc);
        Typeface myCustomFont6 = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        f.setTypeface(myCustomFont6);

    }
}
