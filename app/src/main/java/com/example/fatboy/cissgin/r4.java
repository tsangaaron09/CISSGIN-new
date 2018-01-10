package com.example.fatboy.cissgin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by Fatboy on 6/1/2018.
 */

public class r4 extends AppCompatActivity{

    PDFView pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r4);
        getSupportActionBar().hide();



        pdfViewer = (PDFView)findViewById(R.id.r04);
        pdfViewer.fromAsset("r4.pdf").load();


    }

}
