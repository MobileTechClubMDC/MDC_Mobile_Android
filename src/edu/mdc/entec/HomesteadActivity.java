package edu.mdc.entec;


import com.google.analytics.tracking.android.EasyTracker;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import edu.mdc.entec.R;

public class HomesteadActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homestead_campus_layout);
        
        ImageView a=(ImageView) findViewById(R.id.btnMyMdc) ;
        a.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
				Uri.parse("https://mymdc.mdc.edu/")));
			}
    	});
        
        ImageView b=(ImageView) findViewById(R.id.btnEmail) ;
        b.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://email.mymdc.net/")));
			}
    	});
        
        ImageView c=(ImageView) findViewById(R.id.btnEvents) ;
        c.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://calendar.mdc.edu/mobile/mobilelist.aspx")));
			}
    	});
        
        ImageView d=(ImageView) findViewById(R.id.btnMap) ;
        d.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.mdc.edu/main/campus_finder/directions/homestead.aspx/")));
			}
    	});
        
        ImageView f=(ImageView) findViewById(R.id.btnAngel) ;
        f.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://mycourses.mdc.edu")));
			}
    	});
        
        ImageView g=(ImageView) findViewById(R.id.btnNews) ;
        g.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://www.mdc.edu/main/news/")));
			}
    	});
        
        ImageView h=(ImageView) findViewById(R.id.btnLibrary) ;
        h.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.mdc.edu/librarymobi/")));
			}
    	});
        
        ImageView i=(ImageView) findViewById(R.id.btnCourses) ;
        i.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.mdc.edu/main/academics/course_offerings.aspx")));
			}
    	});
        
        ImageView j=(ImageView) findViewById(R.id.btnPublicSafety) ;
        j.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        	startActivity(new Intent(HomesteadActivity.this, HomesteadPublicSafetyActivity.class) ) ;
				
			}
    	});
        
        ImageView k=(ImageView) findViewById(R.id.btnPhoneDir) ;
        k.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        	startActivity(new Intent(HomesteadActivity.this, HomesteadPhoneDirActivity.class) ) ;
				
			}
    	});
        
        ImageView l=(ImageView) findViewById(R.id.btnHome) ;
        l.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
    		    //Goes back to the pick campus window.
    		    startActivity(new Intent(HomesteadActivity.this, HomeActivity.class));
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
