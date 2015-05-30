package com.appso.studenttask;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;

public class CGPA extends Activity {
	EditText et1, et1_2, et2_1, et2_2, et3_1, et3_2, et4_1, et4_2, et5_1,
			et5_2, et6_1, et6_2, et7_1, et7_2, et8_1, et8_2, et9_1, et9_2,
			et10_1, et10_2, et11_1, et11_2, et12_1, et12_2;
	TextView tvtotalcgpa, tvtotalcredit, tvaverege, tvwarning;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cgpa);
		et1 = (EditText) findViewById(R.id.et1_1);
		et1_2 = (EditText) findViewById(R.id.et1_2);
		et2_1 = (EditText) findViewById(R.id.et2_1);
		et2_2 = (EditText) findViewById(R.id.et2_2);
		et3_1 = (EditText) findViewById(R.id.et3_1);
		et3_2 = (EditText) findViewById(R.id.et3_2);
		et4_1 = (EditText) findViewById(R.id.et4_1);
		et4_2 = (EditText) findViewById(R.id.et4_2);
		et5_1 = (EditText) findViewById(R.id.et5_1);
		et5_2 = (EditText) findViewById(R.id.et5_2);
		et6_1 = (EditText) findViewById(R.id.et6_1);
		et6_2 = (EditText) findViewById(R.id.et6_2);
		et7_1 = (EditText) findViewById(R.id.et7_1);
		et7_2 = (EditText) findViewById(R.id.et7_2);
		et8_1 = (EditText) findViewById(R.id.et8_1);
		et8_2 = (EditText) findViewById(R.id.et8_2);
		et9_1 = (EditText) findViewById(R.id.et9_1);
		et9_2 = (EditText) findViewById(R.id.et9_2);
		et10_1 = (EditText) findViewById(R.id.et10_1);
		et10_2 = (EditText) findViewById(R.id.et10_2);
		et11_1 = (EditText) findViewById(R.id.et11_1);
		et11_2 = (EditText) findViewById(R.id.et11_2);
		et12_1 = (EditText) findViewById(R.id.et12_1);
		et12_2 = (EditText) findViewById(R.id.et12_2);
		tvaverege = (TextView) findViewById(R.id.tvaverage);
		tvtotalcgpa = (TextView) findViewById(R.id.tvoutCGPA);
		tvtotalcredit = (TextView) findViewById(R.id.tvoutCredit);
		tvwarning = (TextView) findViewById(R.id.tvwarnin);
	}

	public void result(View v) {
		String e1 = et1.getText().toString();
		String e2 = et1_2.getText().toString();
		String e3 = et2_1.getText().toString();
		String e4 = et2_2.getText().toString();
		String e5 = et3_1.getText().toString();
		String e6 = et3_2.getText().toString();
		String e7 = et4_1.getText().toString();
		String e8 = et4_2.getText().toString();
		String e9 = et5_1.getText().toString();
		String e10 = et5_2.getText().toString();
		String e11 = et6_1.getText().toString();
		String e12 = et6_2.getText().toString();
		String e13 = et7_1.getText().toString();
		String e14 = et7_2.getText().toString();
		String e15 = et8_1.getText().toString();
		String e16 = et8_2.getText().toString();
		String e17 = et9_1.getText().toString();
		String e18 = et9_2.getText().toString();
		String e19 = et10_1.getText().toString();
		String e20 = et10_2.getText().toString();
		String e21 = et11_1.getText().toString();
		String e22 = et11_2.getText().toString();
		String e23 = et12_1.getText().toString();
		String e24 = et12_2.getText().toString();
		if (!e1.equals("") && !e2.equals("") && !e3.equals("")
				&& !e4.equals("") && !e5.equals("") && !e6.equals("")
				&& !e7.equals("") && !e8.equals("") && !e9.equals("")
				&& !e10.equals("") && !e11.equals("") && !e12.equals("")
				&& !e13.equals("") && !e14.equals("") && !e15.equals("")
				&& !e16.equals("") && !e17.equals("") && !e18.equals("")
				&& !e19.equals("") && !e20.equals("") && !e21.equals("")
				&& !e22.equals("") && !e23.equals("") && !e24.equals("")) {
			double totalcgpa, totalcredit, first, second, third, four, five, six, seven, eight, nine, ten, eleven, twelve;

			first = (Double.parseDouble(e1) * (Double.parseDouble(e2)));
			second = (Double.parseDouble(e3) * (Double.parseDouble(e4)));
			third = (Double.parseDouble(e5) * (Double.parseDouble(e6)));
			four = (Double.parseDouble(e7) * (Double.parseDouble(e8)));
			five = (Double.parseDouble(e9) * (Double.parseDouble(e10)));
			six = (Double.parseDouble(e11) * (Double.parseDouble(e12)));
			seven = (Double.parseDouble(e13) * (Double.parseDouble(e14)));
			eight = (Double.parseDouble(e15) * (Double.parseDouble(e16)));
			nine = (Double.parseDouble(e17) * (Double.parseDouble(e18)));
			ten = (Double.parseDouble(e19) * (Double.parseDouble(e20)));
			eleven = (Double.parseDouble(e21) * (Double.parseDouble(e22)));
			twelve = (Double.parseDouble(e23) * (Double.parseDouble(e24)));
			totalcgpa = (first + second + third + four + five + six + seven
					+ eight + nine + ten + eleven + twelve);
			tvtotalcgpa.setText("" + totalcgpa);
			totalcredit = Double.parseDouble(e2) + Double.parseDouble(e4)
					+ Double.parseDouble(e6) + Double.parseDouble(e8)
					+ Double.parseDouble(e10) + Double.parseDouble(e12)
					+ Double.parseDouble(e14) + Double.parseDouble(e16)
					+ Double.parseDouble(e18) + Double.parseDouble(e20)
					+ Double.parseDouble(e22) + Double.parseDouble(e24);
			tvtotalcredit.setText("" + totalcredit);
			tvaverege.setText("" + (totalcgpa / totalcredit));
		} else {
			tvwarning.setText("Please Complete All");
			tvwarning.setTextColor(Color.RED);
		}

		/*
		 * if (condition) { startActivity(new Intent(this, MainActivity.class));
		 */

	}

	public void help(View v) {
		startActivity(new Intent(this, Help.class));
	}

	public void back(View v) {
		startActivity(new Intent(this, Welcome.class));
	}
}
