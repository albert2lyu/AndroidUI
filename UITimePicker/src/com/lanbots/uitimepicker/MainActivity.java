package com.lanbots.uitimepicker;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends Activity {
	
	private Button btnSelectTime;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnSelectTime = (Button) findViewById(R.id.btnSelectTime);
		
		btnSelectTime.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
					
					@Override
					public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
						// TODO Auto-generated method stub
						String outTime = timeFormat(hourOfDay) + ":" + timeFormat(minute) ;
						btnSelectTime.setText(outTime);
					}
				}, 20, 8, true).show();
			}
		});
		
	}
	
	public String timeFormat(int value){
		if(value >= 10){
			return "" + value;
		}else {
			return "0" + value;
		}
		
	}

}
