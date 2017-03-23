package com.example.nut_it.map.Interface;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.nut_it.map.Adapter.GridViewAdapter;
import com.example.nut_it.map.R;

import java.io.InputStream;

/**
 * Created by Nut_IT on 3/19/2017.
 */

public class ImageFull extends Activity{
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);
        Intent intent=getIntent();

        int position=intent.getExtras().getInt("id");
        GridViewAdapter gridViewAdapter=new GridViewAdapter(this);
        image= (ImageView) findViewById(R.id.imgFull);
        String url= (String) gridViewAdapter.getItem(position);
        new DownloadImage().execute(url);
    }
    private class DownloadImage extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... URL) {
            String imageURL = URL[0];
            Bitmap bitmap = null;
            try {
                InputStream input = new java.net.URL(imageURL).openStream();
                bitmap = BitmapFactory.decodeStream(input);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            image.setImageBitmap(result);
        }
    }

}