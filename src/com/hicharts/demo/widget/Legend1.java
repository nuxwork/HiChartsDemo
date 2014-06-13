package com.hicharts.demo.widget;

import android.app.Activity;
import android.os.Bundle;

import com.hicharts.demo.R;
import com.hicharts.widget.Legend;
import com.hicharts.widget.LegendAdapter;

public class Legend1 extends Activity {
	private static final String	TAG	= "HiChartsDemo.Legend1";

	private Legend				mLegend;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.legend1);

		mLegend = (Legend) findViewById(R.id.legend1);
		mLegend.setAdapter(new LegendAdapter(this, new String[] { "Google", "Microsoft", "IBM",
				"Facebook", "Taucin", "Cocoon" }));
	}
}
