package com.example.one;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.one.EventBoutonTouch;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        setContentView(R.layout.activity_main);
        
        TextView text = (TextView)findViewById(R.id.text);
        text.setText("Cliquer sur le bouton ...");
        Button bou = (Button)findViewById(R.id.button1);
        bou.setTextSize(8);
        bou.setOnTouchListener(new EventBoutonTouch());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


}
