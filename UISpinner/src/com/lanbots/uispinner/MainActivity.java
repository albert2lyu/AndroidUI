package com.lanbots.uispinner;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {
	
	private Spinner spinner;
	private String[] data = {"lanbots" , "linya" , "lingfu"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, data);
		spinner = (Spinner) findViewById(R.id.spinner);
		spinner.setAdapter(adapter);
		
	}

}
