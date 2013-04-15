package edu.mdc.entec;

import com.google.analytics.tracking.android.EasyTracker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class HomeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        
        final ImageView imgInformation = (ImageView) findViewById(R.id.imgInformation);
        imgInformation.setOnTouchListener(new OnTouchListener() {


			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				imgInformation.setImageResource(R.drawable.information_onclick);
				startActivity(new Intent(HomeActivity.this, Information.class));
				EasyTracker.getTracker().sendEvent("ui_action", "home_activity", "info_button", null);

				return false;
			}        	
        });
        
        ImageView imgHialeah = (ImageView) findViewById(R.id.imgHialeah);
        imgHialeah.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(HomeActivity.this, HialeahActivity.class));
				EasyTracker.getTracker().sendEvent("ui_action", "home_activity", "hialeah_button", null);
			}
        	
        });

        ImageView imgWolfson = (ImageView) findViewById(R.id.imgWolfson);
        imgWolfson.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(HomeActivity.this, WolfsonActivity.class));
				EasyTracker.getTracker().sendEvent("ui_action", "home_activity", "wolfson_button", null);
			}
        	
        });

        ImageView imgKendall = (ImageView) findViewById(R.id.imgKendall);
        imgKendall.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(HomeActivity.this, KendallActivity.class));
				EasyTracker.getTracker().sendEvent("ui_action", "home_activity", "kendall_button", null);
			}
        	
        });
        
        ImageView imgInterAmerican = (ImageView) findViewById(R.id.imgInteramerican);
        imgInterAmerican.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(HomeActivity.this, InterAmericanActivity.class));
				EasyTracker.getTracker().sendEvent("ui_action", "home_activity", "interamerican_button", null);
			}
        	
        });

        ImageView imgNorth = (ImageView) findViewById(R.id.imgNorth);
        imgNorth.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(HomeActivity.this, NorthActivity.class));
				EasyTracker.getTracker().sendEvent("ui_action", "home_activity", "north_button", null);
			}
        	
        });

        ImageView imgHomestead = (ImageView) findViewById(R.id.imgHomestead);
        imgHomestead.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(HomeActivity.this, HomesteadActivity.class));
				EasyTracker.getTracker().sendEvent("ui_action", "home_activity", "homestead_button", null);
			}
        	
        });
    
        ImageView imgWest = (ImageView) findViewById(R.id.imgWest);
        imgWest.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(HomeActivity.this, WestActivity.class));
				EasyTracker.getTracker().sendEvent("ui_action", "home_activity", "west_button", null);
			}
        	
        });
    
        ImageView imgMedical = (ImageView) findViewById(R.id.imgMedical);
        imgMedical.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(HomeActivity.this, MedicalActivity.class));
				EasyTracker.getTracker().sendEvent("ui_action", "home_activity", "medical_button", null);
			}
        	
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
    }
    
  //Code that allows Google Analytics to work
    @Override
      public void onStart() {
        super.onStart();
        EasyTracker.getInstance().activityStart(this); // Starts Google Analytics.
      }

      @Override
      public void onStop() {
        super.onStop();
        EasyTracker.getInstance().activityStop(this); // Stops Google Analytics.
      }
}
