package com.example.fatboy.cissgin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

/**
 * Created by Fatboy on 6/1/2018.
 */

public class r2 extends AppCompatActivity{

    PDFView pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.r2);
        getSupportActionBar().hide();



        pdfViewer = (PDFView)findViewById(R.id.r02);
        pdfViewer.fromAsset("r2.pdf").load();


    }

}
