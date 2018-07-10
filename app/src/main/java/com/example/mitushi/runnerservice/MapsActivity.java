package com.example.mitushi.runnerservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        //========= Start Toolbar Back Side ==========
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        //========= End Toolbar Back Side ============

        //========= Bottom Menu ============
//        BottomNavigationView BottomNav;
//        BottomNav = (BottomNavigationView) findViewById( R.id.BottomNav );
//        public boolean mapBottomMenu(MenuItem item) {
//            // Handle navigation view item clicks here.
//            int id = item.getItemId();
//
//            if (id == R.id.service_center) {
//                Intent y = new Intent(this,MapsActivity.class);
//                startActivity(y);
//
//            } else if (id == R.id.star_mechanic) {
//
//                Intent y = new Intent(this,MechanicmapActivity.class);
//                startActivity(y);
//
//            } else if (id == R.id.up_service_center) {
//
//                Intent y = new Intent(this,ServicemapActivity.class);
//                startActivity(y);
//            }
//            //MenuItem map_bottom_menu = (MenuItem) findViewById(R.id.bottom_menu);
//            return true;
//        }

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in gazipura and move the camera
        LatLng gazipura = new LatLng(23.9248897, 90.3948497);
        mMap.addMarker(new MarkerOptions().position(gazipura).title("Central Service Center").snippet("01730-405553"));

        LatLng jessore = new LatLng(23.1634014, 89.21816639);
        mMap.addMarker(new MarkerOptions().position(jessore).title("Jessore Service Center").snippet("01730-405531"));

        LatLng chittagong = new LatLng(22.4017512, 91.7587495);
        mMap.addMarker(new MarkerOptions().position(chittagong).title("Chittagong Service Center").snippet("01730-405594"));

        LatLng Comilla = new LatLng(23.4189147, 91.17189880);
        mMap.addMarker(new MarkerOptions().position(Comilla).title("Comilla Service Center").snippet("01730-406834"));

        LatLng Kushtia = new LatLng(23.8704474, 89.09004720);
        mMap.addMarker(new MarkerOptions().position(Kushtia).title("Kushtia Service Center").snippet("01730-405548"));


        LatLng Sirajgonj = new LatLng(24.4655541, 89.7141649);
        mMap.addMarker(new MarkerOptions().position(Sirajgonj).title("Sirajgonj Service Center").snippet("01730-405589"));

        LatLng Bogra = new LatLng(24.8790417, 889.3416670);
        mMap.addMarker(new MarkerOptions().position(Bogra).title("Krishi Progoti Motors").snippet("01730-406451"));

        LatLng Rangpur = new LatLng(25.742079, 89.2333082);
        mMap.addMarker(new MarkerOptions().position(Rangpur).title("Arifin Traders Rangpur").snippet("01796-554408"));

        LatLng Mymensingh = new LatLng(24.7471492, 90.42027340);
        mMap.addMarker(new MarkerOptions().position(Mymensingh).title("Krishi Sheba Motors").snippet("01796-554402"));

        LatLng Jatrabari = new LatLng(23.7450308, 90.36146080);
        mMap.addMarker(new MarkerOptions().position(Jatrabari).title("Rezia Motors Jatrabari").snippet("01730-405563"));

        LatLng Sylhet = new LatLng(24.9075422, 91.8383848);
        mMap.addMarker(new MarkerOptions().position(Sylhet).title("Boshundhara Motors Sylhet").snippet("01796-405547"));

        LatLng Moulvibazar = new LatLng(24.7537103, 91.5596117);
        mMap.addMarker(new MarkerOptions().position(Moulvibazar).title("Jogonnathpur, Moulvibazar").snippet("01730-554403"));

        LatLng Feni = new LatLng(22.9500404, 91.46249060);
        mMap.addMarker(new MarkerOptions().position(Feni).title("Koska Bazar, Feni").snippet("01796-406852"));

        //CameraPosition library= CameraPosition.builder().target( dhaka ).zoom( 16 ).bearing( 0 ).build();
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(gazipura,6));
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
