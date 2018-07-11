package com.example.mitushi.runnerservice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerModelAdapterCat extends RecyclerView.Adapter<RecyclerModelAdapterCat.MyModelHolder> {
    Context mContex;
    ArrayList<ModelDataCat> mData;
    ImageLoader imageLoader = AppControler.getInstance().getImageLoader();
    String mdlName;

    public RecyclerModelAdapterCat(Context mContex, ArrayList<ModelDataCat> mData) {
        this.mContex = mContex;
        this.mData=mData;
        //... Some fields initialization here
        notifyDataSetChanged();

    }

    @Override
    public RecyclerModelAdapterCat.MyModelHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContex).inflate(R.layout.catgory_parts_view,parent,false);
        RecyclerModelAdapterCat.MyModelHolder vModelHolder= new RecyclerModelAdapterCat.MyModelHolder(v);
        return vModelHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerModelAdapterCat.MyModelHolder holder, int position) {

        final String modelcat_photo = mData.get(position).getModelcat_photo();
        final String modelcat_name = mData.get(position).getModelcat_name();
        //final String modelcat_details = mData.get(position).getModelcat_details();
        holder.modelcat_photo.setImageUrl(modelcat_photo,imageLoader);
        holder.modelcat_name.setText(modelcat_name);
        //holder.modelcat_details.setText(modelcat_details);


        ModelDataCat ModelDataCat = new ModelDataCat();

        mdlName = ModelDataCat.getModel_name();


        //=== Recycler View Click listener Start ====//
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContex,modelcat_name ,Toast.LENGTH_SHORT).show();

                //Toast.makeText(mContex,mdlName ,Toast.LENGTH_SHORT).show();
                Intent i= new Intent(mContex, PartsActivity.class);

                //===pack data to send
                i.putExtra("NAME_KEY", modelcat_name);
                //i.putExtra("IMAGE_KEY", modelcat_photo);
                i.putExtra("NAME_KEY_MODEL", mdlName);
                //i.putExtra("NAME_OF_POSITON",position_of_list);
                //===start activity
                mContex.startActivity(i);

                //openDetailsActivity (mdlName,mdlImg);
                //Toast.makeText(mContex,mdlImg ,Toast.LENGTH_SHORT).show();
                //Toast.makeText(mContex,"Hello",Toast.LENGTH_SHORT).show();

            }
        });
        //=== Recycler View Click listener End ====//
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyModelHolder extends RecyclerView.ViewHolder{
        private NetworkImageView modelcat_photo;
        private TextView modelcat_name;
        private TextView modelcat_details;

        public MyModelHolder(View itemView) {
            super(itemView);

            modelcat_photo = (NetworkImageView) itemView.findViewById(R.id.thumbnail_cat);
            modelcat_name  = (TextView) itemView.findViewById(R.id.caption_cat);
            //modelcat_details  = (TextView) itemView.findViewById(R.id.modelcat_details);
        }

    }

//    private void openDetailsActivity(String mdlName, int mdlImg){
//        Intent i= new Intent(mContex, PartsActivity.class);
//
//        //===pack data to send
//        i.putExtra("NAME_KEY", mdlName);
//        i.putExtra("IMAGE_KEY", mdlImg);
//
//        //===start activity
//        mContex.startActivity(i);
//    }
}

