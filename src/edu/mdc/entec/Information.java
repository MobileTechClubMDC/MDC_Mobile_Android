package edu.mdc.entec;


import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class Information extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        
        final ImageView imgHome = (ImageView) findViewById(R.id.imgHome);
		 imgHome.setOnTouchListener(new OnTouchListener() {

				@Override
				public boolean onTouch(View v, MotionEvent event) {
					// TODO Auto-generated method stub
					imgHome.setImageResource(R.drawable.home_onclick);
					startActivity(new Intent(Information.this, HomeActivity.class));
					//Google Analytics Event Tracker
					EasyTracker.getTracker().sendEvent("ui_action", "info_activity", "home_button", null);
					finish();
					return false;
				}
			});//End on touch listener
        
        //Accesses strings.xml to insert build number into support email.
        final String BuildNumber = getString(R.string.build_number);
        
        ImageView imgSupport = (ImageView) findViewById(R.id.imgSupport);
        imgSupport.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_SEND);
				intent.setType("plain/text");
				//Email address to mail to
				intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "mobiletechclubmdc@gmail.com" });
				//Inserts build number string into subject line
				intent.putExtra(Intent.EXTRA_SUBJECT, BuildNumber );
				//Inserts text into mail body
				//intent.putExtra(Intent.EXTRA_TEXT, "mail body");
				//Launches screen to choose mail client
				startActivity(Intent.createChooser(intent, "Please choose email client"));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "info_activity", "support_button", null);
				
			}        
         });//End OnClickListener
        
        ImageView imgCreate = (ImageView) findViewById(R.id.imgCreatedBy);
		 imgCreate.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					//About us launch intent
					startActivity(new Intent(Information.this, AboutUs.class));
					//Google Analytics Event Tracker
					EasyTracker.getTracker().sendEvent("ui_action", "info_activity", "about_button", null);
					finish();
				}
		
		 });//End OnClickListener
		 
		 ImageView imgAssociation = (ImageView) findViewById(R.id.imgAssociation);
		 imgAssociation.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					//ENTEC launch intent
					startActivity(new Intent(Intent.ACTION_VIEW, 
							Uri.parse("http://entec.mdc.edu/")));
					//Google Analytics Event Tracker
					EasyTracker.getTracker().sendEvent("ui_action", "info_activity", "entec_button", null);
				}
		
		 });//End OnClickListener
		 
		 
		 
	}//End OnCreate
	
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

