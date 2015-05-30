package com.appso.studenttask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends Activity {

	// TextToSpeech object;
	int result;
	TextView tvsound;
	String text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(3000);
					Intent menuIntent = new Intent(
							"com.appso.studenttask.WELCOME");
					startActivity(menuIntent);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					finish();
				}
			}
		};
		timer.start();
	}
	/*
	 * tvsound = (TextView) findViewById(R.id.welcom);
	 * 
	 * object = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
	 * 
	 * @Override public void onInit(int status) { if (status ==
	 * TextToSpeech.SUCCESS) { result = object.setLanguage(Locale.UK); } else {
	 * Toast.makeText(getApplicationContext(), "The feature not supported",
	 * Toast.LENGTH_LONG) .show(); } } });
	 * 
	 * sound(); public void sound() { if (result ==
	 * TextToSpeech.LANG_NOT_SUPPORTED || result ==
	 * TextToSpeech.LANG_MISSING_DATA) { Toast.makeText(getApplicationContext(),
	 * "The feature not supported", Toast.LENGTH_LONG).show(); } else {
	 * 
	 * text = "Welcome to Student Task"; object.speak(text,
	 * TextToSpeech.QUEUE_FLUSH, null); } }
	 */
}
