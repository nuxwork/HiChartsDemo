package com.hicharts.demo.chart;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.hicharts.demo.R;
import com.hicharts.widget.Legend;
import com.hicharts.widget.LegendAdapter;
import com.hicharts.widget.PieChart;
import com.hicharts.widget.PieChartAdapter;

public class PieChart3D1 extends Activity {
	private PieChart	mPieChart;
	private Legend		mLegend;

	private String[]	mLabels	= { "Google", "IBM", "Microsoft", "Apple", "Facebook" };
	private float[]		mValues	= { 10, 20, 23, 14, 35 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chart_piechart3d1);

		mPieChart = (PieChart) findViewById(R.id.pieChart1);
		mLegend = (Legend) findViewById(R.id.legend1);

		PieChartAdapter adapter = new PieChartAdapter(this, mValues, null, View.NO_ID);
		adapter.set3D(true);
		mPieChart.setAdapter(adapter);
		mLegend.setAdapter(new LegendAdapter(this, mLabels));
	}
}
