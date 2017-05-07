package com.example.ashut.getitnow;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);







        ArrayList<myAds> phrase=new ArrayList<myAds>();
        phrase.add(new myAds("Hair Dryer","For 3 Hrs"));
        phrase.add(new myAds("Grinder","For an Hour"));
        phrase.add(new myAds("Bluetoooth Speakers","For 5-6 Hrs"));
        phrase.add(new myAds("Ladder","For Half an Hour"));
        phrase.add(new myAds("Moie Tickets","Only Hour Hour Left"));
        phrase.add(new myAds("5 Chairs","2 Hours"));
        phrase.add(new myAds("Enni'nem.","Come Here !"));


        AdsAdapter itemsAdapter = new AdsAdapter(MainActivity.this,phrase);
        ListView listView=(ListView)findViewById(R.id.myList);
        listView.setAdapter(itemsAdapter);



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent i;


        if (id == R.id.profile) {
            i=new Intent(this,ProfileActivity.class);
            startActivity(i);
        } else if (id == R.id.postAd) {

        } else if (id == R.id.proposals) {

        } else if (id == R.id.contact) {

        } else if (id == R.id.rate) {
            try {
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("media://play.google.com/store?hl=en"));
                startActivity(i);
            }
            catch (ActivityNotFoundException e)
            {
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store?hl=en"));
                startActivity(i);
            }

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
