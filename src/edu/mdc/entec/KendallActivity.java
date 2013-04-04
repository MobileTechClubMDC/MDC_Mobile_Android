package edu.mdc.entec;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class KendallActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kendall_campus_layout);
        
       // MyMdc
       ImageView b1=(ImageView)findViewById(R.id.btnMyMdc);
        b1.setOnClickListener(new OnClickListener() {
        public void  onClick(View v)	 {
        	startActivity(new Intent(Intent.ACTION_VIEW,
        	Uri.parse("https://mymdc.mdc.edu/")));
        
        }
        	
        });
        
        // Email
        ImageView b2=(ImageView)findViewById(R.id.btnEmail);
        b2.setOnClickListener(new OnClickListener() {
        public void  onClick(View v)	 {
        	startActivity(new Intent(Intent.ACTION_VIEW,
           	Uri.parse("http://email.mymdc.net/")));
        }
        	
        });
        
        // Events
        ImageView b3=(ImageView)findViewById(R.id.btnEvents);
        b3.setOnClickListener(new OnClickListener() {
        public void  onClick(View v)	 {
        	startActivity(new Intent(Intent.ACTION_VIEW,
        	Uri.parse("http://calendar.mdc.edu/mobile/mobilelist.aspx")));
        }
        	
        });
        
        // Maps
        // We commented out the Kendall Map activity code to replace with web link
        // http://www.mdc.edu/kendall/images_home/kendall_map_07_14_09.jpg
        /*
        ImageView b4=(ImageView)findViewById(R.id.btnMap);
        b4.setOnClickListener(new OnClickListener() {
        public void  onClick(View v)	 {
        	startActivity(new Intent(KendallActivity.this, KendallMapsActivity.class));

        }
        	
        });
        */
        
        // Kendall Maps link
        ImageView b4=(ImageView)findViewById(R.id.btnMap);
        b4.setOnClickListener(new OnClickListener() {
        public void  onClick(View v)	 {
        	startActivity(new Intent(Intent.ACTION_VIEW,
        	Uri.parse("http://www.mdc.edu/kendall/images_home/kendall_map_07_14_09.jpg")));
        }
        	
        });
        
        // Angel
        ImageView b5=(ImageView)findViewById(R.id.btnAngel);
        b5.setOnClickListener(new OnClickListener() {
        public void  onClick(View v)	 {
        	startActivity(new Intent(Intent.ACTION_VIEW,
        	Uri.parse("https://mycourses.mdc.edu/")));
        }
        	
        });
        
        // News
        ImageView b6=(ImageView)findViewById(R.id.btnNews);
        b6.setOnClickListener(new OnClickListener() {
        public void  onClick(View v)	 {
        	startActivity(new Intent(Intent.ACTION_VIEW,
        	Uri.parse("http://www.mdc.edu/main/news/")));
        }
        	
        });
        
        // Library
        ImageView b7=(ImageView)findViewById(R.id.btnLibrary);
        b7.setOnClickListener(new OnClickListener() {
        public void  onClick(View v)	 {
        	startActivity(new Intent(Intent.ACTION_VIEW,
        	Uri.parse("http://www.mdc.edu/librarymobi/")));
        }
        	
        });
        
        // Courses
        ImageView b8=(ImageView)findViewById(R.id.btnCourses);
        b8.setOnClickListener(new OnClickListener() {
        	   public void  onClick(View v)	 {
        			startActivity(new Intent(Intent.ACTION_VIEW,
                        	Uri.parse("http://www.mdc.edu/main/academics/course_offerings.aspx")));
               }
        
        	
        });
        
        // Public Safety
        ImageView b9=(ImageView)findViewById(R.id.btnPublicSafety);
        b9.setOnClickListener(new OnClickListener() {
        public void  onClick(View v)	 {
        	startActivity(new Intent(KendallActivity.this, KendallPublicSafetyActivity.class));

        }
        	
        });
        
        // Phone Directory
        ImageView b10=(ImageView)findViewById(R.id.btnPhoneDir);
        b10.setOnClickListener(new OnClickListener() {
            public void  onClick(View v)	 { 
            	startActivity(new Intent(KendallActivity.this, KendallPhoneDirActivity.class));

            }
        	
        }); 
        // Switch Campus
        ImageView b11=(ImageView)findViewById(R.id.btnHome);
        b11.setOnClickListener(new OnClickListener() {
            public void  onClick(View v)	 { 
        		//Goes back to the pick campus window.
        		startActivity(new Intent(KendallActivity.this, HomeActivity.class));
            }
        	
        }); 
        
    }

}
