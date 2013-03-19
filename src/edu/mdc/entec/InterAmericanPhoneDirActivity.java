package edu.mdc.entec;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InterAmericanPhoneDirActivity extends ListActivity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String[] HialeahPhoneDirectory = {"Operator: 305-237-6000", "Admission: 305-237-6045",
											"Advisment: 305-237-6133", "Financial Aid: 305-237-6040",
											"Registration: 305-237-6045",
										"International Student: 305-237-6271", 
										"Student Life: 305-237-6163", "Testing: 305-237-6041"};
		
		setListAdapter(new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1, HialeahPhoneDirectory));
		
	}
	
	String OperatorNumber = "tel:305-237-6000";
	String AdmissionNumber = "tel:305-237-6045";
	String AdvisementNumber = "tel:305-237-6133";
	String FinancialAidNumber = "tel:305-237-6040";
	String RegistrationNumber = "tel:305-237-6045";
	String InternationalStudent  = "tel:305-237-6271";
	String StudentLifeNumber = "tel:305-237-6163";
	String TestingNumber = "tel: 305-237-6041";
	
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
			Intent CallStudentId = new Intent(Intent.ACTION_DIAL, Uri.parse(InternationalStudent));
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
