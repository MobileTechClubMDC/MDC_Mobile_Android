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

public class HialeahPhoneDirActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hialeah_campus_phone_dir_layout);
		
		String[] HialeahPhoneDirectory = {"Operator",
				"Bookstore", 
				"Admission", 
				"Advisment",						
				"Bursar",
				"Financial Aid",						
				"Library", 
				"New Student Center", 
				"Testing",};
		
	
	 ListView lv = new ListView(this);
	 
	 lv.setAdapter(new ArrayAdapter<String> (this, 
			 android.R.layout.simple_list_item_1, HialeahPhoneDirectory));
		
     setContentView(lv);
     
     lv.setOnItemClickListener(mListViewClicks);
	}
     
    private OnItemClickListener mListViewClicks = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {

			switch(arg2){
 		case 0:
 			//Operator:  305-237-8700 
 			startActivity(new Intent(Intent.ACTION_DIAL,
 					Uri.parse("tel:305-237-8700")));
 			break;
 		case 1:
 			//Bookstore: 305-237-8806
 			startActivity(new Intent(Intent.ACTION_DIAL,
 					Uri.parse("tel:305-237-8806")));
 			break;
 		case 2:
 			//Admissions:  305-237-8775
 			startActivity(new Intent(Intent.ACTION_DIAL,
 					Uri.parse("tel:305-237-8775")));
 			break;
 		case 3:
 			//Advisement:  305-237-8794
 			startActivity(new Intent(Intent.ACTION_DIAL,
 					Uri.parse("tel:305-237-8794")));
 			break;
 		case 4:
 			//Bursar: 305-237-8784
 			startActivity(new Intent(Intent.ACTION_DIAL,
 					Uri.parse("tel:305-237-8784")));	        		
 			break;
 		case 5:
 			//Financial Aid: 305-237-8779
 			startActivity(new Intent(Intent.ACTION_DIAL,
 					Uri.parse("tel:305-237-8779")));
 			break;
 		case 6:
 			//Library: 305-237-8722
 			startActivity(new Intent(Intent.ACTION_DIAL,
 					Uri.parse("tel:305-237-8722")));
 			break;
 		case 7:
 			//New Student Center: 305-237-8794
 			startActivity(new Intent(Intent.ACTION_DIAL,
 					Uri.parse("tel:305-237-8794")));
 			break;
 		case 8:
 			//Testing:  305-237-8791
 			startActivity(new Intent(Intent.ACTION_DIAL,
 					Uri.parse("tel:305-237-8791")));
 			break;	
 		
 					}
				}
    };

		
		//Code that allows Google Analytics to work
	    
	      public void onStart() {
	        super.onStart();
	        EasyTracker.getInstance().activityStart(this); // Starts Google Analytics.
	      }

	      
	      public void onStop() {
	        super.onStop();
	        EasyTracker.getInstance().activityStop(this); // Stops Google Analytics.
	      }
}
