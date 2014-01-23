package com.example.bybego;


import com.keyes.youtube.OpenYouTubePlayerActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.ImageButton;
import android.widget.TabHost;

public class MenuPrincipal extends Activity {

	//private Button bLinkedin;
	//peeetaaaaarrrrrdddddiiiiiiiiiiiiiii
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_principal);
		Resources res = getResources();
		 
		TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
		tabs.setup();
		 
		TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
		spec.setContent(R.id.tab1);
		String uri = "drawable/manuales3";

	    
	    int imageResource = getResources().getIdentifier(uri, null, getPackageName());
	   
		spec.setIndicator("",
				res.getDrawable(imageResource));
		tabs.addTab(spec);
		
		spec=tabs.newTabSpec("mitab2");
		spec.setContent(R.id.tab2);
		String uri2 = "drawable/entra_ahora";

	    
	    int imageResource2 = getResources().getIdentifier(uri2, null, getPackageName());
		spec.setIndicator("",
		    res.getDrawable(imageResource2));
		tabs.addTab(spec);
	
	
		tabs.setCurrentTab(0);
		
		//click del LINKEDIN
		ImageButton bLinkedin=(ImageButton)findViewById(R.id.ImageButton06);
		bLinkedin.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					lanzarlinkedin(null);
				}
				
				});
		
		//FIN LINKEDIN//
	}

	
	private void lanzarlinkedin(View view) {
//		Intent intent = new Intent(Intent.ACTION_VIEW);
		String videoId = "M2IpET_ydUg";
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("ytv:"+videoId),MenuPrincipal.this, OpenYouTubePlayerActivity.class);
		//intent.setData(Uri.parse("http://www.proyectoempleo20.es/documentos/TutorialLinkedIn.pdf"));
		//intent.setData(Uri.parse("http://youtu.be/JhFJCmPvJcE"));
		
		startActivity(intent);
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_principal, menu);
		return true;
	}

}
