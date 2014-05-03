package com.opensense.dev;

import android.os.Bundle;

import com.htc.preference.HtcPreferenceActivity;
import com.htc.widget.ActionBarContainer;
import com.htc.widget.ActionBarExt;
import com.htc.widget.ActionBarText;


public class MainActivity extends HtcPreferenceActivity  {
	private ActionBarExt actionBarExt=null;
	private ActionBarText actionBarText=null;    
	private ActionBarContainer actionBarContainer=null;
	
	private void SetupActionBar() {
        actionBarExt=new ActionBarExt(this,getActionBar());
        actionBarContainer=actionBarExt.getCustomContainer();
        actionBarText=new ActionBarText(this);    		        
	    actionBarText.setPrimaryText("OpenSense Dev");   
	    actionBarContainer.addCenterView(actionBarText);
    } 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			addPreferencesFromResource(R.xml.prefs);
		SetupActionBar();
	}
}
