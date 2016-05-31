package com.lanbots.uidatepicker;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends Activity {
	
	private Button btnSelect;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnSelect = (Button) findViewById(R.id.btnSelect);
		btnSelect.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				new DatePickerDialog(MainActivity.this, new OnDateSetListener() {
					
					@Override
					public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
						// TODO Auto-generated method stub
						String out = year + "Äê" + (monthOfYear+1) + "ÔÂ" + dayOfMonth + "ÈÕ";
						btnSelect.setText(out);
					}
				} , 2016, 05, 29).show();
			}
		});
		
	}

}
