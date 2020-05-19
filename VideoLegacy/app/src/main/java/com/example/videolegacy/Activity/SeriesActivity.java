package com.example.videolegacy.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.videolegacy.Adapter.SeriesAdapter;
import com.example.videolegacy.Data.Data;
import com.example.videolegacy.R;
import com.google.android.material.tabs.TabLayout;

public class SeriesActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    Data db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        setTitle("Series");
        //getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#FF0000\">"+ getString(R.string.menu_home)));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#700505")));
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        db = new Data();
        tabLayout.addTab(tabLayout.newTab().setText("Adventure"));
        tabLayout.addTab(tabLayout.newTab().setText("Horror"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final SeriesAdapter adapter = new SeriesAdapter(this,getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    public void onBackPressed() {
        Intent a = new Intent(this, MainActivity.class);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
        super.onBackPressed();
    }
    public void display(View view){

        TextView t = (TextView) view;
        String text = t.getText().toString();
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(db.getSerieByTitulo(text).toString());
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
}
