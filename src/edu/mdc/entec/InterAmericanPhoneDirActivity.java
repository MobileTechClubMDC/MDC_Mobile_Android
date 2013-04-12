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

public class InterAmericanPhoneDirActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.interamerican_campus_phone_dir_layout);
		
		// Admission number was incorrect, so i changed to its proper number.
	
		String[] InteramericanPhoneDirectory = {"Operator", "Bookstore", "Admission",
											"Advisement", "Bursar","Financial Aid","Library",
											"Registration", "Student Life", "Testing", "Interamerican Directory"};
		
		
	
	 ListView lvs = new ListView(this);
     
     lvs.setAdapter(new ArrayAdapter<String>(this,
     		android.R.layout.simple_list_item_1,InteramericanPhoneDirectory));
     
     setContentView(lvs);
     
     lvs.setOnItemClickListener(mListViewClicks);
	}
     
    private OnItemClickListener mListViewClicks = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
		        		
		        		switch(arg2){
		        		case 0:
		        			//Operator:  305-237-6000 
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-6000")));
		        			break;
		        		case 1:
		        			//Bookstore: 305-237-6019
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-6019")));
		        			break;
		        		case 2:
		        			//Admissions:  305-237-6045
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-6045")));
		        			break;
		        		case 3:
		        			//Advisement:  305-237-6133
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-6133")));
		        			break;
		        		case 4:
		        			//Bursar: 305-237-6264
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-6264")));
		        			break;
		        		case 5:
		        			//Financial Aid: 305-237-8970
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-6040")));
		        			break;
		        		case 6:
		        			//Library: 305-237-6058
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-6058")));
		        			break;
		        		case 7:
		        			//Registration: 305-237-6045
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-6045")));
		        			break;
		        		case 8:
		        			//Student Life: 305-237-6163
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-6163")));
		        			break;
		        		case 9:
		        			//Testing:  305-237-6041
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-6041")));
		        		case 10:
		        			startActivity(new Intent(Intent.ACTION_VIEW, 
		        					Uri.parse("http://www.mdc.edu/iac/campus-information/directory.aspx")));
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






