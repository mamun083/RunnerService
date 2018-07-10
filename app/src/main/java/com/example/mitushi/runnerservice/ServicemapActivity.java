package com.example.mitushi.runnerservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ServicemapActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_servicemap );
        //========= Start Toolbar Back Side ==========
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        //========= End Toolbar Back Side ==========
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapService);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //==== Authorize Cervice Center
        LatLng Chittagong = new LatLng(22.8903502, 91.5357824);
        mMap.addMarker(new MarkerOptions().position(Chittagong).title("3-Star Motors Chittagong").snippet("01796-554320"));

        LatLng Faridpur = new LatLng(23.5423919, 89.6308920);
        mMap.addMarker(new MarkerOptions().position(Faridpur).title("Hossain Motor Works Faridpur").snippet("01796-554305"));

        LatLng Barisal = new LatLng(22.7010021, 90.35345110);
        mMap.addMarker(new MarkerOptions().position(Barisal).title("Tuhin Automobile Barisal").snippet("01796-554350"));

        LatLng Noakhali = new LatLng(22.93449, 91.1006929);
        mMap.addMarker(new MarkerOptions().position(Noakhali).title("City Automobile & Service Center Noakhali").snippet("01796-554312"));

        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(Chittagong,6));
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.service_center) {
            Intent y = new Intent(this,MapsActivity.class);
            startActivity(y);

        } else if (id == R.id.star_mechanic) {

            Intent y = new Intent(this,MechanicmapActivity.class);
            startActivity(y);

        } else if (id == R.id.up_service_center) {

            Intent y = new Intent(this,ServicemapActivity.class);
            startActivity(y);
        }

        else if (id == R.id.dealer_service) {

            Intent y = new Intent(this,DealermapActivity.class);
            startActivity(y);
        }
        //MenuItem map_bottom_menu = (MenuItem) findViewById(R.id.bottom_menu);
        return true;
    }
}
