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

public class MechanicmapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_mechanicmap );
        //========= Start Toolbar Back Side ==========
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        //========= End Toolbar Back Side ==========

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mechanicmapService);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Tangail. and move the camera
        LatLng Tangail = new LatLng(24.4767377, 90.037320);
        mMap.addMarker(new MarkerOptions().position(Tangail).title("Md.Anwar Hossain Tangail").snippet("01796554306"));

        LatLng Narsingdhi = new LatLng(24.0044126, 90.78547149);
        mMap.addMarker(new MarkerOptions().position(Narsingdhi).title("Md.Alamgir Hossain").snippet("01796554353"));

        LatLng Manikgonj = new LatLng(23.8722379, 90.004158);
        mMap.addMarker(new MarkerOptions().position(Manikgonj).title("Shodip Biswas").snippet("01796554333"));

        LatLng Elenga = new LatLng(24.3385801, 89.92181929);
        mMap.addMarker(new MarkerOptions().position(Elenga).title("Md.Nurul Islam").snippet("01796554342"));

        LatLng Bhaluka = new LatLng(24.3807016, 90.3774965);
        mMap.addMarker(new MarkerOptions().position(Bhaluka).title("Md.Alimuddin").snippet("01796554321"));

        LatLng Mirpur = new LatLng(23.8314422, 90.4147006);
        mMap.addMarker(new MarkerOptions().position(Mirpur).title("Md.Abdul Malak(Khalak").snippet("01796554344"));

        LatLng Jamalpur = new LatLng(25.0746235, 90.14949039);
        mMap.addMarker(new MarkerOptions().position(Jamalpur).title("Md.Jhangir Alom)").snippet("01796554347"));

        LatLng Natore = new LatLng(24.3935349, 89.0148461);
        mMap.addMarker(new MarkerOptions().position(Natore).title("Md.Mojibur Rahman").snippet("01796554304"));

        LatLng Dinajpur = new LatLng(25.644478, 88.6463249);
        mMap.addMarker(new MarkerOptions().position(Dinajpur).title("Md.Abdul Aziz").snippet("01796554307"));

        LatLng Lalmonirhat = new LatLng(25.9118255, 89.43400489);
        mMap.addMarker(new MarkerOptions().position(Lalmonirhat).title("Md.jalal Uddin").snippet("01796554325"));

        LatLng Kashinathpur = new LatLng(24.076563, 89.6145699);
        mMap.addMarker(new MarkerOptions().position(Kashinathpur).title("Md.Atiar Hossain").snippet("01796554308"));

        LatLng rajshahi = new LatLng(24.3635886, 88.62413509);
        mMap.addMarker(new MarkerOptions().position(rajshahi).title("Md. Al- Mamun").snippet("01796554348"));

        LatLng Noakhali = new LatLng(22.8241015, 91.09858770);
        mMap.addMarker(new MarkerOptions().position(Noakhali).title("Md.Fakrul Islam (Mizan)").snippet("01796554309"));

        LatLng Chandpur = new LatLng(23.2332252, 90.6484964);
        mMap.addMarker(new MarkerOptions().position(Chandpur).title("Md.yearul Alam").snippet("01796554314"));

        LatLng Lakshmipur = new LatLng(22.9461135, 90.81330579);
        mMap.addMarker(new MarkerOptions().position(Lakshmipur).title("Delowar Hossain").snippet("01796554315"));

        LatLng Brahmanhat = new LatLng(22.4424966, 91.92382350);
        mMap.addMarker(new MarkerOptions().position(Brahmanhat).title("Zafor Ahmad").snippet("01796554357"));

        LatLng Rupsha = new LatLng(22.8220512, 89.63457960);
        mMap.addMarker(new MarkerOptions().position(Rupsha).title("Md. Shahidul Islam Sagor").snippet("01796554301"));

        LatLng Boyra = new LatLng(22.8287428, 89.542568);
        mMap.addMarker(new MarkerOptions().position(Boyra).title("Md. Abdul Halim").snippet("01796554302"));

        LatLng Rajbari = new LatLng(23.7035342, 89.73263240);
        mMap.addMarker(new MarkerOptions().position(Rajbari).title("Md. Ali Khokon").snippet("01796554359"));

        LatLng Bonparapara = new LatLng(24.410243, 89.007617);
        mMap.addMarker(new MarkerOptions().position(Bonparapara).title("Md. Masud Parvez Munna").snippet("01796554340"));

        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(Tangail,6));

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
