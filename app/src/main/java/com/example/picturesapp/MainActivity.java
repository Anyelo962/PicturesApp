package com.example.picturesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import Adapter.GalleryPictures;

public class MainActivity extends AppCompatActivity {

    GridView gridViewImages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridViewImages = findViewById(R.id.idGrid_view);
        gridViewImages.setAdapter(new GalleryPictures(this));
    }
}