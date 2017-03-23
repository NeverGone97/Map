package com.example.nut_it.map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.nut_it.map.Adapter.GridViewAdapter;
import com.example.nut_it.map.Interface.EventInterface;
import com.example.nut_it.map.Interface.ImageFull;

public class PlaceInformation extends AppCompatActivity {

    private GridView gvList;
    public EventInterface eventInterface;
    public boolean check = true;
    public static String[] mThumIds = {
            "https://avatars3.githubusercontent.com/u/1?v=3",
            "http://bwhere.vn/uploads/small/020624f747cb79aecd10.png",
            "https://avatars3.githubusercontent.com/u/1?v=3",
            "https://avatars3.githubusercontent.com/u/1?v=3",
            "https://avatars3.githubusercontent.com/u/1?v=3",
            "https://avatars3.githubusercontent.com/u/1?v=3",
            "https://avatars3.githubusercontent.com/u/1?v=3",
    };
    int[] ten = {R.drawable.more, R.drawable.more, R.drawable.more, R.drawable.more, R.drawable.more, R.drawable.more, R.drawable.more};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_information);
        eventInterface = new EventInterface() {
            @Override
            public void eventClick() {
                check = false;
                gvList = (GridView) findViewById(R.id.gridview);
                gvList.setAdapter(new GridViewAdapter(getApplicationContext(), ten, mThumIds, eventInterface, check));
                gvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(getApplicationContext(), ImageFull.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                    }
                });
            }
        };
        gvList = (GridView) findViewById(R.id.gridview);
        gvList.setAdapter(new GridViewAdapter(this, ten, mThumIds, eventInterface, check));
        gvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PlaceInformation.this, ImageFull.class);
                intent.putExtra("id", position);
                startActivity(intent);
            }
        });
    }
}
