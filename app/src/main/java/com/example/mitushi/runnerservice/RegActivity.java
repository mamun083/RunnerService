package com.example.mitushi.runnerservice;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

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

public class RegActivity extends AppCompatActivity {

    //private static final String REGISTER_URL = "http://bdthemebazar.com/runnerapps/index.php/customer_super_admin/register_customer";
    private static final String REGISTER_URL = "http://192.168.56.1/runnerapps/index.php/customer_super_admin/register_customer";
    public static final String KEY_USERNAME = "customer_name";
    public static final String KEY_PHONE = "customer_phone";
    //public static final String KEY_EMAIL = "customer_email";


    private EditText editReg_name;
    private EditText editReg_phone;
    private EditText editReg_email;

    private Button buttonRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_reg );
        //========= Start Toolbar Back Side ==========
        getSupportActionBar().setDisplayShowHomeEnabled( true );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        //========= End Toolbar Back Side ==========

        editReg_name = (EditText) findViewById(R.id.editReg_name);
        editReg_phone = (EditText) findViewById(R.id.editReg_phone);
        //editReg_email= (EditText) findViewById(R.id.editReg_email);

        buttonRegister = (Button) findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        } );
    }

    private void registerUser(){
        final String customer_name = editReg_name.getText().toString().trim();
        final String customer_phone = editReg_phone.getText().toString().trim();
        //final String customer_email = editReg_email.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, REGISTER_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(RegActivity.this,response,Toast.LENGTH_LONG).show();

                        //====== Redirect To Login Fragment ======
//                        FragmentManager fragmentManager = getFragmentManager ();
//                        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction ();
//                        LoginFragment LoginFragment = new LoginFragment();  //your fragment
//
//                        fragmentTransaction.add (R.id.fragment_container, LoginFragment);
//                        fragmentTransaction.commit ();


                        /*==FragmentManager fragmentManager = getFragmentManager ();
                        LoginFragment fragment =  new LoginFragment();
                        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction ();

                        fragmentTransaction.replace( R.id.fragment_container, fragment );
                        fragmentTransaction.commit();==*/
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(RegActivity.this,error.toString(),Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put(KEY_USERNAME, customer_name);
                params.put(KEY_PHONE,customer_phone);
                //params.put(KEY_EMAIL, customer_email);
                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
