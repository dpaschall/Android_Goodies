package com.iguana.iguanapro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class Splash extends Activity {

	private final int SPLASH_DELAY = 1500;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState){
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//Remove title bar
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Thread timer = new Thread(){
			public void run()
			{
				try{
					sleep(SPLASH_DELAY);

				}catch(InterruptedException e){e.printStackTrace();}
				finally{   
					Intent openLoginScreen = new Intent("com.iguana.iguanapro.MainLogin");
					startActivity(openLoginScreen);   }				
			}
		};

		timer.start();

	}
	
	@Override
	public void onDestroy() {
	    super.onDestroy();  // Always call the superclass
	    
	    // Stop method tracing that the activity started during onCreate()
	    android.os.Debug.stopMethodTracing();
	}
    

}
