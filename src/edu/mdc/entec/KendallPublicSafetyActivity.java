package edu.mdc.entec;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class KendallPublicSafetyActivity extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.west_campus_public_safety_layout);
        
	
	
	//305-237-8100
	//http://www.mdc.edu/main/safety/
	//startActivity(new Intent(Intent.ACTION_VIEW,
	//		Uri.parse("http://www.mdc.edu/main/safety/")));
	//The array holding the menu list categories.
    String[] publicSafetyKendall = {"Call Kendall Campus Public Safety", 
    		"Public Safety Site",
    };
    
    ListView lvkendy = new ListView(this);
    
    lvkendy.setAdapter(new ArrayAdapter<String>(this,
    		android.R.layout.simple_list_item_1, publicSafetyKendall));
    
    setContentView(lvkendy);
    
    lvkendy.setOnItemClickListener(mListViewClicks);
}
    
   private OnItemClickListener mListViewClicks = new OnItemClickListener() {

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
	        		
	        		switch(arg2){
	case 0:
		startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:305-237-2100")));
		break;
	case 1:
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/safety/")));
		break;
	
		}
	}
   };
}