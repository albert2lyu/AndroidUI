package com.lanbots.uiratingbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.Toast;
/**
 * RatingBar��ʹ��
 * @author LinBots
 *
 */
public class MainActivity extends Activity {
	
	private RatingBar mRatingBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mRatingBar = (RatingBar) findViewById(R.id.ratingBar);
		mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "����Ϊ" + rating, Toast.LENGTH_SHORT).show();
			}
		});
		
	}
}
