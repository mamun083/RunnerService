package com.example.mitushi.runnerservice;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class LoginFragment extends Fragment {
    View regView;
    Button goRegistration;

    //private static final String LOGIN_URL = "http://bdthemebazar.com/runnerapps/index.php/customer_super_admin/customer_login";
    private static final String LOGIN_URL = "http://192.168.56.1/runnerapps/index.php/customer_super_admin/customer_login";

    public static final String KEY_USERNAME = "customer_name";
    public static final String KEY_PHONE = "customer_phone";

    //===== for shared preference
    public static final String MyPREFERENCES = "MyPrefs" ;

    Context mContext;
    String cus_phn;

    private EditText editTextCustomer_name;
    private EditText editTextCustomer_phone;
    private Button buttonLogin;


    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        regView = inflater.inflate( R.layout.fragment_login, container, false );

        // ====== Fragment to Activity of Login for Runner service center =====
        goRegistration = (Button) regView.findViewById( R.id.goRegistration );
        goRegistration.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReg = new Intent(getActivity(), RegActivity.class);
                //in.putExtra( "rashid", "some data");
                startActivity( intentReg );
            }
        } );

        editTextCustomer_name = (EditText) regView.findViewById(R.id.editTextCustomer_name);
        editTextCustomer_phone = (EditText) regView.findViewById(R.id.editTextCustomer_phone);

        buttonLogin = (Button) regView.findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        } );

        return regView;
    }


    private void loginUser(){
        final String customer_name = editTextCustomer_name.getText().toString().trim();
        final String customer_phone = editTextCustomer_phone.getText().toString().trim();
        //final String email = editTextEmail.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, LOGIN_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(getActivity(),response,Toast.LENGTH_LONG).show();
                        cus_phn=response;
                        //Toast.makeText( getActivity(),cus_phn, Toast.LENGTH_LONG).show();
                        SharedPreferences sp = getActivity().getSharedPreferences("runnerFile", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.putString("PHONE", cus_phn);
                        //editor.putInt("value",1);
                        editor.commit();

                        //====== Redirect To Home Activit ======
                        if (cus_phn != "Login Invalide") {
                            Intent intentLg = new Intent( getActivity(), MainActivity.class );
                            startActivity( intentLg );
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(),error.toString(),Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put(KEY_USERNAME,customer_name);
                params.put(KEY_PHONE,customer_phone);
                //params.put(KEY_EMAIL, email);
                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        requestQueue.add(stringRequest);
    }
}
