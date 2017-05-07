package com.example.ashut.getitnow;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView tvSignUp=(TextView)findViewById(R.id.tvSignUp);

        tvSignUp.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(i);
            }
        });





}
    public void loginClicked(View v){
        EditText login,pwd;
        login=(EditText) findViewById(R.id.etEmail);
        pwd=(EditText) findViewById(R.id.etPassword);

        String log=login.getText().toString();
        String pass=pwd.getText().toString();
        if(log=="ashu@gmail.com"&&pass=="1234")
        {
        Intent i= new Intent(LoginActivity.this,MainActivity.class);
            startActivity(i);
        }
        else  {
            Toast t = Toast.makeText(getApplicationContext(), "Please Check Id & Password", Toast.LENGTH_LONG);
            t.show();
        }
    }

}
