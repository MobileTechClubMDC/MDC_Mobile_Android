package edu.mdc.entec;

import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class HialeahActivity extends Activity {
    /** Called when the activity is first created. */
	
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hialeah_campus_layout);
        
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
   
      
        //btnMyMDC
        ImageView MyMdc = (ImageView) findViewById(R.id.btnMyMdc);
        MyMdc.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the MYMDC page
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mymdc.mdc.edu/")));
			}
        });
        
      //btnEmail
        ImageView Email = (ImageView) findViewById(R.id.btnEmail);
        Email.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the Email login page
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://email.mymdc.net/")));
			}
        });
        
      //bnEvents
        ImageView Events = (ImageView) findViewById(R.id.btnEvents);
        Events.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the upcoming events
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://calendar.mdc.edu/mobile/mobilelist.aspx")));
			}
        });
        
      //btnMap
        ImageView Map = (ImageView) findViewById(R.id.btnMap);
        Map.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the Hialeah campus map
        		startActivity(new Intent(HialeahActivity.this, HialeahMapActivity.class));
			}
        });
        
      //btnAngel
        ImageView Angel = (ImageView) findViewById(R.id.btnAngel);
        Angel.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the Angel webpage
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mycourses.mdc.edu/")));
			}
        });
        
      //btnNews
        ImageView News = (ImageView) findViewById(R.id.btnNews);
        News.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the campus news
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/news/")));
			}
        });
        
      //btnLibrary
        ImageView Library = (ImageView) findViewById(R.id.btnLibrary);
        Library.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the Library page
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/librarymobi/")));
			}
        });
        
      //btnCourses
        ImageView Courses = (ImageView) findViewById(R.id.btnCourses);
        Courses.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				//Loads the courses webpage
        		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/academics/course_offerings.aspx")));
			}
        });
        
      //btnPublicSafety
        ImageView PublicSafety = (ImageView) findViewById(R.id.btnPublicSafety);
        PublicSafety.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Add Public Safety Activity
				startActivity(new Intent(HialeahActivity.this, HialeahPublicSafetyActivity.class));
			}
        });
        
      //btnPhoneDirectory
        ImageView PhoneDir = (ImageView) findViewById(R.id.btnPhoneDir);
        PhoneDir.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(HialeahActivity.this, HialeahPhoneDirActivity.class));
			}
        });
        
        ImageView SwitchCampus=(ImageView)findViewById(R.id.btnHome);
        SwitchCampus.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Goes back to the pick campus window.
        		startActivity(new Intent(HialeahActivity.this, HomeActivity.class));
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