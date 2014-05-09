package com.opensense.dev;

import android.content.*;
import android.os.*;
import com.htc.preference.*;
import com.htc.widget.*;
import com.htc.configuration.*;


public class MainActivity extends HtcPreferenceActivity  {
	private ActionBarExt actionBarExt=null;
	private ActionBarText actionBarText=null;    
	private ActionBarContainer actionBarContainer=null;
	
	public static int getHtcThemeID(Context context, int i)
    {
		return HtcWrapConfiguration.getHtcThemeId(context, i);

    }
	
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
		Context context = this;
		setTheme(getHtcThemeID(context, 3));
	    addPreferencesFromResource(R.xml.prefs);
		SetupActionBar();
		
	}
}
