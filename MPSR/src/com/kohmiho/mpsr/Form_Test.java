package com.kohmiho.mpsr;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.BrowserFrame;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Flash;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class Form_Test extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;

	@AutoGenerated
	private Flash flash;

	@AutoGenerated
	private BrowserFrame browser;

	@AutoGenerated
	private Label labelPrototype;

	@AutoGenerated
	private Label label_1;

	FieldGroup fieldGroup = new FieldGroup();

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public Form_Test() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		initFields();
	}

	private void initFields() {

		label_1.setCaption(MPSRUI.TREE_1_2_3);
		label_1.setValue("");

		labelPrototype.setValue("Prototype");

		// browser.setSource(new
		// ExternalResource("http://pmis-app.pseg.com:8205/ProjectOutreachMap/"));
		browser.setSource(new ThemeResource("d3Map/index.html"));

		flash.setSource(new ThemeResource("xcelsius/pseg_db.swf"));
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("640px");
		mainLayout.setHeight("660px");
		
		// top-level component properties
		setWidth("640px");
		setHeight("660px");
		
		// label_1
		label_1 = new Label();
		label_1.setImmediate(false);
		label_1.setWidth("-1px");
		label_1.setHeight("-1px");
		label_1.setValue("Label");
		mainLayout.addComponent(label_1, "top:20.0px;left:20.0px;");
		
		// labelPrototype
		labelPrototype = new Label();
		labelPrototype.setStyleName("prototype2");
		labelPrototype.setImmediate(false);
		labelPrototype.setWidth("-1px");
		labelPrototype.setHeight("-1px");
		labelPrototype.setValue("Label");
		mainLayout.addComponent(labelPrototype, "top:0.0px;right:0.0px;");
		
		// browser
		browser = new BrowserFrame();
		browser.setImmediate(false);
		browser.setWidth("600px");
		browser.setHeight("300px");
		mainLayout.addComponent(browser, "top:60.0px;left:20.0px;");
		
		// flash
		flash = new Flash();
		flash.setImmediate(false);
		flash.setWidth("600px");
		flash.setHeight("300px");
		mainLayout.addComponent(flash, "top:380.0px;left:20.0px;");
		
		return mainLayout;
	}

}
