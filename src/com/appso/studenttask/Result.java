package com.appso.studenttask;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;

public class Result extends Activity {
	WebView web;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		web = (WebView) findViewById(R.id.webView);
		setupWebview();
	}

	@SuppressLint("SetJavaScriptEnabled")
	private void setupWebview() {
		web.getSettings().setJavaScriptEnabled(true);
		web.getSettings().setBuiltInZoomControls(true);
		web.setWebViewClient(new WebViewClient());
		web.loadUrl("http://www.educationboardresults.gov.bd/regular/index.php");

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub

		startActivity(new Intent(this, Welcome.class));
		super.onPause();
	}
}
