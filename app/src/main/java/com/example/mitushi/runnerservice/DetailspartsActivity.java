package com.example.mitushi.runnerservice;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class DetailspartsActivity extends AppCompatActivity {

    private static final String REGISTER_URL = "http://bdthemebazar.com/runnerapps/index.php/customer_interest_super_admin/insertCustomerInterestdata";
    //private static final String REGISTER_URL = "http://192.168.56.1/runnerapps/index.php/customer_interest_super_admin/insertCustomerInterestdata";
    public static final String KEY_CUSTOMER_INTEREST_ITEM = "customer_interest_item";
    public static final String KEY_CUSTOMER_INTEREST_STATUS = "customer_interest_status";
    public static final String KEY_CUSTOMER_PHONE = "customer_phone";

    //===== for shared preference
    public static final String MyPREFERENCES = "MyPrefs" ;

    //Button callNow,interestButton;
    ImageButton callNow;
    Button interestButton;

    TextView prtsId,prtsName,item_cat_name,prtsMdlName,parts_sale_price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detailsparts );

        //========= Start Toolbar Back Side ==========
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        //========= End Toolbar Back Side ==========

        prtsId = (TextView)findViewById(R.id.originId);
        prtsName = (TextView)findViewById(R.id.prtsName);
        item_cat_name = (TextView)findViewById(R.id.item_cat_name);
        prtsMdlName = (TextView)findViewById(R.id.item_model);
        parts_sale_price = (TextView)findViewById(R.id.item_sale_price);

        callNow = (ImageButton)findViewById(R.id.callNow);
        interestButton = (Button)findViewById(R.id.interestButton);


        //===RECEIVE DATA FROM FRAGMENT RECYCLER ADAPTER
        Intent i = this.getIntent();
        //String position= i.getExtras().getString("NAME_OF_POSITON");
         //String item_id= i.getExtras().getString("ITEM_ID");
         String modelparts_id= i.getExtras().getString("ORIGIN_ID");
         String modelparts_name= i.getExtras().getString("ITEM_NAME");
         String item_category_name= i.getExtras().getString("ITEM_CATEGORY");
         String model_name= i.getExtras().getString("MODEL_NAME");
         String item_sale_price= i.getExtras().getString("ITEM_PRICE");

        Toast.makeText( getApplicationContext(),"====="+model_name+"=====",Toast.LENGTH_SHORT).show();
        //prtsId.setText( item_id );
        prtsId.setText( modelparts_id );
        prtsName.setText( modelparts_name );
        item_cat_name.setText( item_category_name );
        prtsMdlName.setText( model_name );
        parts_sale_price.setText( item_sale_price );


        callNow.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent( Intent.ACTION_CALL );
                callIntent.setData( Uri.parse( "tel:01730405566" ) );

                if (ActivityCompat.checkSelfPermission(DetailspartsActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }

                startActivity( callIntent );
                }
        });


        SharedPreferences sp = getSharedPreferences("runnerFile", Context.MODE_PRIVATE);
        //SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(DetailspartsActivity.this);
        String restoredText = sp.getString("PHONE", null);

        interestButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sp = getSharedPreferences("runnerFile", Context.MODE_PRIVATE);
                //SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(DetailspartsActivity.this);
                String restoredText = sp.getString("PHONE", null);

                if (restoredText ==null){

                    Toast.makeText(getApplicationContext(),"Please Login ",Toast.LENGTH_LONG).show();
                    Intent x = new Intent(DetailspartsActivity.this,MainActivity.class);
                    startActivity(x);
                }else {

                    customerInterest( restoredText);
                }
            }
        });
    }

    private void customerInterest(String response){
        final String customer_interest_item = prtsName.getText().toString().trim();
        final String customer_interest_status = interestButton.getText().toString().trim();

        final String customer_phone = response;

       /* SharedPreferences sp = getSharedPreferences("runnerFile", Context.MODE_PRIVATE);
        //SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(DetailspartsActivity.this);
        String restoredText = sp.getString("PHONE",null);
        Toast.makeText(this,restoredText,Toast.LENGTH_LONG).show();*/

      //  final String customer_phone = restoredText; //sp.getString("text", " ");

        StringRequest stringRequest = new StringRequest(Request.Method.POST, REGISTER_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(DetailspartsActivity.this,response,Toast.LENGTH_LONG).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(DetailspartsActivity.this,error.toString(),Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put(KEY_CUSTOMER_INTEREST_ITEM,customer_interest_item);
                params.put(KEY_CUSTOMER_INTEREST_STATUS,customer_interest_status);
                params.put(KEY_CUSTOMER_PHONE, customer_phone);
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(DetailspartsActivity.this);
        requestQueue.add(stringRequest);
    }
}
