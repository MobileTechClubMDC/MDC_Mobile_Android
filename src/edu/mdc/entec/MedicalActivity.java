package edu.mdc.entec;

import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MedicalActivity extends Activity {
	
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medical_campus_layout);
        
        
      //btnMyMDC
        ImageView MyMdc = (ImageView) findViewById(R.id.btnMyMdc);
        MyMdc.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the MYMDC page
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mymdc.mdc.edu/")));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "mymdc_button", null);
			}
        });
        
      //btnEmail
        ImageView Email = (ImageView) findViewById(R.id.btnEmail);
        Email.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the Email login page
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://email.mymdc.net/")));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "email_button", null);
			}
        });
        
      //bnEvents
        ImageView Events = (ImageView) findViewById(R.id.btnEvents);
        Events.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the upcoming events
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://calendar.mdc.edu/mobile/mobilelist.aspx")));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "events_button", null);
			}
        });
        
      //btnMap
        ImageView Map = (ImageView) findViewById(R.id.btnMap);
        Map.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the Medical campus map
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/medical/images_map/medical_center_map.jpg")));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "map_button", null);
        		
			}
        });
        
      //btnAngel
        ImageView Angel = (ImageView) findViewById(R.id.btnAngel);
        Angel.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the Angel web page
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mycourses.mdc.edu/")));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "angel_button", null);
			}
        });
        
      //btnNews
        ImageView News = (ImageView) findViewById(R.id.btnNews);
        News.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the campus news
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/news/")));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "news_button", null);
			}
        });
        
      //btnLibrary
        ImageView Library = (ImageView) findViewById(R.id.btnLibrary);
        Library.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the Library page
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/librarymobi/")));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "library_button", null);
			}
        });
        
      //btnCourses
        ImageView Courses = (ImageView) findViewById(R.id.btnCourses);
        Courses.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the courses web page
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/academics/course_offerings.aspx")));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "courses_button", null);
			}
        });
        
      //btnPublicSafety
        ImageView PublicSafety = (ImageView) findViewById(R.id.btnPublicSafety);
        PublicSafety.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Add Public Safety Activity
				startActivity(new Intent(MedicalActivity.this, MedicalPublicSafetyActivity.class));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "safety_button", null);
			}
        });
        
      //btnPhoneDirectory
        ImageView PhoneDir = (ImageView) findViewById(R.id.btnPhoneDir);
        PhoneDir.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(MedicalActivity.this, MedicalPhoneDirActivity.class));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "directory_button", null);
			}
        });
        
        ImageView SwitchCampus=(ImageView)findViewById(R.id.btnHome);
        SwitchCampus.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//btnHome
        		startActivity(new Intent(MedicalActivity.this, HomeActivity.class));
				//Google Analytics Event Tracker
				EasyTracker.getTracker().sendEvent("ui_action", "medical_activity", "home_button", null);
        		finish();
        	}
        });

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
