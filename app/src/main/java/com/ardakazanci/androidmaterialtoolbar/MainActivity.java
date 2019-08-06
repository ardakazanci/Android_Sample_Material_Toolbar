/*
 *  * Created by Arda Kazancı on 06.08.2019 22:44
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 06.08.2019 22:41
 *
 */

package com.ardakazanci.androidmaterialtoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private Toolbar toolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setTitle("Material Action Bar");


	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		int menuId = item.getItemId();

		if (menuId == R.id.action_search) {
			Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show();
			return true;
		}

		if (menuId == R.id.action_settings) {
			Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show();
			return true;
		}
		return super.onOptionsItemSelected(item);


	}
}
