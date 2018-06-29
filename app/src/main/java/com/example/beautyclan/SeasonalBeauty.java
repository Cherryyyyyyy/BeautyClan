package com.example.beautyclan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SeasonalBeauty extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView (R.layout.seasonalbeauty);
	
		Button btnSimple = (Button) findViewById(R.id.button1);
        btnSimple.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Summer.class);
                startActivityForResult(intent, 0);
            }
        });
	
	
	
        Button btnSimple1 = (Button) findViewById(R.id.button2);
        btnSimple1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), Winter.class);
                startActivityForResult(intent, 0);
            }
        });
	
	
	
	}}