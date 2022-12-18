package com.example.superb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;




public class MainActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {

        mMap = googleMap;

        LatLng googdong = new LatLng(36.3648550, 127.3510750);
        LatLng yotgol = new LatLng(36.3625764, 127.3485400);
        LatLng janghyun = new LatLng(36.3611123, 127.3428605);
        LatLng jangdaedong = new LatLng(36.3619329, 127.3404891);
        LatLng yurim = new LatLng(36.3601266, 127.3574370);

        MarkerOptions markerOptions = new MarkerOptions();

        markerOptions.position(googdong);
        markerOptions.title("궁동근린공원화장실");
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(googdong, 13));


        markerOptions.position(yotgol);
        markerOptions.title("욧골어린이공원화장실");
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(yotgol, 13));



        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(@NonNull Marker marker) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
                return false;
            }
        });


        markerOptions.position(janghyun);
        markerOptions.title("장현근린공원화장실");
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(janghyun, 13));

        markerOptions.position(jangdaedong);
        markerOptions.title("장대동화장실");
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jangdaedong, 13));

        markerOptions.position(yurim);
        markerOptions.title("유림공원화장실");
        mMap.addMarker(markerOptions);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(yurim, 15));

    }

    }

