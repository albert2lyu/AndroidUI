package com.lanbots.uiimageswitcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Gallery.LayoutParams;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;

public class MainActivity extends Activity implements ViewFactory, OnItemSelectedListener{
	
	private ImageSwitcher mImageSwitcher;
	private Gallery mGallery;
	
	private Integer[] mImageIds = { R.drawable.img01, R.drawable.img02,
			R.drawable.img03, R.drawable.img04, R.drawable.img05
			};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		mImageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
		mGallery = (Gallery) findViewById(R.id.gallery);
		
		mImageSwitcher.setFactory(this);
			//设置动画效果
		mImageSwitcher.setInAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.fade_in));
		mImageSwitcher.setAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.fade_out));
		
		mGallery.setAdapter(new ImageAdapter(this));
		mGallery.setOnItemSelectedListener(this);
	}

	
	@Override
	public View makeView() {
		// TODO Auto-generated method stub
		ImageView  iv = new ImageView(this);
		iv.setBackgroundColor(0xFF000000);
		iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
		iv.setLayoutParams(new ImageSwitcher.LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		return iv;
	}


	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		// TODO Auto-generated method stub
		mImageSwitcher.setImageResource(mImageIds[position]);
	}


	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}

}
