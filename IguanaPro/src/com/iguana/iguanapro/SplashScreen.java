package com.iguana.iguanapro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

public class SplashScreen extends Activity {

	private final int SPLASH_DELAY = 5000;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // Show the Up button in the action bar.
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

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
	
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
