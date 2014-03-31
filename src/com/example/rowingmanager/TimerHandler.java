package com.example.rowingmanager;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class TimerHandler extends Activity implements OnClickListener {
	
	private final int MSG_START_TIMER = 0;
    private final int MSG_STOP_TIMER = 1;
    private final int MSG_UPDATE_TIMER = 2;
    private final int REFRESH_RATE = 1000;
	private Stopwatch timer =new Stopwatch();
	
	@Override
    public void onClick(View v) {
        if(MainActivity.start_button == v)
        {
		    MainActivity.chrono.setBase(SystemClock.elapsedRealtime());
 		    MainActivity.chrono.start();
		    MainActivity.milli_chrono.setBase(SystemClock.elapsedRealtime());
		    MainActivity.milli_chrono.start();
        }else
        if(MainActivity.stop_button == v){
        	MainActivity.chrono.setBase(SystemClock.elapsedRealtime());
		    MainActivity.chrono.stop();
		    MainActivity.milli_chrono.setBase(SystemClock.elapsedRealtime());
		    MainActivity.milli_chrono.stop();
		    long endTime = System.currentTimeMillis();
			String elapsed = String.valueOf((endTime - MainActivity.startTime)/1000.0);
			String elapsedSec = elapsed + " seconds";
        }
    }

}
