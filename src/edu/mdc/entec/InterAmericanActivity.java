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

public class InterAmericanActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interamerican_campus_layout);
        
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        final ImageView HomePage = (ImageView) findViewById(R.id.btnHome);
        final ImageView Maps = (ImageView) findViewById(R.id.btnMap);
        final ImageView PhoneDirectory = (ImageView) findViewById(R.id.btnPhoneDir);
        final ImageView MyMDC = (ImageView) findViewById(R.id.btnMyMdc);
        final ImageView Events = (ImageView) findViewById(R.id.btnEvents);
        final ImageView Courses = (ImageView) findViewById(R.id.btnCourses);
        final ImageView News = (ImageView) findViewById(R.id.btnNews);
        final ImageView BookStore = (ImageView) findViewById(R.id.btnLibrary);
        final ImageView PublicSafety = (ImageView) findViewById(R.id.btnPublicSafety);
        final ImageView Email = (ImageView) findViewById(R.id.btnEmail);
        final ImageView Angel = (ImageView) findViewById(R.id.btnAngel);
      
        
        //Home Page ImageView Click
        HomePage.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
        		//Goes back to the pick campus window.
        		startActivity(new Intent(InterAmericanActivity.this, HomeActivity.class));
        		finish();
			}
        });
        
        
      //Maps ImageView Click
        Maps.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(InterAmericanActivity.this, InterAmericanMapsActivity.class));
			}
        });
        
      //Phone Directory ImageView Click
        PhoneDirectory.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(InterAmericanActivity.this, InterAmericanPhoneDirActivity.class));
			}
        });
        
      //MyMDC ImageView Click
        MyMDC.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mymdc.mdc.edu/")));
			}
        });
        
      //Events ImageView Click
        Events.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/news/events.aspx")));
			}
        });
        
      //Courses ImageView Click
        Courses.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/academics/credit.aspx")));
			}
        });
        
      //News ImageView Click
        News.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/news/news.aspx")));
			}
        });
        
      //Book Store ImageView Click
        BookStore.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/bookstore/default.aspx")));
			}
        });
        
      //Public Safety ImageView Click
        PublicSafety.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(InterAmericanActivity.this, InterAmericanPublicSafetyActivity.class));
			}
        });
        
      //Email ImageView Click
        Email.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://email.mymdc.net/")));
			}
        });
        
      //Angel ImageView Click
        Angel.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mycourses.mdc.edu/default.asp")));
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