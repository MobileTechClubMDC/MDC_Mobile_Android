package edu.mdc.entec;

import android.app.Activity;
import android.app.ListActivity;
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
		String [] directoryKendall = {"Operator: 305-237-2000",
				"Admissions: 305-237-2222", "Financial Aid: 305-237-2325",
				"Library: 305-237-2321", "Advisement: 305-237-2339", "Academic Affairs: 305-237-0972"};
		
		ListView lvken = new ListView(this);
		lvken.setAdapter(new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1,directoryKendall));
		setContentView(lvken);
		
		lvken.setOnItemClickListener(mListViewClicks);
	}
        
       private OnItemClickListener mListViewClicks = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
			switch (arg2) {
			case 0:
				startActivity(new Intent(Intent.ACTION_DIAL, 
						Uri.parse("tel: 305-237-2000")));
				break;
			case 1:
				startActivity(new Intent(Intent.ACTION_DIAL, 
						Uri.parse("tel: 305-237-2222")));
				break;			
			case 2:
				startActivity(new Intent(Intent.ACTION_DIAL, 
						Uri.parse("tel: 305-237-2325")));
				break;			
			case 3:
				startActivity(new Intent(Intent.ACTION_DIAL, 
						Uri.parse("tel: 305-237-2321")));
				break;		
			case 4:
				startActivity(new Intent(Intent.ACTION_DIAL, 
						Uri.parse("tel: 305-237-2339")));
				break;			
			case 5:
				startActivity(new Intent(Intent.ACTION_DIAL, 
						Uri.parse("tel: 305-237-0972")));
				break;				
				
			}
		}
       };
}