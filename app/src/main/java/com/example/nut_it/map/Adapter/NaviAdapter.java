package com.example.nut_it.map.Adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.nut_it.map.Model.Navi;
import com.example.nut_it.map.R;

import java.util.List;


/**
 * Created by Nut_IT on 3/18/2017.
 */

public class NaviAdapter extends ArrayAdapter<Navi> {
    Activity context;
    int resource;
    List<Navi> objects;
    public NaviAdapter(Activity context, int resource, List<Navi> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View row=inflater.inflate(this.resource,null);

        Navi navi= this.objects.get(position);
        ImageView image= (ImageView) row.findViewById(R.id.imgNavi);
        Bitmap bitmap= BitmapFactory.decodeResource(this.context.getResources(),navi.getHinh());
        RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(this.context.getResources(),bitmap);
        roundedBitmapDrawable.setCircular(true);
        image.setImageDrawable(roundedBitmapDrawable);
        return row;
    }
}
