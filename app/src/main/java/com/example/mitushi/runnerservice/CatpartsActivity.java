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

public class CatpartsActivity extends AppCompatActivity {

    private ArrayList<ModelDataCat> recyclerModelData= new ArrayList<>( ) ;
    private RecyclerView recyclerModelCatView;
    private RecyclerModelAdapterCat adapter;
    private ProgressDialog pDialog;
    // Log tag
    //private static final String TAG = CatpartsActivity.class.getSimpleName();

    // Movies json url
    private static final String base_url = "http://bdthemebazar.com/runnerapps/";
    private static final String url = "http://bdthemebazar.com/runnerapps/all_api/api_parts_category";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catparts);

        recyclerModelCatView = (RecyclerView) findViewById(R.id.recycleModelCat);
        adapter = new RecyclerModelAdapterCat(this, recyclerModelData );

        recyclerModelCatView.setLayoutManager(new LinearLayoutManager(this));
        recyclerModelCatView.setAdapter( adapter);

        pDialog = new ProgressDialog(this);
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading... Models Category");
        pDialog.show();

        ModelDataCat ModelDataCat = new ModelDataCat();
        Intent i = this.getIntent();
        //String position= i.getExtras().getString("NAME_OF_POSITON");

        String mdlName= i.getExtras().getString("NAME_KEY_MODEL");

       // Toast.makeText(getApplicationContext(),mdlName,Toast.LENGTH_SHORT ).show();

        ModelDataCat.setModel_name( mdlName );

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
                                ModelDataCat ModelDataCat = new ModelDataCat();
                                ModelDataCat.setModelcat_name(obj.getString("item_category_name"));
                                //ModelDataCat.setModelcat_name(obj.getString("item_category_details"));
                                ModelDataCat.setModelcat_photo(base_url+obj.getString("item_category_pic"));

                                // adding movie to movies array
                                recyclerModelData.add(ModelDataCat);

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
