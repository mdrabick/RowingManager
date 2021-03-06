package com.example.rowingmanager;

import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity {
	
	
    static long startTime;
	static MilliChrono milli_chrono;
	public static Button stop_button;
	public static Button start_button;
	public static TextView field;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		/* this is a comment */
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		field = (TextView)findViewById(R.id.field);
		milli_chrono = (MilliChrono)findViewById(R.id.millichrono);
		stop_button=(Button)findViewById(R.id.stop_button);
		start_button=(Button)findViewById(R.id.start_button);
		TimerHandler th = new TimerHandler();
		start_button.setOnClickListener(th);
		stop_button.setOnClickListener(th);
		/*start_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
			   field.setText(getText(R.string.hello_text));
			   startTime = System.currentTimeMillis();
			   chrono.setBase(SystemClock.elapsedRealtime());
			   chrono.start();
			   milli_chrono.setBase(SystemClock.elapsedRealtime());
			   milli_chrono.start();
			}
	    });*/
	}


	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
