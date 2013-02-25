package com.thegreatfoodapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainPage extends Activity {

	public final static String EXTRA_MESSAGE = "com.thegreatfoodapp.MESSAGE";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_page);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_page, menu);
		return true;
	}
	
	/** Called when the user clicks the Send button */
	public void searchAmount(View view) {
		Intent intent = new Intent(this, AndroidXMLParsingActivity.class);
		EditText editText = (EditText) findViewById(R.id.search_money);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}

}
