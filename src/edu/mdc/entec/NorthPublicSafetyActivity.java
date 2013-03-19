package edu.mdc.entec;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NorthPublicSafetyActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		String[] publicSafety={"Call North Campus Public Safety", "Public Safety Site"};
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, publicSafety));
	}

		String PublicSafetyNumber = "tel:(305)237-1100";
		String PublicSafetyWeb = "web:http://www.mdc.edu/main/safety/";
	
	
	
	
		protected void onListItemClick(ListView l, View v, int position, long id) {
			switch(position){
			case 0:
				Intent CallPublicSafety = new Intent(Intent.ACTION_DIAL, Uri.parse(PublicSafetyNumber));
				startActivity(CallPublicSafety);
				break;
			case 1:
				Intent WebPublicSafety = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mdc.edu/main/safety/"));
				startActivity(WebPublicSafety);
				break;
				
			}
		}
}
