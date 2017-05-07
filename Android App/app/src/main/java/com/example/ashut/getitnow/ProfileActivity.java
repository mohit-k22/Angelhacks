package com.example.ashut.getitnow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button update=(Button)findViewById(R.id.bUpdate);
        update.setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ProfileActivity.this,UpdateActivity.class);
                startActivity(i);
            }
        });
    }
}
