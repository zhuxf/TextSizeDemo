package com.lance.textsizedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initActivity();
	}
	private void initActivity(){
		OnClickListener listener=new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent jumpIntent=new Intent(MainActivity.this,ShowTextSizeActivity.class);
				switch (v.getId()) {
				case R.id.btn_main_large:
					jumpIntent.putExtra("textsize", 3);
					startActivity(jumpIntent);
					break;
				case R.id.btn_main_medium:
					jumpIntent.putExtra("textsize", 2);
					startActivity(jumpIntent);
					break;
				case R.id.btn_main_small:
					jumpIntent.putExtra("textsize", 1);
					startActivity(jumpIntent);
					break;

				default:
					
					break;
				}
			}
		};
		findViewById(R.id.btn_main_large).setOnClickListener(listener);
		findViewById(R.id.btn_main_medium).setOnClickListener(listener);
		findViewById(R.id.btn_main_small).setOnClickListener(listener);
	}
}
