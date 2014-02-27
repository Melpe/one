package com.example.one;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        TextView text = (TextView)findViewById(R.id.text);
        text.setText("Cliquer sur le bouton ...");
        Button bou = (Button)findViewById(R.id.button1);
        bou.setTextSize(8);
        bou.setOnTouchListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onTouch(View vue, MotionEvent event){
    	
    	Button b1 = (Button)vue;
    	b1.setWidth((int)event.getX());
    	b1.setHeight((int)event.getY());
    	
    	b1.setText("Votre position sur le bouton : X = " + event.getX() + "et Y= "+event.getY());
    	
    	
    	return true;
    }

}
