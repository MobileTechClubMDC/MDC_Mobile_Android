package edu.mdc.entec;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class NorthActivity extends Activity {
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.north_campus_layout);
        
        ImageView Angel=(ImageView) findViewById(R.id.btnAngel);
        Angel.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("https://mycourses.mdc.edu/default.asp")));
        	
        	}
        
        });
        
        
        ImageView Email=(ImageView) findViewById(R.id.btnEmail);
        Email.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://email.mymdc.net/")));
        	
        	}
        
        });
        
        
        ImageView Events=(ImageView) findViewById(R.id.btnEvents);
        Events.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://calendar.mdc.edu/CalendarNOW.aspx?")));
        	
        	}
        
        });
        
        
        ImageView Library=(ImageView) findViewById(R.id.btnLibrary);
        Library.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://mdc.edu/main/library/")));
        	
        	}
        
        });
        
        
        ImageView MyMdc=(ImageView) findViewById(R.id.btnMyMdc);
        MyMdc.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://mymdc.mdc.edu/")));
        	
        	}
        
        });
        
        
        ImageView News=(ImageView) findViewById(R.id.btnNews);
        News.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.mdc.edu/main/news/")));
        	
        	}
        
        });
        
        
        ImageView Safety=(ImageView) findViewById(R.id.btnPublicSafety);
        Safety.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		startActivity(new Intent(NorthActivity.this, NorthPublicSafetyActivity.class));	
        	
        	}
        
        });
        
        ImageView Courses=(ImageView) findViewById(R.id.btnCourses);
        Courses.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		startActivity(new Intent(Intent.ACTION_VIEW,
        				Uri.parse("http://www.mdc.edu/main/academics/credit.aspx")));
        	
        	}
        
        });
        
        ImageView Map=(ImageView) findViewById(R.id.btnMap);
        Map.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		//To do auto-generated method stub
        		startActivity(new Intent(NorthActivity.this, NorthMapsActivity.class));	
        	
        	}
        
        });
        
        ImageView Directory=(ImageView) findViewById(R.id.btnPhoneDir);
        Directory.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		startActivity(new Intent(NorthActivity.this, NorthPhoneDirActivity.class));	
            	
        	
        	
        	}
        
        });

        // Switch Campus
        ImageView Home=(ImageView)findViewById(R.id.btnHome);
        Home.setOnClickListener(new OnClickListener() {
            public void  onClick(View v)	 { 
        		//Goes back to the pick campus window.
        		startActivity(new Intent(NorthActivity.this, HomeActivity.class));
            }
        	
        }); 

    }

}
