package edu.mdc.entec;


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
				Uri.parse("http://www.mdc.edu/current/")));
			}
    	});
        
        ImageView b=(ImageView) findViewById(R.id.btnEmail) ;
        b.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
				Uri.parse("https://www.google.com/a/mymdc.net")));
			}
    	});
        
        ImageView c=(ImageView) findViewById(R.id.btnEvents) ;
        c.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://calendar.mdc.edu/CalendarNOW.aspx?fromdate=12/1/2012&todate=12/31/2012&display=Month/")));
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
    			Uri.parse("http://www.mdc.edu/main/news/default.aspx")));
			}
    	});
        
        ImageView h=(ImageView) findViewById(R.id.btnLibrary) ;
        h.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.mdc.edu/main/library/")));
			}
    	});
        
        ImageView i=(ImageView) findViewById(R.id.btnCourses) ;
        i.setOnClickListener(new OnClickListener() 
        {
        public void onClick(View v) 
        	{
				// TODO Auto-generated method stub
        		startActivity(new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://sisvsr.mdc.edu/student/openclass/NewSearchM.aspx?newwin=Y&CACHE=1355195828479/")));
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
			}
    	});
    }

}
