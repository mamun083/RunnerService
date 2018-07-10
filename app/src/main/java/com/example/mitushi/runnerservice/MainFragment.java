package com.example.mitushi.runnerservice;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static com.example.mitushi.runnerservice.AppControler.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    View rootView;
    private ArrayList<ModelData> recyclerModelData= new ArrayList<>( ) ;
    private RecyclerView recyclerModelView;
    private RecyclerModelAdapter modelAdapter;
    private ProgressDialog pDialog;

    private static final String base_url = "http://bdthemebazar.com/runnerapps/";
    private static final String url = "http://bdthemebazar.com/runnerapps/all_api/api_model";

    //private static final String base_url="http://192.168.56.1/runnerapps/";
    //private static final String url="http://192.168.56.1/runnerapps/all_api/api_model";

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        recyclerModelView = (RecyclerView) rootView.findViewById(R.id.recycleModel);
        modelAdapter      = new RecyclerModelAdapter(getContext(), recyclerModelData);
        recyclerModelView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerModelView.setAdapter(modelAdapter);


        pDialog = new ProgressDialog(getActivity());
        // Showing progress dialog before making http request
        pDialog.setMessage("Loading... Models");
        pDialog.show();

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
                                    ModelData modelData = new ModelData();
                                    modelData.setModel_name(obj.getString("model_name"));
                                    modelData.setModel_photo(base_url+obj.getString("model_pic"));

                                // adding movie to movies array
                                recyclerModelData.add(modelData);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }

                        // notifying list adapter about data changes
                        // so that it renders the list view with updated data
                        modelAdapter.notifyDataSetChanged();
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

        return rootView;
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
