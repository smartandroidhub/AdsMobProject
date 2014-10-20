package com.example.adsproject;

import android.app.Activity;
import android.os.Bundle;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		AdView adview = (AdView)findViewById(R.id.adView);
		AdRequest re = new AdRequest();
		re.setTesting(true);
		adview.loadAd(re);

	}
}
