package com.fujitsu.fac.activities.map;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.fujitsu.fac.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import roboguice.activity.RoboFragmentActivity;
import roboguice.inject.InjectView;

public class MapActivity extends RoboFragmentActivity implements OnMapReadyCallback {

    @InjectView(R.id.back_button)
    private View backBtn;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        this.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng unitedLifeBldg = new LatLng(14.5513, 121.0182);
        LatLng makatiShang = new LatLng(14.5538, 121.0248);
        mMap.addMarker(new MarkerOptions().position(unitedLifeBldg).title("United Life Building"));
        mMap.addMarker(new MarkerOptions().position(makatiShang).title("Makati Shangri-La"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(makatiShang, 16));
    }
}
