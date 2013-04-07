package edu.mdc.entec;

import com.google.analytics.tracking.android.EasyTracker;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NorthPhoneDirActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] phoneDirectory={"Operator (305)237-1000","EEC Center (305)237-1910","North Campus (305)237-1100",
				"Admissions (305)237-1111","Advisement (305)237-1425","Financial Aid (305)237-1058","Student Life (305)237-1250"};
		setListAdapter(new ArrayAdapter<String>(this,
			android.R.layout.simple_list_item_1, phoneDirectory));
		
	}
		
	String OperatorNumber = "tel:305 237-1000";
	String EecCenterNumber ="tel:305 237-6271";
	String NorthCampusNumber ="tel:305 237-1100";
	String AdmissionsNumber ="tel:305 237-1111";
	String AdvisementNumber ="tel:305 237-1425";
	String FinancialAidNumber ="tel:305 237-1058";
	String StudentLifeNumber ="tel:305 237-1250";
	
	




	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch(position){
		
		case 0:
			Intent CallOperator = new Intent(Intent.ACTION_DIAL, Uri.parse(OperatorNumber));
			startActivity(CallOperator);
			break;
			
		case 1:
			Intent CallEecCenter = new Intent(Intent.ACTION_DIAL, Uri.parse(EecCenterNumber));
			startActivity(CallEecCenter);
			break;
			
		case 2:
			Intent CallNorthCampus = new Intent(Intent.ACTION_DIAL, Uri.parse(NorthCampusNumber));
			startActivity(CallNorthCampus);
			break;
			
		case 3:
			Intent CallAdmissions = new Intent(Intent.ACTION_DIAL, Uri.parse(AdmissionsNumber));
			startActivity(CallAdmissions);
			break;
			
		case 4:
			Intent CallAdvisement = new Intent(Intent.ACTION_DIAL, Uri.parse(AdvisementNumber));
			startActivity(CallAdvisement);
			break;
			
		case 5:
			Intent CallFinancialAid = new Intent(Intent.ACTION_DIAL, Uri.parse(FinancialAidNumber));
			startActivity(CallFinancialAid);
			break;
			
		case 6:
			Intent CallStudentLife = new Intent(Intent.ACTION_DIAL, Uri.parse(StudentLifeNumber));
			startActivity(CallStudentLife);
			break;	
			
		}
	}
	
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