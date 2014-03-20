package com.example.triangledemaxwell;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity implements OnTouchListener{
	//Groupe de bouton radio
	RadioGroup Var_rg_Group;
	//Bouton radio qui servent a indiquer quelle couleur 
	//ne sera pas affecter par le changement de valeur 
	//d une autre.
	RadioButton Var_rb_Red;
	RadioButton Var_rb_Blue;
	RadioButton Var_rb_Green;
	//Pourcentage de la couleur
	float Var_ft_PourRed = 33;
	float Var_ft_PourGreen = 34;
	float Var_ft_PourBlue = 33;
	//Text indiquant le pourcentage de la couleur
	TextView Var_tv_PourRed;
	TextView Var_tv_PourGreen;
	TextView Var_tv_PourBlue;
	
	//fond de couleur
	SurfaceView Var_sv_Fond;

	//boutton pour augmenter le pourcentage de la couleur
	Button Var_bt_Rplus;
	Button Var_bt_Bplus;
	Button Var_bt_Gplus;
	//boutton pour diminuer le pourcentage de la couleur
	Button Var_bt_Rmoins;
	Button Var_bt_Bmoins;
	Button Var_bt_Gmoins;
	
	double Cst_fl_Echelon = 0.5;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {

    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        //affectation des vues
        Var_sv_Fond = (SurfaceView)findViewById(R.id.Fond);
        
        Var_tv_PourRed= (TextView)findViewById(R.id.PourRed);
        Var_tv_PourBlue= (TextView)findViewById(R.id.PourBlue);
        Var_tv_PourGreen= (TextView)findViewById(R.id.PourGreen);
        
        Var_rg_Group = (RadioGroup)findViewById(R.id.radioGroup1);
        Var_rb_Red = (RadioButton)findViewById(R.id.radioRed);
        Var_rb_Green = (RadioButton)findViewById(R.id.radioGreen);
        Var_rb_Blue = (RadioButton)findViewById(R.id.radioBlue);
        
        Var_bt_Rplus = (Button)findViewById(R.id.PlusRed);
        Var_bt_Bplus = (Button)findViewById(R.id.PlusBlue);
        Var_bt_Gplus = (Button)findViewById(R.id.PlusGreen);
        Var_bt_Rmoins = (Button)findViewById(R.id.MoinsRed);
        Var_bt_Bmoins = (Button)findViewById(R.id.MoinsBlue);
        Var_bt_Gmoins = (Button)findViewById(R.id.MoinsGreen);
        
        Var_bt_Rplus.setOnTouchListener(this);
        Var_bt_Bplus.setOnTouchListener(this);
        Var_bt_Gplus.setOnTouchListener(this);
        Var_bt_Rmoins.setOnTouchListener(this);
        Var_bt_Bmoins.setOnTouchListener(this);
        Var_bt_Gmoins.setOnTouchListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public boolean onTouch(View In_vw_Vue, MotionEvent In_me_Event) {
		
		  if(R.id.radioRed == Var_rg_Group.getCheckedRadioButtonId()){
			  switch(In_vw_Vue.getId()) {
		
			    case R.id.PlusGreen:
			    	if(Var_ft_PourGreen<100 && Var_ft_PourBlue>=Cst_fl_Echelon){
			    		Var_ft_PourGreen = (float) (Var_ft_PourGreen + Cst_fl_Echelon);
			    		Var_ft_PourBlue = (float) (Var_ft_PourBlue - Cst_fl_Echelon);
			    	}
			    	
			    break;
			    
			    case R.id.PlusBlue:
			    	if(Var_ft_PourBlue<100 && Var_ft_PourGreen>=Cst_fl_Echelon){
			    		Var_ft_PourBlue = (float) (Var_ft_PourBlue + Cst_fl_Echelon);
			    		Var_ft_PourGreen = (float) (Var_ft_PourGreen - Cst_fl_Echelon);
			    	}
			    	
			    break;
		
			    case R.id.MoinsGreen:
			    	if(Var_ft_PourBlue<100 && Var_ft_PourGreen>=Cst_fl_Echelon){
			    	Var_ft_PourBlue = (float) (Var_ft_PourBlue + Cst_fl_Echelon);
			    	Var_ft_PourGreen = (float) (Var_ft_PourGreen - Cst_fl_Echelon);
			    	}
			    	
			    break;
			    
			    case R.id.MoinsBlue:
			    	if(Var_ft_PourGreen<100 && Var_ft_PourBlue>=Cst_fl_Echelon){
			    	Var_ft_PourGreen = (float) (Var_ft_PourGreen + Cst_fl_Echelon);
			    	Var_ft_PourBlue = (float) (Var_ft_PourBlue - Cst_fl_Echelon);
			    	}
			    	
			    break;
		  }
		  }
			  if(R.id.radioGreen == Var_rg_Group.getCheckedRadioButtonId()){
				  switch(In_vw_Vue.getId()) {

				    case R.id.PlusRed:
				    	if(Var_ft_PourRed<100 && Var_ft_PourBlue>=Cst_fl_Echelon){
				    	Var_ft_PourRed = (float) (Var_ft_PourRed + Cst_fl_Echelon);
				    	Var_ft_PourBlue = (float) (Var_ft_PourBlue - Cst_fl_Echelon);
				    	}
				    
				    break;
				    
				    case R.id.PlusBlue:
				    	if(Var_ft_PourBlue<100 && Var_ft_PourRed>=Cst_fl_Echelon){
				    	Var_ft_PourBlue = (float) (Var_ft_PourBlue + Cst_fl_Echelon);
				    	Var_ft_PourRed = (float) (Var_ft_PourRed - Cst_fl_Echelon);
				    	}
				    	
				    break;
				    
				    case R.id.MoinsRed:
				    	if(Var_ft_PourBlue<100 && Var_ft_PourRed>=Cst_fl_Echelon){
				    	Var_ft_PourBlue = (float) (Var_ft_PourBlue + Cst_fl_Echelon);
				    	Var_ft_PourRed = (float) (Var_ft_PourRed - Cst_fl_Echelon);
				    	}
				    
				    break;
				    
				    case R.id.MoinsBlue:
				    	if(Var_ft_PourRed<100 && Var_ft_PourBlue>=Cst_fl_Echelon){
				    	Var_ft_PourRed = (float) (Var_ft_PourRed + Cst_fl_Echelon);
				    	Var_ft_PourBlue = (float) (Var_ft_PourBlue - Cst_fl_Echelon);
				    	}
				    	
				    break;
			  }
			  }
				  
				  if(R.id.radioBlue == Var_rg_Group.getCheckedRadioButtonId()){
					  switch(In_vw_Vue.getId()) {

					    case R.id.PlusRed:
					    	if(Var_ft_PourRed<100 && Var_ft_PourGreen>=Cst_fl_Echelon){
					    	Var_ft_PourRed = (float) (Var_ft_PourRed + Cst_fl_Echelon);
					    	Var_ft_PourGreen = (float) (Var_ft_PourGreen - Cst_fl_Echelon);
					    	}
					    
					    break;
				
					    case R.id.PlusGreen:
					    	if(Var_ft_PourGreen<100 && Var_ft_PourRed>=Cst_fl_Echelon){
					    	Var_ft_PourGreen = (float) (Var_ft_PourGreen + Cst_fl_Echelon);
					    	Var_ft_PourRed = (float) (Var_ft_PourRed - Cst_fl_Echelon);
					    	}
					    	
					    break;
					    
					    case R.id.MoinsRed:
					    	if(Var_ft_PourGreen<100 && Var_ft_PourRed>=Cst_fl_Echelon){
					    	Var_ft_PourGreen = (float) (Var_ft_PourGreen + Cst_fl_Echelon);
					    	Var_ft_PourRed = (float) (Var_ft_PourRed - Cst_fl_Echelon);
					    	}
					    
					    break;
				
					    case R.id.MoinsGreen:
					    	if(Var_ft_PourRed<100 && Var_ft_PourGreen>=Cst_fl_Echelon){
					    	Var_ft_PourRed = (float) (Var_ft_PourRed + Cst_fl_Echelon);
					    	Var_ft_PourGreen = (float) (Var_ft_PourGreen - Cst_fl_Echelon);
					    	}
					    break;
				  }
				  }
		
		Var_tv_PourRed.setText(Var_ft_PourRed + "%");
		Var_tv_PourGreen.setText(Var_ft_PourGreen + "%");
		Var_tv_PourBlue.setText(Var_ft_PourBlue + "%");
		Var_sv_Fond.setBackgroundColor(Color.rgb((int)((Var_ft_PourRed/100)*255), 
				                                 (int)((Var_ft_PourGreen/100)*255), 
				                                 (int)((Var_ft_PourBlue/100)*255)));
		//Var_sv_Fond.setBackgroundColor(Color.rgb(128, 20, 100));
		return true;
	}
    
}
