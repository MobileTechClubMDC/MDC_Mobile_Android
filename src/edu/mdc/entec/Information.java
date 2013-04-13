package edu.mdc.entec;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Information extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        
        ImageView imgSupport = (ImageView) findViewById(R.id.imgSupport);
        imgSupport.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_SEND);
				intent.setType("plain/text");
				intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "mobiletechclubmdc@gmail.com" });
				intent.putExtra(Intent.EXTRA_SUBJECT, "MDC Mobile Support");
				//intent.putExtra(Intent.EXTRA_TEXT, "mail body");
				startActivity(Intent.createChooser(intent, ""));
				
			}        
         });//End OnClickListener
        
        ImageView imgCreate = (ImageView) findViewById(R.id.imgCreatedBy);
		 imgCreate.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					//About us launch intent
					startActivity(new Intent(Information.this, AboutUs.class));						
				}
		
		 });//End OnClickListener
		 
		 ImageView imgAssociation = (ImageView) findViewById(R.id.imgAssociation);
		 imgAssociation.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					//ENTEC launch intent
					startActivity(new Intent(Intent.ACTION_VIEW, 
							Uri.parse("http://entec.mdc.edu/")));					
				}
		
		 });//End OnClickListener
		 
		 
		 
	}//End OnCreate
}

