package com.example.beautyclan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CelebrateOcc extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView (R.layout.celebrateocc);
	
		Button btnSimple = (Button) findViewById(R.id.button1);
        btnSimple.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), FathersDay.class);
                startActivityForResult(intent, 0);
            }
        });
	
	
	
        Button btnSimple1 = (Button) findViewById(R.id.button2);
        btnSimple1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), MothersDay.class);
                startActivityForResult(intent, 0);
            }
        });
	
	
        Button btnSimple2 = (Button) findViewById(R.id.button3);
        btnSimple2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), ValentinesDay.class);
                startActivityForResult(intent, 0);
            }
        });
	
	
	
	}}
