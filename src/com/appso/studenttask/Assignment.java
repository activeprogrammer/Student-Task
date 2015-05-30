package com.appso.studenttask;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class Assignment extends Activity {
	EditText etname, etdate, etcourse, etnote;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initialize();
	}

	public void initialize() {
		etname = (EditText) findViewById(R.id.editname);
		etdate = (EditText) findViewById(R.id.editdate);
		etcourse = (EditText) findViewById(R.id.editcourse);
		etnote = (EditText) findViewById(R.id.editnote);
	}

	public void addassignment(View v) {
		SharedPreferences sharedPreferences = getSharedPreferences("MyData",
				Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("name", etname.getText().toString());
		editor.putString("date", etdate.getText().toString());
		editor.putString("course", etcourse.getText().toString());
		editor.putString("notes", etnote.getText().toString());
		editor.commit();
		Toast.makeText(this, "Assignment Added", Toast.LENGTH_SHORT).show();
	}

	public void viewassignment(View v) {

		Toast.makeText(this, "See Assignment", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this, AddedAssignment.class));
	}
}
