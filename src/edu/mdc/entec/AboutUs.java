package edu.mdc.entec;

import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class AboutUs extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us_layout); 
		
		final ImageView imgHome = (ImageView) findViewById(R.id.imgHome);
		 imgHome.setOnTouchListener(new OnTouchListener() {

				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO Auto-generated method stub
					imgHome.setImageResource(R.drawable.home_onclick);
					startActivity(new Intent(AboutUs.this, HomeActivity.class));					
					finish();
					return false;
				}
			});//End on touch listener		 
		};//End OnCreate
		
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


