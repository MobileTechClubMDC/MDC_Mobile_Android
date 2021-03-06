package edu.mdc.entec;

import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WolfsonPhoneDirActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wolfson_campus_phone_dir_layout);
        
        String[] phoneDirectory={"Select To Call:",
				"Operator", 
        		"Bookstore",
        		"Admissions",
        		"Advisement",
        		"Bursar",
        		"Financial Aid",
        		"Library",
        		"New Student Center",
        		"Testing",
        		"Wolfson Directory"
        };
        
        ListView lv = new ListView(this);
        
        lv.setAdapter(new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1,phoneDirectory));
        
        setContentView(lv);
        
        lv.setOnItemClickListener(mListViewClicks);
	}
        
       private OnItemClickListener mListViewClicks = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
		        		
			switch(arg2){
    		case 1:
    			//Operator:  305-237-3000 
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-3000")));
    			break;
    		case 2:
    			//Bookstore: 305-237-3236
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-3236")));
    			break;
    		case 3:
    			//Admissions:  305-237-3644
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-3644")));
    			break;
    		case 4:
    			//Advisement:  305-237-3077
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-3077")));
    			break;
    		case 5:
    			//Bursar: 305-237-3004
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-3004")));	        		
    			break;
    		case 6:
    			//Financial Aid: 305-237-3244
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-3244")));
    			break;
    		case 7:
    			//Library: 305-237-3144
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-3144")));
    			break;
    		case 8:
    			//New Student Center: 305-237-3076
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-3076")));
    			break;
    		case 9:
    			//Testing:  305-237-3011
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-3011")));
    			break;
    		case 10:
    			startActivity(new Intent(Intent.ACTION_VIEW, 
    					Uri.parse("http://www.mdc.edu/wolfson/GeneralInfo/directory.asp")));
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