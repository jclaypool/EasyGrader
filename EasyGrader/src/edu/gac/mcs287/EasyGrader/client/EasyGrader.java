package edu.gac.mcs287.EasyGrader.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class EasyGrader implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	
	private final EasyGraderView view = new EasyGraderView();
	
	
	public void onModuleLoad() {
		view.setControl(this);

		view.viewWelcomePage();
	}

	
}
