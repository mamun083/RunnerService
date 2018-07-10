package com.example.mitushi.runnerservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    Button rscBtn, ascBtn,rsmBtn,spdealer;
    View gView;
    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        gView = inflater.inflate(R.layout.fragment_gallery, container, false);

        // ====== Fragment to Activity for Runner service center =====
        rscBtn = (Button) gView.findViewById( R.id.rscBtn );
        rscBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRsc = new Intent(getActivity(), MapsActivity.class);
                //in.putExtra( "rashid", "some data");
                startActivity( intentRsc );
            }
        } );

        // ====== Fragment to Activity for service Authorize Service Center =====
        ascBtn = (Button) gView.findViewById( R.id.ascBtn );
        ascBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAsc = new Intent(getActivity(), ServicemapActivity.class);
                //in.putExtra( "rashid", "some data");
                startActivity( intentAsc );
            }
        } );

        // ====== Fragment to Activity for Star Mechanic Center =====
        rsmBtn = (Button) gView.findViewById( R.id.rsmBtn );
        rsmBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRsm = new Intent(getActivity(), MechanicmapActivity.class);
                //in.putExtra( "rashid", "some data");
                startActivity( intentRsm );
            }
        } );

        // ====== Fragment to Activity for Spare Parts Dealer =====
        spdealer = (Button) gView.findViewById( R.id.spdealer );
        spdealer.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRsm = new Intent(getActivity(), DealermapActivity.class);
                //in.putExtra( "rashid", "some data");
                startActivity( intentRsm );
            }
        } );

        return gView;
    }

}
