package com.lance.textsizedemo;

import android.app.Activity;
import android.os.Bundle;

public class ShowTextSizeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		int mode=-1;
		try{
			mode=getIntent().getIntExtra("textsize", 1);
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch (Exception e) {
			
		}
		if(mode==-1||mode==1){
			this.setTheme(R.style.Theme_Small);
		}else if(mode==2){
			this.setTheme(R.style.Theme_Medium);
		}else {
			this.setTheme(R.style.Theme_Large);
		}
		setContentView(R.layout.activity_showtext);
	}

}
