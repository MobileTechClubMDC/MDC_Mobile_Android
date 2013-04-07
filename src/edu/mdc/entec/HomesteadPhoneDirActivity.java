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


public class HomesteadPhoneDirActivity extends Activity 
{
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homestead_campus_phone_dir_layout);
        
        String[] phoneDirectory={"Operator:  305-237-5000", 
        		"Bookstore: 305-237-5042",
        		"Admissions:  305-237-5555",
        		"Advisement:  305-237-5046",
        		"Bursar:  305-237-5054",
        		"Financial Aid: 305-237-5024",
        		"Library: 305-237-5057",
        		"New Student Center: 305-237-5197",
        		"Testing:  305-237-5105",
        		"Homestead Directory"
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
    		case 0:
    			//Operator:  305-237-5000 
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-5000")));
    			break;
    		case 1:
    			//Bookstore: 305-237-5042
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-5042")));
    			break;
    		case 2:
    			//Admissions:  305-237-5555
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-5555")));
    			break;
    		case 3:
    			//Advisement:  305-237-5046
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-5046")));
    			break;
    		case 4:
    			//Bursar: 305-237-5054
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-5054")));	        		
    			break;
    		case 5:
    			//Financial Aid: 305-237-5024
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-5024")));
    			break;
    		case 6:
    			//Library: 305-237-5057
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("tel:305-237-5057")));
    			break;
    		case 7:
    			//New Student Center: 305-237-5197
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("305-237-5197")));
    			break;
    		case 8:
    			//Testing:  305-237-5105
    			startActivity(new Intent(Intent.ACTION_DIAL,
    					Uri.parse("305-237-5105")));
    			break;
    		case 9:
    			startActivity(new Intent(Intent.ACTION_VIEW, 
    					Uri.parse("http://www.mdc.edu/homestead/homestead_directory.asp")));
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
