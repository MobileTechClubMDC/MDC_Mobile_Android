package edu.mdc.entec;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import edu.mdc.entec.R;


public class HomesteadPhoneDirActivity extends ListActivity 
{
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		String[] contacts={"Admissions:305-237-5555", "Advisement:305-237-5046", "Financial Aid:305-237-5024",
				"Student Life:305-237-5065", "Library:305-237-5153", "Testing:305-237-5105",
				"Bursar Office:305-237-5054", "Campus Directory List"};
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, contacts));
		
	}
	
	protected void onListItemClick(ListView i, View v, int position, long id) 
	{
		
		switch(position) 
		{
			case 0:
				   startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:305-237-5555")));
									
			break;
			
			case 1:
				 startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:305-237-5046")));
			break;
			
			case 2:
				 startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:305-237-5024")));
			break;
			
			case 3:
				 startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:305-237-5065")));
			break;
			
			case 4:
				 startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:305-237-5153")));
			break;
			
			case 5:
				 startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:305-237-5105")));
			break;
			
			case 6:
				 startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse("tel:3305-237-5054")));
			break;
			
			case 7:
				startActivity(new Intent(Intent.ACTION_VIEW,
						Uri.parse("http://www.mdc.edu/homestead/homestead_directory.asp")));
			break;
					
		}
	}
}
