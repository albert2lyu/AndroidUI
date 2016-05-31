package com.lanbots.uinotification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button showNft;
	private NotificationManager mNotificationManager;
	private Notification mNotification;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		showNft = (Button) findViewById(R.id.showNft);

		showNft.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				notification();

			}
		});

	}

	private void notification() {
		mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		mNotification = new Notification.Builder(this)
				.setSmallIcon(R.drawable.ic_launcher)
				.setTicker("Hello lanbots!")
				.setContentTitle("Notification Title")
				.setContentText("This is first Notification!")
				.build();
		mNotificationManager.notify(0, mNotification);
	}
}
