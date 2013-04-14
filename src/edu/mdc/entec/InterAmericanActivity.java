package edu.mdc.entec;

import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class InterAmericanActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interamerican_campus_layout);
        
      //btnMyMdc
        ImageView MyMdc=(ImageView)findViewById(R.id.btnMyMdc);
        MyMdc.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads the MyMDC page
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("https://mymdc.mdc.edu/")));
        	}
        });
        
        //btnEmail
        ImageView Email=(ImageView)findViewById(R.id.btnEmail);
        Email.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads student e-mail access
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://email.mymdc.net/")));
        	}
        });
        
        //btnEvents
        ImageView Events=(ImageView)findViewById(R.id.btnEvents);
        Events.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        //Loads the events for Interamerican
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://calendar.mdc.edu/default.aspx?category=&location=10-0-0&view=Grid")));
        	}
        });
        
        //btnMap
        ImageView Map=(ImageView)findViewById(R.id.btnMap);
        Map.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads up the maps
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.mdc.edu/main/images/interamerican_key2_tcm6-75094.jpg")));        		
        	}
        });
        
        //btnAngel
        ImageView Angel=(ImageView)findViewById(R.id.btnAngel);
        Angel.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Goes to the URL for Angel
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("https://mycourses.mdc.edu/")));
        	}
        });
        
        //btnNews
        ImageView News=(ImageView)findViewById(R.id.btnNews);
        News.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads campus news
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.mdc.edu/main/news/")));
        	}
        });
        
        //btnLibrary
        ImageView Library=(ImageView)findViewById(R.id.btnLibrary);
        Library.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads the West Library
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.mdc.edu/west/library/")));
        	}
        });
        
        //btnCourses
        ImageView Courses=(ImageView)findViewById(R.id.btnCourses);
        Courses.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Loads the course catalogs.
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.mdc.edu/main/academics/course_offerings.aspx")));
        	}
        });
        
        //btnPublicSafety
        ImageView PublicSafety=(ImageView)findViewById(R.id.btnPublicSafety);
        PublicSafety.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
       //Loads the Public Safety info for Interamerican
        		
        		startActivity(new Intent(InterAmericanActivity.this,
        				InterAmericanPublicSafetyActivity.class));
        	}
        });
        
        //btnPhoneDir
        ImageView PhoneDir=(ImageView)findViewById(R.id.btnPhoneDir);
        PhoneDir.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        //Loads the Interamerican Directory
        		
        		
        		startActivity(new Intent(InterAmericanActivity.this, InterAmericanPhoneDirActivity.class));
        	}
        });
        
        //btnSwitchCampus
        ImageView SwitchCampus=(ImageView)findViewById(R.id.btnHome);
        SwitchCampus.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v) {
        		
        		//Goes back to the pick campus window.
        		startActivity(new Intent(InterAmericanActivity.this, HomeActivity.class));
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