package com.lanbots.uiprogressdialog;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button btn1;
	private ProgressDialog progessDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn1 = (Button) findViewById(R.id.btn1);
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				progessDialog = ProgressDialog.show(MainActivity.this, "加载 中", "正在加载中，请稍后！");
				
				new Thread(){
					public void run() {
						
						try {
							//休眠5秒
							Thread.sleep(5000);
							//移除ProgressDialog
							progessDialog.dismiss();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					};
				}.start();
				
			}
		});
		
	}

}
