package edu.mdc.entec;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import edu.mdc.entec.R;

public class HomesteadPublicSafetyActivity extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wolfson_campus_public_safety_layout);
        
	
	
	//305-237-8100
	//http://www.mdc.edu/main/safety/
	//startActivity(new Intent(Intent.ACTION_VIEW,
	//		Uri.parse("http://www.mdc.edu/main/safety/")));
	//The array holding the menu list categories.
    String[] publicSafetyHomestead={"Call Homestead Campus Public Safety", 
    		"Public Safety Site",
    };
    
    ListView lvhome = new ListView(this);
    
    lvhome.setAdapter(new ArrayAdapter<String>(this,
    		android.R.layout.simple_list_item_1,publicSafetyHomestead));
    
    setContentView(lvhome);
    
    lvhome.setOnItemClickListener(mListViewClicks);
}
    
   private OnItemClickListener mListViewClicks = new OnItemClickListener() {

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
	        		
	        		switch(arg2){
	case 0:
		startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:305-237-5100")));
		break;
	case 1:
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/safety/")));
		break;
	
		}
	}
   };
}
