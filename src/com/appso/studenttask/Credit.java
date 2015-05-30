package com.appso.studenttask;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;

public class Credit extends Activity {
	EditText theorycr, theorycost, labcr, labcost, waiver;
	TextView tvtheoycost, tvlabcst, tvtotal, tvwaveb, tvmid, tvwarning;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.credit);

		theorycr = (EditText) findViewById(R.id.credittheory);
		theorycost = (EditText) findViewById(R.id.costtheory);
		labcr = (EditText) findViewById(R.id.creditlab);
		labcost = (EditText) findViewById(R.id.costlab);
		waiver = (EditText) findViewById(R.id.waivercost);
		tvtheoycost = (TextView) findViewById(R.id.tvtheorycost);
		tvlabcst = (TextView) findViewById(R.id.tvlabcost);
		tvtotal = (TextView) findViewById(R.id.tvtotalcost);
		tvwaveb = (TextView) findViewById(R.id.tvwaiver);
		tvmid = (TextView) findViewById(R.id.tvmidterm);
		tvwarning = (TextView) findViewById(R.id.tvwarning);
	}

	public void result(View v) {
		String cr1 = theorycr.getText().toString();
		String crcost1 = theorycost.getText().toString();
		String cr2 = labcr.getText().toString();
		String crcost2 = labcost.getText().toString();
		String waiv = waiver.getText().toString();
		/*
		 * if ((!cr1.equals("") && !crcost1.equals("")) || (!cr2.equals("") &&
		 * crcost2.equals("")) || waiv.equals("")) {
		 */
		if (!cr1.equals("") && !crcost1.equals("") && !cr2.equals("")
				&& !crcost2.equals("") && !waiv.equals("")) {
			double op1, op2, op3, op4, op5, res1, res2, res3, res4, res5;
			op1 = Double.parseDouble(cr1);
			op2 = Double.parseDouble(crcost1);
			op3 = Double.parseDouble(cr2);
			op4 = Double.parseDouble(crcost2);
			op5 = Double.parseDouble(waiv);
			res1 = op1 * op2;
			res2 = op3 * op4;
			res3 = res1 + res2;
			res4 = res3 - (res3 * op5 / 100);
			res5 = res4 / 2;
			tvtheoycost.setTextColor(Color.BLUE);
			tvtheoycost.setText("" + res1);
			tvlabcst.setTextColor(Color.BLUE);
			tvlabcst.setText("" + res2);
			tvtotal.setTextColor(Color.BLUE);
			tvtotal.setText("" + res3);
			tvwaveb.setTextColor(Color.BLUE);
			tvwaveb.setText("" + res4);
			tvmid.setText("" + res5);
			tvmid.setTextColor(Color.BLUE);
		} else {
			tvwarning.setText("Please Enter All");
			tvwarning.setTextColor(Color.RED);
		}

		/*
		 * } else { tvtheoycost.setTextColor(Color.RED);
		 * tvtheoycost.setText("Give All Input");
		 * 
		 * }
		 */
	}

	public void reload(View v) {
		Intent intent = new Intent(this, Credit.class);
		startActivity(intent);
	}

	public void main(View v) {
		Intent intent = new Intent(this, Welcome.class);
		startActivity(intent);
	}
}