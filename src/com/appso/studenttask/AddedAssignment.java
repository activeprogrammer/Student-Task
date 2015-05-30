package com.appso.studenttask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AddedAssignment extends Activity {
	public static final String Default = "N/A";
	TextView tname, tdate, tcourse, tnotes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.added_assignment);
		initialize();
	}

	public void initialize() {
		tname = (TextView) findViewById(R.id.textView1);
		tdate = (TextView) findViewById(R.id.textView2);
		tcourse = (TextView) findViewById(R.id.textView3);
		tnotes = (TextView) findViewById(R.id.textView4);
	}

	public void view(View v) {
		SharedPreferences sharedPreferences = getSharedPreferences("MyData",
				Context.MODE_PRIVATE);
		String name = sharedPreferences.getString("name", Default);
		String date = sharedPreferences.getString("date", Default);
		String course = sharedPreferences.getString("course", Default);
		String notes = sharedPreferences.getString("notes", Default);
		if (name.equals(Default) || date.equals(Default)
				|| course.equals(Default) || notes.equals(Default)) {
			Toast.makeText(this, "View Not Found", Toast.LENGTH_SHORT).show();
		} else {

			Toast.makeText(this, "View Successfully", Toast.LENGTH_SHORT)
					.show();
			tname.setText(name);
			tdate.setText(date);
			tcourse.setText(course);
			tnotes.setText(notes);

		}
	}
}
