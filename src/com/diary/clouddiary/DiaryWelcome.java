package com.diary.clouddiary;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DiaryWelcome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diary_welcome);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.diary_welcome, menu);
		return true;
	}

}
