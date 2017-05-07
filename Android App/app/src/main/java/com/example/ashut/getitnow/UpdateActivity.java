package com.example.ashut.getitnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UpdateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        final EditText name,email,pwd,phn,address;
        name = (EditText)findViewById(R.id.etName);
        email = (EditText)findViewById(R.id.etEmail);
        pwd = (EditText)findViewById(R.id.etPassword);
        phn = (EditText)findViewById(R.id.etPhn);
        address = (EditText)findViewById(R.id.etAddress);

        Button reset =(Button)findViewById(R.id.bReset);
        reset.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                name.setText("");
                email.setText("");
                pwd.setText("");
                phn.setText("");
                address.setText("");
            }
        });
        Button save=(Button)findViewById(R.id.bSave);
        save.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(UpdateActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}
