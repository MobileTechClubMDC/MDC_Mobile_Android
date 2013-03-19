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

public class WolfsonPhoneDirActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wolfson_campus_phone_dir_layout);
		String[] directory={"Operator:	305-237-3000","Admissions:	305-237-3644", 
							"Advisement:	305-237-3077", "Financial Aid:	305-237-3244",
							"Student Life:	305-237-3536", "Library:	305-237-3144"};
		
		ListView lvwolf = new ListView(this);
		lvwolf.setAdapter(new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1,directory));
		setContentView(lvwolf);
		
		lvwolf.setOnItemClickListener(mListViewClicks);
	}
        
       private OnItemClickListener mListViewClicks = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
			switch(arg2){
			case 0:
				String operator = "tel:3052373000";
				startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(operator)));
				break;
			case 1:
				String admissions = "tel:3052373644";
				startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(admissions)));
				break;
			case 2:
				String advisement = "tel:3052373077";
				startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(advisement)));
				break;
			case 3:
				String financial_aid = "tel:3052373244";
				startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(financial_aid)));
				break;
			case 4:
				String student_life = "tel:3052373536";
				startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(student_life)));
				break;
			case 5:
				String library = "tel:3052373144";
				startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(library)));
				break;			
			}
		}
       };
}