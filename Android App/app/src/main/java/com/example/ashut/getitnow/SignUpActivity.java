package com.example.ashut.getitnow;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        final EditText name,email,pwd,phn,address;
        name = (EditText)findViewById(R.id.etName);
        email = (EditText)findViewById(R.id.etEmail);
        pwd = (EditText)findViewById(R.id.etPassword);
        phn = (EditText)findViewById(R.id.etPhn);
        address = (EditText)findViewById(R.id.etAddress);

        final Button reset,signup;
        reset=(Button)findViewById(R.id.bReset);
        signup=(Button)findViewById(R.id.bSignUp);
        reset.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                name.setText("");
                email.setText("");
                pwd.setText("");
                phn.setText("");
            }
        });




    }
    public void signUp(View v){
        Intent i=new Intent(SignUpActivity.this,MainActivity.class);
        startActivity(i);
    }

}
