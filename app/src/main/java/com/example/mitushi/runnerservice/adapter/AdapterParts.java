package com.example.mitushi.runnerservice.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.example.mitushi.runnerservice.AppControler;
import com.example.mitushi.runnerservice.DetailspartsActivity;
import com.example.mitushi.runnerservice.ModelDataParts;
import com.example.mitushi.runnerservice.R;
import com.example.mitushi.runnerservice.RecyclerModelAdapterParts;

import java.util.ArrayList;

/**
 * Created by Morshed on 7/11/2018.
 */

public class AdapterParts extends RecyclerView.Adapter<AdapterParts.MyModelHolder>   {


    Context mContex;
    ArrayList<ModelDataParts> mData;
    ImageLoader imageLoader = AppControler.getInstance().getImageLoader();


    public AdapterParts(Context mContex, ArrayList mData) {
        this.mContex = mContex;
        this.mData = mData;
    }

    @Override
    public AdapterParts.MyModelHolder onCreateViewHolder(ViewGroup parent, int viewType) {



        View v;

        v = LayoutInflater.from(mContex).inflate(R.layout.parts_view,parent,false);
        AdapterParts.MyModelHolder vModelHolder= new AdapterParts.MyModelHolder(v);
        return vModelHolder;
    }

    @Override
    public void onBindViewHolder(AdapterParts.MyModelHolder holder, int position) {
        ModelDataParts modelDataParts =new ModelDataParts();



        //final String item_id = mData.get(position).getItem_id();
        //final String modelparts_photo = mData.get(position).getModelparts_photo();
//        final String modelparts_name = mData.get(position).getModelparts_name();
        final String model_name = mData.get(position).getModel_name();

        //holder.modelparts_photo.setImageUrl(modelparts_photo,imageLoader);
//        holder.modelparts_name.setText(modelparts_name);
        holder.modelparts_modelname.setText(model_name);

        //Toast.makeText(mContex,modelparts_name ,Toast.LENGTH_SHORT).show();
        //=== Recycler View Click listener Start ====//
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Toast.makeText(mContex,modelparts_name ,Toast.LENGTH_SHORT).show();
                //  Toast.makeText(mContex,item_category_name ,Toast.LENGTH_SHORT).show();
                Intent i= new Intent(mContex, DetailspartsActivity.class);

                //===pack data to send
                //i.putExtra("ITEM_ID", item_id);
//                i.putExtra("ITEM_NAME", modelparts_name);
                i.putExtra("MODEL_NAME", model_name);

                //i.putExtra("IMAGE_KEY", modelparts_name);
                //i.putExtra("NAME_OF_POSITON",position_of_list);
                //===start activity
                mContex.startActivity(i);

                //openDetailsActivity (mdlName,mdlImg);
                //Toast.makeText(mContex,item_id ,Toast.LENGTH_SHORT).show();
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
        //private NetworkImageView modelparts_photo;
        private TextView modelparts_name;
        private TextView modelparts_saleprice;
        private TextView modelparts_id;
        private TextView modelparts_categoryname;
        private TextView modelparts_modelname;
        private TextView origin_id;

        public MyModelHolder(View itemView) {
            super(itemView);

            //modelparts_photo = (NetworkImageView) itemView.findViewById(R.id.thumbnailParts);
//            origin_id  = (TextView) itemView.findViewById(R.id.xorigin_id);
//            modelparts_name  = (TextView) itemView.findViewById(R.id.captionParts);
//            modelparts_id = (TextView) itemView.findViewById(R.id.Partsid);
//            modelparts_saleprice = (TextView) itemView.findViewById(R.id.saleprice);
            modelparts_modelname = (TextView) itemView.findViewById(R.id.model_name);
//            modelparts_categoryname = (TextView) itemView.findViewById(R.id.category_name);
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