package com.example.arash.mywallpaper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by Maedeh on 4/12/2018.
 */

public class mainPageGallery extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_gallery);

        final Integer[] images = new Integer[]{R.drawable.seashell,R.drawable.seashell3,R.drawable.seashell4,
                                                R.drawable.seashell7,R.drawable.seashell9};

        GridView gv = (GridView)findViewById(R.id.mainGallery);
        gv.setAdapter(new GalleryAdapter(this,images));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @SuppressLint("MissingPermission")
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = new Intent(mainPageGallery.this, SelectedImage.class);
                intent.putExtra("ImageID", images[position]); // put gameCellInfo in Intent
                startActivity(intent);
            }
        });
    }

    public void favoriteWallpapers(View view) {

        //TODO
    }
}
