package com.sample.web.page;

import org.apache.wicket.Application;

import com.uprr.ui.wicket.components.application.WebApplication;
import com.uprr.ui.wicket.components.page.WebPage;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see com.sample.web.page.Start#main(String[])
 */

public class WicketApplication extends WebApplication
{
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}
	
	public static WicketApplication get() {
	    return (WicketApplication)Application.get();
	}
	
}
