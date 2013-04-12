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

public class NorthPhoneDirActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.north_campus_phone_dir_layout);
		String[] NorthphoneDirectory={"Operator","Bookstore","Library",
				"Admissions","Advisement","Financial Aid","Student Life","New Student Center",
				"Testing", "Bursar", "North Directory"};
		
		 ListView lv = new ListView(this);
	        
	        lv.setAdapter(new ArrayAdapter<String>(this,
	        		android.R.layout.simple_list_item_1,NorthphoneDirectory));
	        
	        setContentView(lv);
	        
	        lv.setOnItemClickListener(mListViewClicks);
		}
	        
	       private OnItemClickListener mListViewClicks = new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
			        		
			        		switch(arg2){
			        		case 0:
			        			//Operator:  (305)237-1000
			        			startActivity(new Intent(Intent.ACTION_DIAL,
			        					Uri.parse("tel:(305)237-1000")));
			        			break;
			        		case 1:
			        			//Bookstore: (305)-237-1247
			        			startActivity(new Intent(Intent.ACTION_DIAL,
			        					Uri.parse("tel:(305)-237-1247")));
			        			break;
			        		case 2:
			        			//Library:  (305)-237-1142
			        			startActivity(new Intent(Intent.ACTION_DIAL,
			        					Uri.parse("tel:(305)-237-1142")));
			        			break;
			        		case 3:
			        			//Bursar:  (305)-237-1287
			        			startActivity(new Intent(Intent.ACTION_DIAL,
			        					Uri.parse("tel:(305)-237-1287")));
			        			break;
			        		case 4:
			        			//Admissions: (305)237-1111
			        			startActivity(new Intent(Intent.ACTION_DIAL,
			        					Uri.parse("tel:(305)237-1111")));
			        			break;
			        		case 5:
			        			//Advisement: (305)237-1425
			        			startActivity(new Intent(Intent.ACTION_DIAL,
			        					Uri.parse("tel:(305)237-1425")));
			        			break;
			        		case 6:
			        			//Financial Aid: (305)237-1058
			        			startActivity(new Intent(Intent.ACTION_DIAL,
			        					Uri.parse("tel:(305)237-1058")));
			        			break;
			        		case 7:
			        			//New Student Center: (305)-237-1149
			        			startActivity(new Intent(Intent.ACTION_DIAL,
			        					Uri.parse("tel:(305)-237-1149")));
			        			break;
			        		case 8:
			        			//Student Life:(305)237-1250
			        			startActivity(new Intent(Intent.ACTION_DIAL,
			        					Uri.parse("tel:(305)237-1250")));
			        			break;
			        		case 9:
			        			//Testing:  (305)-237-1015
			        			startActivity(new Intent(Intent.ACTION_DIAL,
			        					Uri.parse("tel:(305)-237-1015")));
			        			break;
			        		case 10:
			        			startActivity(new Intent(Intent.ACTION_VIEW, 
			        					Uri.parse("http://www.mdc.edu/north/campus-information/directory.aspx")));
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