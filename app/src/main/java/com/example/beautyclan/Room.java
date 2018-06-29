package com.example.beautyclan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Room extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView (R.layout.room);
		
		
		Button btnSimple = (Button) findViewById(R.id.button2);
        btnSimple.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), ClassRoom.class);
                startActivityForResult(intent, 0);
            }
        });
	
	
	
        Button btnSimple1 = (Button) findViewById(R.id.button1);
        btnSimple1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Office.class);
                startActivityForResult(intent, 0);
            }
        });
	
	
	
        Button btnSimple2 = (Button) findViewById(R.id.button3);
        btnSimple2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), HomeSwHome.class);
                startActivityForResult(intent, 0);
            }
        });
	
	
	
	
	}}