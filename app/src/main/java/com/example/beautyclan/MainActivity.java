package com.example.beautyclan;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends  Activity {
	 
		ImageView imageView;
		AnimationDrawable myAnimationDrawable;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			
			Button btnSimple = (Button) findViewById(R.id.button1);
	        btnSimple.setOnClickListener(new OnClickListener() {

	            public void onClick(View v) {

	                Intent intent = new Intent(v.getContext(), Desire.class);
	                startActivityForResult(intent, 0);
	            }
	        });

			
			imageView=(ImageView) findViewById(R.id.imageView1);
			imageView.setImageResource(R.drawable.frameanimation);
			//myAnimationDrawable=(AnimationDrawable)imageView.getDrawable();
			//myAnimationDrawable.strat();
			myAnimationDrawable=(AnimationDrawable)imageView.getDrawable();
			myAnimationDrawable.start();
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.main, menu);
			return true;
		}

	}

