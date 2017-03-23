package com.example.nut_it.map.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nut_it.map.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by Mai Duan on 19/03/2017.
 */

public class InfoWindowAdapter implements GoogleMap.InfoWindowAdapter {
    TextView tvLoOfTi, tvPhone, tvName;
    ImageView imgLocation, imgNext;

    double x = 21.035716, y = 105.765011;
    LayoutInflater inflater = null;
    String name = "duan", addOfLocation = "mai", phone = "5555";

    public InfoWindowAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @Override
    public View getInfoWindow(Marker arg0) {
        View v = inflater.inflate(R.layout.windown_layout, null);
//        if (marker != null) {
        tvName = (TextView) v.findViewById(R.id.tvName);
        tvLoOfTi = (TextView) v.findViewById(R.id.tvLoOfTi);
        tvPhone = (TextView) v.findViewById(R.id.tvPhone);
        imgLocation = (ImageView) v.findViewById(R.id.imgLocation);
        imgNext = (ImageView) v.findViewById(R.id.imgNext);

//        LatLng latLng = new LatLng(x, y);
////            tvName.setText(marker.getTitle());
        LatLng latLng = arg0.getPosition();

        tvName.setText(name);
        tvLoOfTi.setText(addOfLocation);
        tvPhone.setText(phone);

        imgLocation.setImageResource(R.drawable.category10);
        imgNext.setImageResource(R.drawable.nextpage);


    return v;

}
    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
