package edu.mdc.entec;

import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class AboutUs extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us_layout); 
		ImageView imgHome = (ImageView) findViewById(R.id.imgHome);
		 imgHome.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					//About us launch intent
					startActivity(new Intent(AboutUs.this, HomeActivity.class));
					finish();
				}
			});//End on click listener		 
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


