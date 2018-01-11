package com.example.fatboy.cissgin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Fatboy on 17/9/2017.
 */

public class keynotespeakers extends Activity {


    TextView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.menu_home:
                    Intent p = new Intent(keynotespeakers.this, ginasiamain.class);
                    startActivity(p);
                    return true;

                case R.id.menu_map:
                    Intent o = new Intent(keynotespeakers.this, ginmap.class);
                    startActivity(o);
                    return true;
                case R.id.menu_more:
                    Intent intent1 = new Intent(keynotespeakers.this, moreTab.class);
                    startActivity(intent1);
                    return true;

                case R.id.menu_keynote:

                    return true;


                case R.id.menu_schedule:
                    Intent j = new Intent(keynotespeakers.this, ginschedule.class);
                    startActivity(j);
                    return true;


            }
            return true;
        }

    };


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keynote_speakers);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationGin);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.menu_keynote);

        a = (TextView) findViewById(R.id.speakersandpanels);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Avenir.ttc");
        a.setTypeface(myCustomFont);

        b = (TextView) findViewById(R.id.ishmael);
        b.setTypeface(myCustomFont);

        c = (TextView) findViewById(R.id.desc1beah);
        c.setTypeface(myCustomFont);

        d = (TextView) findViewById(R.id.desc2beah);
        d.setTypeface(myCustomFont);

        e = (TextView) findViewById(R.id.humanrights);
        e.setTypeface(myCustomFont);

        f = (TextView) findViewById(R.id.dalglish);
        f.setTypeface(myCustomFont);

        g = (TextView) findViewById(R.id.humanitarian);
        g.setTypeface(myCustomFont);

        h = (TextView) findViewById(R.id.desc1dalglish);
        h.setTypeface(myCustomFont);

        i = (TextView) findViewById(R.id.desc2dalglish);
        i.setTypeface(myCustomFont);

        j = (TextView) findViewById(R.id.twins);
        j.setTypeface(myCustomFont);

        k = (TextView) findViewById(R.id.desc1twins);
        k.setTypeface(myCustomFont);

        l = (TextView) findViewById(R.id.desc2melati);
        l.setTypeface(myCustomFont);

        m = (TextView) findViewById(R.id.teenagers);
        m.setTypeface(myCustomFont);

        n = (TextView) findViewById(R.id.bedard);
        n.setTypeface(myCustomFont);

        o = (TextView) findViewById(R.id.jump);
        o.setTypeface(myCustomFont);

        p = (TextView) findViewById(R.id.desc1bedard);
        p.setTypeface(myCustomFont);

        q = (TextView) findViewById(R.id.desc2bedard);
        q.setTypeface(myCustomFont);

        r = (TextView) findViewById(R.id.phuc);
        r.setTypeface(myCustomFont);

        s = (TextView) findViewById(R.id.Photographer);
        s.setTypeface(myCustomFont);

        t = (TextView) findViewById(R.id.desc1phuc);
        t.setTypeface(myCustomFont);

        u = (TextView) findViewById(R.id.desc2phuc);
        u.setTypeface(myCustomFont);


    }
}
