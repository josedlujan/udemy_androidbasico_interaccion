package com.mi.primera.app.josedlujan.curso;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{
	EditText editText;
	Button boton;
	TextView textView;
	String texto;
	
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textView = (TextView) findViewById(R.id.textview);
		editText = (EditText) findViewById(R.id.edittext);
		boton = (Button) findViewById(R.id.boton);
		
		boton.setOnClickListener(this);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.boton:
			     texto = editText.getText().toString();
			     textView.setText(texto);
			     break;

		default:
			
			break;
		}
	}

}
