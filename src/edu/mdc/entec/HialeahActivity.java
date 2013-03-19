package edu.mdc.entec;

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
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hialeah_campus_layout);
        
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
        final ImageView MyMdc = (ImageView) findViewById(R.id.btnMyMdc);
        final ImageView Email = (ImageView) findViewById(R.id.btnEmail);
        final ImageView Events = (ImageView) findViewById(R.id.btnEvents);
        final ImageView Map = (ImageView) findViewById(R.id.btnMap);
        final ImageView Angel = (ImageView) findViewById(R.id.btnAngel);
        final ImageView News = (ImageView) findViewById(R.id.btnNews);
        final ImageView Library = (ImageView) findViewById(R.id.btnLibrary);
        final ImageView Courses = (ImageView) findViewById(R.id.btnCourses);
        final ImageView PublicSafety = (ImageView) findViewById(R.id.btnPublicSafety);
        final ImageView PhoneDir = (ImageView) findViewById(R.id.btnPhoneDir);
      
        //MyMdc Page ImageView Click
        MyMdc.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/hialeah/")));
			}
        });
        
      //Email ImageView Click
        Email.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://email.mymdc.net/")));
			}
        });
        
      //Events ImageView Click
        Events.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/news/events.aspx")));
			}
        });
        
      //Map ImageView Click
        Map.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(HialeahActivity.this, HialeahMapActivity.class));
			}
        });
        
      //Angel ImageView Click
        Angel.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mycourses.mdc.edu/default.asp")));
			}
        });
        
      //News ImageView Click
        News.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/news/news.aspx")));
			}
        });
        
      //Library ImageView Click
        Library.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/library/")));
			}
        });
        
      //Courses Store ImageView Click
        Courses.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/academics/credit.aspx")));
			}
        });
        
      //Public Safety ImageView Click
        PublicSafety.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Add Public Safety Activity
				startActivity(new Intent(HialeahActivity.this, HialeahPublicSafetyActivity.class));
			}
        });
        
      //Phone Directory Click
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
}