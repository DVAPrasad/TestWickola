package com.sample.web.page;



import org.apache.wicket.PageParameters;

import com.uprr.ui.wicket.components.feedback.FeedbackPanel;
import com.uprr.ui.wicket.components.page.WebPage;

public class BasePage extends WebPage {
	private FeedbackPanel feedbackPanel; 
	public BasePage() {
		super();
		feedbackPanel = new FeedbackPanel("feedback");
		add(feedbackPanel);
	}
	
	public BasePage(PageParameters parameters) {
		super(parameters);
		feedbackPanel = new FeedbackPanel("feedback");
		add(feedbackPanel);
	}
	
	public FeedbackPanel getFeedbackPanel() {
		return feedbackPanel;
	}
	
	public void setFeedbackPanel(FeedbackPanel feedbackPanel) {
		this.feedbackPanel = feedbackPanel;
	}
}
