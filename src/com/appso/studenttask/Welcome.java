package com.appso.studenttask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Welcome extends Activity implements OnClickListener {
	Button btncost, btncgpa, btnresult, btnassignment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btncost = (Button) findViewById(R.id.btncost);
		btncgpa = (Button) findViewById(R.id.btncgpa);
		btnresult = (Button) findViewById(R.id.btnresult);
		btnassignment = (Button) findViewById(R.id.btnNotes);
		btncost.setOnClickListener(this);
		btncgpa.setOnClickListener(this);
		btnresult.setOnClickListener(this);
		btnassignment.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnNotes:

			startActivity(new Intent(this, Assignment.class));
			Toast.makeText(this, "Assignment Set", Toast.LENGTH_SHORT).show();
			break;

		case R.id.btncost:
			startActivity(new Intent(this, Credit.class));
			Toast.makeText(this, "Credit Cost Clicked", Toast.LENGTH_SHORT)
					.show();
			break;

		case R.id.btncgpa:
			startActivity(new Intent(this, CGPA.class));
			Toast.makeText(this, "CGPA Clicked", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btnresult:

			startActivity(new Intent(this, Result.class));
			Toast.makeText(this, "Show Result", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
	}

	@Override
	protected void onPause() {

		super.onPause();
		finish();
	}

}
