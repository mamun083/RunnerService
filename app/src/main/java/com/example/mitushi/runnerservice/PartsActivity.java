package com.example.mitushi.runnerservice;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static com.example.mitushi.runnerservice.AppControler.TAG;

public class PartsActivity extends AppCompatActivity {

    private ArrayList<ModelDataParts> recyclerModelData= new ArrayList<>( ) ;
    private RecyclerView recyclerModelPartsView;
    private RecyclerModelAdapterParts adapter;
    private ProgressDialog pDialog;

    // Log tag
    //private static final String TAG = PartsActivity.class.getSimpleName();

    // Movies json url
    private static final String base_url = "http://bdthemebazar.com/runnerapps/";
    private static final String url = "http://bdthemebazar.com/runnerapps/all_api/api_parts";
    String parts_cat_name,parts_model_name;
    //private static final String base_url = "http://192.168.56.1/runnerapps/";
    //private static final String url = "http://192.168.56.1/runnerapps/all_api/api_parts";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_parts);

        recyclerModelPartsView = (RecyclerView) findViewById( R.id.recycleModelparts);
        adapter = new RecyclerModelAdapterParts(this, recyclerModelData );

        recyclerModelPartsView.setLayoutManager( new LinearLayoutManager( this ) );
        recyclerModelPartsView.setAdapter( adapter );

        pDialog = new ProgressDialog(this);
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading... Parts");
        pDialog.show();

        Intent i = this.getIntent();
        //String position= i.getExtras().getString("NAME_OF_POSITON");

        parts_cat_name = i.getExtras().getString("NAME_KEY");
        parts_model_name = i.getExtras().getString("NAME_KEY_MODEL");

        JsonArrayRequest movieReq = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d(TAG, response.toString());
                        hidePDialog();

                        // Parsing json
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject obj = response.getJSONObject(i);
                                ModelDataParts ModelDataParts = new ModelDataParts();

                                String item_cat_name = obj.getString("item_category_name");

                                String model_name = obj.getString("model_name");


//                                Log.i( "Parts",""+item_cat_name.toString() );
                                Log.i( "Parts",""+model_name.toString() );

                                if(item_cat_name.equals( parts_cat_name)&& model_name.equals(parts_model_name)){

                                    //ModelDataParts.setItem_id(obj.getString("item_id"));
                                    //ModelDataParts.setModelparts_photo(base_url+obj.getString("item_pic"));
                                    ModelDataParts.setOrigin_id(obj.getString("origin_id"));
                                    ModelDataParts.setModelparts_name(obj.getString("item_name"));
                                    ModelDataParts.setItem_category_name(obj.getString("item_category_name"));
                                    ModelDataParts.setModel_name(obj.getString("model_name"));
                                    ModelDataParts.setItem_sale_price(obj.getString("item_sale_price"));
                                }


                                // adding movie to movies array
                                recyclerModelData.add(ModelDataParts);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }

                        // notifying list adapter about data changes
                        // so that it renders the list view with updated data
                           adapter.notifyDataSetChanged();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                hidePDialog();

            }
        });

        // Adding request to request queue
        AppControler.getInstance().addToRequestQueue(movieReq);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        hidePDialog();
    }

    private void hidePDialog() {
        if (pDialog != null) {
            pDialog.dismiss();
            pDialog = null;
        }
    }


}
