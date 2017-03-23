package com.example.nut_it.map.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.nut_it.map.Interface.EventInterface;
import com.example.nut_it.map.R;
import com.squareup.picasso.Picasso;


public class GridViewAdapter extends BaseAdapter implements View.OnClickListener{
    ImageButton imageButton;
    private Context mContext;
    private int[] tenLogo;
    public static String[] mThumIds;
    public boolean check;
    public EventInterface eventInterface;

    public GridViewAdapter(Context context, int[] tenLogo, String[] mThumIds, EventInterface eventInterface, boolean check) {
        mContext = context;
        this.tenLogo = tenLogo;
        this.mThumIds = mThumIds;
        this.eventInterface = eventInterface;
        this.check = check;
    }

    public GridViewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public Object getItem(int position) {
        return mThumIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.grid_view_custom, null);
        final ImageView imageView = (ImageView) convertView.findViewById(R.id.imgView);
        imageButton = (ImageButton) convertView.findViewById(R.id.imageButton3);
        imageButton.setImageResource(tenLogo[position]);

        if (check){
            if (position >= 4) {
                imageView.setVisibility(View.INVISIBLE);
            }
            if (position != 3) {
                imageButton.setVisibility(View.INVISIBLE);
            }
        }
        else{
            imageView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.GONE);
        }
        imageButton.setOnClickListener(this);

        String url = (String) getItem(position);
        Picasso.with(mContext)
                .load(url)
                .placeholder(R.drawable.loader)
                .fit()
                .centerCrop().into(imageView);
        return convertView;
    }

    @Override
    public void onClick(View v) {
        eventInterface.eventClick();
    }
}
