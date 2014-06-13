package com.hicharts.demo.chart;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.hicharts.demo.R;
import com.hicharts.widget.Legend;
import com.hicharts.widget.LegendAdapter;
import com.hicharts.widget.PieChart;
import com.hicharts.widget.PieChartAdapter;

public class PieChart1 extends Activity {
	private PieChart	mPieChart;
	private Legend		mLegend;

	private String[]	mLabels	= { "Google", "IBM", "Microsoft", "Apple", "Facebook", "Oracle",
			"Apache"			};
	private float[]		mValues	= { 10, 20, 23, 14, 35, 44, 8 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chart_piechart1);

		mPieChart = (PieChart) findViewById(R.id.pieChart1);
		mLegend = (Legend) findViewById(R.id.legend1);
		
		mPieChart.setAdapter(new PieChartAdapter(this, mValues, null, View.NO_ID));
		mLegend.setAdapter(new LegendAdapter(this, mLabels));
	}
}
