package edu.mdc.entec;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView;

public class WolfsonActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wolfson_campus_layout);
        
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
		//Coding for launching MDC main page
		ImageView btnMyMdc = (ImageView) findViewById(R.id.btnMyMdc);		
		btnMyMdc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://mdc.edu")));
			}
		});
		
		//Coding for launching MDC email page
		ImageView btnEmail = (ImageView) findViewById(R.id.btnEmail);
		btnEmail.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://email.mymdc.net/")));
			}
		});
		
		//Coding for launching MDC events page
		ImageView btnEvents = (ImageView) findViewById(R.id.btnEvents);
        btnEvents.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub  
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://www.mdc.edu/main/news/events.aspx")));
			}
		});
        
        //Coding for launching MDC map page
        ImageView btnMap = (ImageView) findViewById(R.id.btnMap);
        btnMap.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub  
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://www.mdc.edu/wolfson/generalInfo/campus_map.asp")));
			}
		});
        
        //Coding for launching MDC Angel page
        ImageView btnAngel = (ImageView) findViewById(R.id.btnAngel);
        btnAngel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("https://mycourses.mdc.edu/")));
			}
		});
        
        //Coding for launching MDC news page
        ImageView btnNews = (ImageView) findViewById(R.id.btnNews);
        btnNews.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://www.mdc.edu/main/news/news.aspx")));
			}
		});
        
        
	    //Coding for launching MDC library page
        ImageView btnLibrary = (ImageView) findViewById(R.id.btnLibrary);
        btnLibrary.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://www.mdc.edu/libraries/")));
			}
		});
        
        //Coding for launching MDC courses page
        ImageView btnCourses = (ImageView) findViewById(R.id.btnCourses);
        btnCourses.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("https://sisvsr.mdc.edu/student/openclass/NewSearchM.aspx")));
			}
		});
        
        //Coding for launching MDC public safety page
        ImageView btnPublicSafety = (ImageView) findViewById(R.id.btnPublicSafety);
        btnPublicSafety.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(WolfsonActivity.this, WolfsonPublicSafetyActivity.class ));
			}
		});
        
        //Coding for launching MDC phone directory page
        ImageView btnPhoneDir = (ImageView) findViewById(R.id.btnPhoneDir);
        btnPhoneDir.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(WolfsonActivity.this, WolfsonPhoneDirActivity.class ));
			}
		});
        
        //Coding for launching MDC campus page
        ImageView btnSwitchCampus = (ImageView) findViewById(R.id.btnHome);
        btnSwitchCampus.setOnClickListener(new OnClickListener() {
			
		//	@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
        		startActivity(new Intent(WolfsonActivity.this, HomeActivity.class));
			}
    		});
    	
    	}

}