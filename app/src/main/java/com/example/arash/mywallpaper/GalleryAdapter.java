package com.example.arash.mywallpaper;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;


/**
 * Created by Maedeh on 4/12/2018.
 */

public class GalleryAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private Integer[] images;

    GalleryAdapter(Context applicationContext, Integer[] images) {
        inflater = (LayoutInflater.from(applicationContext));
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = inflater.inflate(R.layout.gridview_item, parent, false); // inflate the layout
        }
        ImageView defaultImage = (ImageView) view.findViewById(R.id.CellImage); // get the reference of ImageView
       // defaultImage.setImageURI(Uri.parse(getItem(position).toString()));
        defaultImage.setImageResource(images[position]);
        return view;
    }
}
