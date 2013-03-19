package edu.mdc.entec;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WestPhoneDirActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
		setContentView(R.layout.west_campus_phone_dir_layout);
        
        String[] phoneDirectory={"Operator:  305-237-8000", 
        		"Reception Desk: 305-237-8918",
        		"Admissions:  305-237-8900",
        		"Advisement:  305-237-8947",
        		"Bursar:  305-237-8947",
        		"Campus Services: 305-237-8970",
        		"Financial Aid: 305-237-8941",
        		"Library: 305-237-8931",
        		"Student Life: 305-237-8904",
        		"Testing:  305-237-8979",
        		"West Directory"
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
		        			//Operator:  305-237-8000 
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-8000")));
		        			break;
		        		case 1:
		        			//Reception Desk: 305-237-8918
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-8918")));
		        			break;
		        		case 2:
		        			//Admissions:  305-237-8900
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-8900")));
		        			break;
		        		case 3:
		        			//Advisement:  305-237-8947
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-8947")));
		        			break;
		        		case 4:
		        			//Bursar: 305-237-8951
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-8951")));
		        			break;
		        		case 5:
		        			//Campus Services: 305-237-8970
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-8970")));
		        			break;
		        		case 6:
		        			//Financial Aid: 305-237-8941
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-8941")));
		        			break;
		        		case 7:
		        			//Library: 305-237-8931
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("tel:305-237-8931")));
		        			break;
		        		case 8:
		        			//Student Life: 305-237-8904
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("305-237-8904")));
		        			break;
		        		case 9:
		        			//Testing:  305-237-8979
		        			startActivity(new Intent(Intent.ACTION_DIAL,
		        					Uri.parse("305-237-8979")));
		        			break;
		        		case 10:
		        			startActivity(new Intent(Intent.ACTION_VIEW, 
		        					Uri.parse("http://www.mdc.edu/west/West%20Campus%20Directory.asp")));
		        			break;
		        					}
						}

			
		}; 
        	
        		
			
}


