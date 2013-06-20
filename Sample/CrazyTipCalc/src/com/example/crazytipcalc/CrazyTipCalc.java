package com.example.crazytipcalc;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;

public class CrazyTipCalc extends Activity {

	private static final String TOTAL_BILL = "TOTAL_BILL";
	private static final String CURRENT_TIP = "CURRENT_TIP";
	private static final String BILL_WITHOUT_TIP = "BILL_WITHOUT_TIP";
	
	private double billBeforeTip, tipAmount, finalBill;

	//create editableText's to access the xml editable text
	EditText billBeforeTipET;
	EditText tipAmountET;
	EditText finalBillET;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_crazy_tip_calc);
		
		//has the app been restored from another state?
		if(savedInstanceState == null)
		{
			billBeforeTip = 0.0;
			tipAmount = 0.15;
			finalBill = 0.0;
			
		}
		else
		{
			//returns an instance key associated with the string object
			billBeforeTip = savedInstanceState.getDouble(BILL_WITHOUT_TIP);
			tipAmount = savedInstanceState.getDouble(CURRENT_TIP);
			finalBill = savedInstanceState.getDouble(TOTAL_BILL);
			
			
		}
		
		//initialize the EditText Boxes
	    billBeforeTipET = (EditText) findViewById(R.id.billEditText);
		tipAmountET = (EditText) findViewById(R.id.tipEditText);
		finalBillET = (EditText) findViewById(R.id.finalBillEditText);
		
		//setup changeListener
		billBeforeTipET.addTextChangedListener(billBeforeTipListener);
		
		
	}
	
	//TextListener interface
	private TextWatcher billBeforeTipListener = new TextWatcher()
	{

		@Override
		public void afterTextChanged(Editable s)
		{
			
		}

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count,	int after)
		{
		}

		@Override
		public void onTextChanged(CharSequence s, int start, int before,int count)
		{
			
			try{
				
				billBeforeTip = Double.parseDouble(s.toString());
			}catch(NumberFormatException e){ billBeforeTip = 0.0;}
			
			updateTipAndFinalBill();
			
		}
		
	};
	
	
	//calculate the final bill
	private void updateTipAndFinalBill()
	{
		double tipAmount = Double.parseDouble(tipAmountET.getText().toString());
		
		double finalBill = billBeforeTip + (billBeforeTip * tipAmount);
		
		finalBillET.setText(String.format("%.02f", finalBill ));
		
	}
	
	
	protected void onSaveInstanceState(Bundle outState)
	{
		super.onSaveInstanceState(outState);
		outState.putDouble(TOTAL_BILL, finalBill);
		outState.putDouble(CURRENT_TIP, tipAmount);
		outState.putDouble(BILL_WITHOUT_TIP, billBeforeTip);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.crazy_tip_calc, menu);
		return true;
	}

}
