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
	
	private boolean stopped = false;
	private long lastStop;
	
	@Override
    public void onClick(View v) {
        if(MainActivity.start_button == v)
        {
        	stopped = false;
		    MainActivity.milli_chrono.setBase(SystemClock.elapsedRealtime());
		    MainActivity.milli_chrono.start();
        }
        else if(MainActivity.stop_button == v){
		    if (!stopped) {
		    	lastStop = SystemClock.elapsedRealtime();
		    	
			    MainActivity.milli_chrono.updateText(lastStop);
			    MainActivity.milli_chrono.stop();
		    	stopped = true;
		    }
        }
    }

}
