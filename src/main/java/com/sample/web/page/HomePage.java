package com.sample.web.page;

import java.util.Arrays;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.CompoundPropertyModel;

import com.uprr.ui.wicket.components.annotation.PageTitle;

@PageTitle("Home Page")
public class HomePage extends BasePage {

	private static final long serialVersionUID = 1L;
	TestEnum string;
	public HomePage() {
		
		Form<HomePage> form = new Form<HomePage>("form", new CompoundPropertyModel<HomePage>(this));
		add(form);
		
		final DropDownChoice<TestEnum> ddc = new DropDownChoice<TestEnum>("string", Arrays.asList(TestEnum.values()),
				new ChoiceRenderer<TestEnum>("value","key"));
		form.add(ddc);
		
		AjaxButton btn = new AjaxButton("btn"){
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
								
			}
		};
		WebMarkupContainer c = new WebMarkupContainer("c");
		form.add(c);
		c.add(btn);
		c.setEnabled(false);
	}

}

enum TestEnum {
	
	VAL1 ("V1","Value 1"),
	VAL2 ("V2","Value 2"),
	VAL3 ("V3","Value 3"),
	VAL4 ("V4","Value 4"),
	VAL5 ("V5","Value 5"),
	VAL6 ("V6","Value 6");
	
	
	String key;
	String value;
		
	TestEnum (String key, String value){
		this.key = key;
		this.value = value;
	}
}

