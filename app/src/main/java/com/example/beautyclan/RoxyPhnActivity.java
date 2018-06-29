package com.example.beautyclan;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RoxyPhnActivity extends Activity {
	    /** Called when the activity is first created. */
	    
		private Button makeTheCall;
		
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.roxyphnlayout);
	
	        makeTheCall = (Button)  findViewById(R.id.button1);
	        makeTheCall.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent callIntent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:9126154"));
					startActivity(callIntent);
				}
	        	
	        	
	        });
}
}