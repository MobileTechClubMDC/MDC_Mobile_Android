package edu.mdc.entec;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HialeahPhoneDirActivity extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String[] HialeahPhoneDirectory = {"Operator", "Admission", "Advisment",
										"Financial Aid","Registration",
										"Student ID", "Student Life", "Testing"};
		
		setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, HialeahPhoneDirectory));
		
	}
	
	String OperatorNumber = "tel:305-237-8700";
	String AdmissionNumber = "tel:305-237-8775";
	String AdvisementNumber = "tel:305-237-8794";
	String FinancialAidNumber = "tel:305-237-8779";
	String RegistrationNumber = "tel:305-237-8775";
	String StudentIdNumber = "tel:305-237-8831";
	String StudentLifeNumber = "tel:305-237-8736";
	String TestingNumber = "tel:305-237-8791";
	
		protected void onListItemClick(ListView l, View v, int position, long id) {
		
		switch(position) {
		case 0:
			Intent CallOperator = new Intent(Intent.ACTION_DIAL, Uri.parse(OperatorNumber));
			startActivity(CallOperator);
			break;
			
		case 1:
			Intent CallAdmission = new Intent(Intent.ACTION_DIAL, Uri.parse(AdmissionNumber));
			startActivity(CallAdmission);
			break;
			
		case 2:
			Intent CallAdvisement = new Intent(Intent.ACTION_DIAL, Uri.parse(AdvisementNumber));
			startActivity(CallAdvisement);
			break;
			
		case 3:
			Intent CallFinancialAid = new Intent(Intent.ACTION_DIAL, Uri.parse(FinancialAidNumber));
			startActivity(CallFinancialAid);
			break;
			
		case 4:
			Intent CallRegistration = new Intent(Intent.ACTION_DIAL, Uri.parse(RegistrationNumber));
			startActivity(CallRegistration);
			break;
			
		case 5:
			Intent CallStudentId = new Intent(Intent.ACTION_DIAL, Uri.parse(StudentIdNumber));
			startActivity(CallStudentId);
			break;
			
		case 6:
			Intent CallStudentLife = new Intent(Intent.ACTION_DIAL, Uri.parse(StudentLifeNumber));
			startActivity(CallStudentLife);
			break;
			
		case 7: 
			Intent CallTesting = new Intent(Intent.ACTION_DIAL, Uri.parse(TestingNumber));
			startActivity(CallTesting);
			break;
		}
		
	}
}
