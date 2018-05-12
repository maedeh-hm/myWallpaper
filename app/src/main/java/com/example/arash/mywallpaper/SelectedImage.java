package com.example.arash.mywallpaper;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

class SelectedImage extends AppCompatActivity {

    int imageID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_image_activity);

        imageID = (int) getIntent().getSerializableExtra("ImageID"); // get Intent which we set from Previous Activity

        ImageView iv = (ImageView)findViewById(R.id.selectedImage);
        iv.setImageResource(imageID);

    }

    public void setAsWallpaper(View view) {

        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());

        try {
            myWallpaperManager.setResource(imageID);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
