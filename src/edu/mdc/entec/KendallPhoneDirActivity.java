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

public class KendallPhoneDirActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kendall_campus_phone_dir_layout);
		
		
		
		String[] directoryKendall={"Operator", 
        		"Bookstore",
        		"Admissions",
        		"Advisement",
        		"Bursar",
        		"Financial Aid",
        		"Library",
        		"New Student Center",
        		"Testing",
        		"Kendall Directory"
        };
		
ListView lv = new ListView(this);
        
        lv.setAdapter(new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1,directoryKendall));
        
        setContentView(lv);
        
        lv.setOnItemClickListener(mListViewClicks);
	}
        
       private OnItemClickListener mListViewClicks = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
		        		
		        		switch(arg2){
		        		case 0:
		        			//Operator:  305-237-2000 
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-2000")));
		        			break;
		        		case 1:
		        			//Bookstore: 305-237-2361
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-2361")));
		        			break;
		        		case 2:
		        			//Admissions:  305-237-2222
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-2222")));
		        			break;
		        		case 3:
		        			//Advisement:  305-237-2339
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-2339")));
		        			break;
		        		case 4:
		        			//Bursar: 305-237-2473
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-2473")));	        		
		        			break;
		        		case 5:
		        			//Financial Aid: 305-237-2325
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-2325")));
		        			break;
		        		case 6:
		        			//Library: 305-237-0996
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-0996")));
		        			break;
		        		case 7:
		        			//New Student Center: 305-237-0713
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-0713")));
		        			break;
		        		case 8:
		        			//Testing:  305-237-2341
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-2341")));
		        			break;
		        		case 9:
		        			startActivity(new Intent(Intent.ACTION_VIEW, 
		        					Uri.parse("http://www.mdc.edu/kendall/sitemap.asp")));
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
