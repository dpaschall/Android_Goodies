package com.iguana.iguanapro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

	private final int SPLASH_DELAY = 5000;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);

		Thread timer = new Thread(){
			public void run()
			{
				try{
					sleep(SPLASH_DELAY);

				}catch(InterruptedException e){e.printStackTrace();}
				finally{   
					Intent openLoginScreen = new Intent("com.iguana.iguanapro.LOGIN");
					startActivity(openLoginScreen);   }				
			}
		};

		timer.start();

	}

}
