package com.example.one;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class EventBoutonTouch extends Activity implements View.OnTouchListener {

	@Override
	public boolean onTouch (View IN_vw_vue, MotionEvent IN_me_event){
		RelativeLayout Var_rl_Layout;
		
		Button Var_bt_Bouton = (Button)IN_vw_vue; 
		Var_bt_Bouton.setWidth((int)IN_me_event.getX());
		Var_bt_Bouton.setHeight((int)IN_me_event.getY());
    	
		if (R.id.button1 == Var_bt_Bouton.getId()) {
			Var_bt_Bouton.setText("Votre position sur le bouton : X = " + IN_me_event.getX() + "et Y= "+IN_me_event.getY());
			//Var_rl_Layout = (RelativeLayout)RelativeLayout.inflate(this, R.layout.activity_main , null);
			
			//TextView Var_Text = (TextView)Var_rl_Layout.findViewById(R.id.text);
			//Var_Text.setText("Merci d'avoir appuyer");
			//setContentView(Var_rl_Layout);
		}
		
		
		
		return true;
	}
}
