package com.hicharts.demo.widget;

import android.app.Activity;
import android.os.Bundle;

import com.hicharts.demo.R;
import com.hicharts.widget.PieChart;
import com.hicharts.widget.PieChartAdapter;

public class PieChart1 extends Activity {
	private PieChart mPieChart;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.piechart1);

		mPieChart = (PieChart) findViewById(R.id.pieChartView1);

		initChart();
	}

	private void initChart() {
		PieChartAdapter adapter = new PieChartAdapter(this, new float[] { 12,
				32, 34, 24, 23 }, null, R.layout.piechart_pie1);
		mPieChart.setAdapter(adapter);
	}
}
