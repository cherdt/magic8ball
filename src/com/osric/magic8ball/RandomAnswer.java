package com.osric.magic8ball;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import android.os.Bundle;

public class RandomAnswer extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.answer);
		TextView textView = (TextView) findViewById(R.id.answer);
		String[] array = getResources().getStringArray(R.array.answers);
		String randomAnswer= array[new Random().nextInt(array.length)];
		textView.setText(randomAnswer);
    }
}