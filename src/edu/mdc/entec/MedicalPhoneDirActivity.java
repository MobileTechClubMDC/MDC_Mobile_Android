package edu.mdc.entec;

import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;



public class MedicalPhoneDirActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
		setContentView(R.layout.west_campus_phone_dir_layout);
        
		String[] directoryMedical ={"Operator" , 
				"Bookstore", 
				"Admissions", 
				"Advisement",
				"Bursar",
				"Financial Aid",
				"Library",
				"New Student Center", 
				"Testing",
				"Medical Center Directory"};
		
        ListView lvmed = new ListView(this);
        
        lvmed.setAdapter(new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1,directoryMedical));
        
        setContentView(lvmed);
        
        lvmed.setOnItemClickListener(mListViewClicks);
	}
        
       private OnItemClickListener mListViewClicks = new OnItemClickListener() {

    	   @Override
   		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
   				long arg3) {
   		        		
   		        		switch(arg2){
   		        		case 0:
   		        			//Operator
   		        			startActivity(new Intent(Intent.ACTION_DIAL,
   		        					Uri.parse("tel:305-237-4000")));
   		        			break;
   		        		case 1:
   		        			//Bookstore
   		        			startActivity(new Intent(Intent.ACTION_DIAL,
   		        					Uri.parse("tel:305-237-4178")));
   		        			break;
   		        		case 2:
   		        			//Admissions
   		        			startActivity(new Intent(Intent.ACTION_DIAL,
   		        					Uri.parse("tel:305-237-4160")));
   		        			break;
   		        		case 3:
   		        			//Advisement
   		        			startActivity(new Intent(Intent.ACTION_DIAL,
   		        					Uri.parse("tel:305-237-4141")));
   		        			break;
   		        		case 4:
   		        			//Bursar: 
   		        			startActivity(new Intent(Intent.ACTION_DIAL,
   		        					Uri.parse("tel:305-237-4001")));
   		        			break;
   		        		case 5:
   		        			//Financial Aid: 
   		        			startActivity(new Intent(Intent.ACTION_DIAL,
   		        					Uri.parse("tel:305-237-4160")));
   		        			break;
   		        		case 6:
   		        			//Library:
   		        			startActivity(new Intent(Intent.ACTION_DIAL,
   		        					Uri.parse("tel:305-237-4129")));
   		        			break;
   		        		case 7:
   		        			//New Student Center:   
   		        			startActivity(new Intent(Intent.ACTION_DIAL,
   		        					Uri.parse("tel:305-237-4141")));
   		        			break;
   		        		case 8:
   		        			//Testing: 
   		        			startActivity(new Intent(Intent.ACTION_DIAL,
   		        					Uri.parse("tel:305-237-4275")));
   		        			break;
   		        		case 9:
   		        			startActivity(new Intent(Intent.ACTION_VIEW, 
   		        					Uri.parse("http://www.mdc.edu/medical/campus-information/directory.aspx")));
   		        			break;
			}
		}

			
		};	
			
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


