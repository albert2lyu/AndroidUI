package com.lanbots.uiradiogroup;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
	
	private Button subBtn;
	private RadioButton rbButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		rbButton =   (RadioButton) findViewById(R.id.rbtn1);
		
		subBtn = (Button) findViewById(R.id.sub);
		
		subBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(rbButton.isChecked()	){
					new AlertDialog.Builder(MainActivity.this ).setTitle("判断").setMessage("回答正确").setPositiveButton("退出程序",
							new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									finish();
								}
							}).show();
				}else{
					new AlertDialog.Builder(MainActivity.this ).setTitle("判断").setMessage("回答错误").setPositiveButton("取消", null).show();
				}
				
			}
		});
		
	}
}
