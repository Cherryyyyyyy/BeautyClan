package com.example.beautyclan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Winter extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView (R.layout.winter);
	
	
		Button btnSimple = (Button) findViewById(R.id.button1);
        btnSimple.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), RoxyPhnActivity.class);
                startActivityForResult(intent, 0);
            }
        });
        
	
	
	
	
	}}
