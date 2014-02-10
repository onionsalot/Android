package com.example.project1;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        final EditText et = (EditText) findViewById(R.id.input_text);
	        final TextView tv = (TextView) findViewById(R.id.output_text);
	        final Button button = (Button) findViewById(R.id.button1);
	        button.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
	                String text1 = et.getText().toString();
	                tv.setText(text1);

					
				}
			});
	    }
	    

	}

