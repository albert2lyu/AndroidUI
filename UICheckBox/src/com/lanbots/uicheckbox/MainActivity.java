package com.lanbots.uicheckbox;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity {

	private Button suBtn;
	private CheckBox pants;
	private CheckBox jacket;
	private CheckBox shoes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		suBtn = (Button) findViewById(R.id.suBtn);
		pants = (CheckBox) findViewById(R.id.pants);
		jacket = (CheckBox) findViewById(R.id.jakcet);
		shoes = (CheckBox) findViewById(R.id.shoes);

		suBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String out = "��ѡ�����Ʒ�У�  \n";
				
				if(pants.isChecked()){
					out += "����" + "\n";
				}
				if(jacket.isChecked()) {
					out += "���� " + "\n";
				}
				if (shoes.isChecked()) {
					out += "Ь��";
				}
				
				new AlertDialog.Builder(MainActivity.this).setTitle("���").setMessage(out).setPositiveButton("�ر�", null).show();
			}
		});

	}

}
