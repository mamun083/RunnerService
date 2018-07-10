package com.example.mitushi.runnerservice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerModelAdapter extends RecyclerView.Adapter<RecyclerModelAdapter.MyModelHolder> {
    Context mContex;
    ArrayList<ModelData> mData;
    ImageLoader imageLoader = AppControler.getInstance().getImageLoader();


    public RecyclerModelAdapter(Context mContex, ArrayList mData) {
        this.mContex = mContex;
        this.mData = mData;
    }

    @Override
    public MyModelHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContex).inflate(R.layout.layout_model,parent,false);
        MyModelHolder vModelHolder= new MyModelHolder(v);
        return vModelHolder;
    }

    @Override
    public void onBindViewHolder(MyModelHolder holder, int position) {

        final String mdlImg = mData.get(position).getModel_photo();
        final String mdlName = mData.get(position).getModel_name();
        holder.modelPhoto.setImageUrl(mdlImg,imageLoader);
        holder.modelName.setText(mdlName);

        //=== Recycler View Click listener Start ====//
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mContex,mdlName ,Toast.LENGTH_SHORT).show();
                Intent i= new Intent(mContex, CatpartsActivity.class);
                //Intent i= new Intent(mContex, CatpartsActivity.class);

                //===pack data to send
                i.putExtra("NAME_KEY_MODEL", mdlName);
                i.putExtra("IMAGE_KEY", mdlImg);
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
        private NetworkImageView modelPhoto;
        private TextView modelName;

        public MyModelHolder(View itemView) {
            super(itemView);

            modelPhoto = (NetworkImageView) itemView.findViewById(R.id.thumbnail);
            modelName  = (TextView) itemView.findViewById(R.id.textM10050);
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

