package com.example.rowingmanager;

import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;



public class MainActivity extends Activity {
	
	
	private long startTime;
	private Chronometer chrono;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView text = (TextView)findViewById(R.id.field);
		final Button start_button=(Button)findViewById(R.id.start_button);
		chrono = (Chronometer)findViewById(R.id.chronometer1);
		start_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
			   text.setText(getText(R.string.hello_text));
			   startTime = System.currentTimeMillis();
			   chrono.setBase(SystemClock.elapsedRealtime());
			   chrono.start();
			}
	    });
		final Button stop_button=(Button)findViewById(R.id.stop_button);
		stop_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				long endTime = System.currentTimeMillis();
				String elapsed = String.valueOf((endTime - startTime)/1000.0);
				String elapsedSec = elapsed + " seconds";
				text.setText(elapsedSec);
				chrono.stop();
			}
	    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	

}
