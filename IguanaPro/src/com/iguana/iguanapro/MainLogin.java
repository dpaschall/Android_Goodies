package com.iguana.iguanapro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainLogin extends Activity {
	
	/**Used for passing data to next activity */
	public final static String EXTRA_MESSAGE = "com.iguana.iguanapro.MESSAGE";
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}
	
	 @Override
   public void onSaveInstanceState(Bundle savedInstanceState) {
       super.onSaveInstanceState(savedInstanceState);      
   }

	 /** Called when the user clicks the Login button */
	 public void login(View view) {
	     // Save string and move to different activity in response to button
		 Intent intent = new Intent(this, UsernameDisplay.class);
		 EditText editText = (EditText) findViewById(R.id.edit_message);
		 String message = editText.getText().toString();
		 intent.putExtra(EXTRA_MESSAGE, message);
		 startActivity(intent);
	 }
	 
	 /** Called when the user clicks the Settings/Gutz button */
	 public void Settings(View view) {
	     // Save string and move to different activity in response to button
		 //Intent intent = new Intent(this, Settings.class);
		 //startActivity(intent);
	 }
	 
	 /** Called when the user clicks the About Iguana button */
	 public void About(View view) {
	     // Save string and move to different activity in response to button
		 Intent intent = new Intent(this, About.class);
		 startActivity(intent);
	 }
	 
	 
}
