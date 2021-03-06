package com.kohmiho.mpsr;

import com.kohmiho.vaadin.converter.StringToBigDecimalConverter;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;

@SuppressWarnings("serial")
public class Form_2_0_0 extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private TextArea textArea_2;
	@AutoGenerated
	private TextField aid2PTD;
	@AutoGenerated
	private TextField aid2YTD;
	@AutoGenerated
	private TextField aid2Current;
	@AutoGenerated
	private TextField missPTD;
	@AutoGenerated
	private TextField missYTD;
	@AutoGenerated
	private TextField missCurrent;
	@AutoGenerated
	private TextField aid1PTD;
	@AutoGenerated
	private TextField aid1YTD;
	@AutoGenerated
	private TextField aid1Current;
	@AutoGenerated
	private TextField oshaPTD;
	@AutoGenerated
	private TextField oshaYTD;
	@AutoGenerated
	private TextField oshaCurrent;
	@AutoGenerated
	private TextField whPTD;
	@AutoGenerated
	private TextField whYTD;
	@AutoGenerated
	private TextField whCurrent;
	@AutoGenerated
	private TextArea textArea_1;
	@AutoGenerated
	private Label label_FirstAid2;
	@AutoGenerated
	private Label label_NearMiss;
	@AutoGenerated
	private Label label_FirstAid1;
	@AutoGenerated
	private Label label_OSHA;
	@AutoGenerated
	private Label label_Incidents;
	@AutoGenerated
	private Label label_TotalWorkHours;
	@AutoGenerated
	private Label labelPrototype;
	FieldGroup fieldGroup = new FieldGroup();

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public Form_2_0_0() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		initFields();
	}

	private void initFields() {

		mainLayout.addStyleName("form-2");
		label_Incidents.addStyleName("banner");
		label_TotalWorkHours.addStyleName("banner");

		textArea_1.setCaption(MPSRUI.TREE_2);

		labelPrototype.setValue("Prototype");

		StringToBigDecimalConverter numberConverter = new StringToBigDecimalConverter();

		TextField[] textFields = { whCurrent, whYTD, whPTD, oshaCurrent, oshaYTD, oshaPTD, aid1Current, aid1YTD, aid1PTD, missCurrent, missYTD, missPTD,
				aid2Current, aid2YTD, aid2PTD };
		String[] propertyIds1 = { "WH_CUR", "WH_YTD", "WH_PTD", "OSHA_CUR", "OSHA_YTD", "OSHA_PTD", "AID_1_CUR", "AID_1_YTD", "AID_1_PTD", "MISS_CUR",
				"MISS_YTD", "MISS_PTD", "AID_2_CUR", "AID_2_YTD", "AID_2_PTD" };
		for (int i = 0; i < textFields.length; i++) {
			fieldGroup.bind(textFields[i], propertyIds1[i]);
			textFields[i].setNullRepresentation("");
			textFields[i].setConverter(numberConverter);
		}

		TextArea[] textAreas = { textArea_1, textArea_2 };
		String[] propertyIds2 = { "DESC1", "NOTE" };
		for (int i = 0; i < textAreas.length; i++) {
			fieldGroup.bind(textAreas[i], propertyIds2[i]);
			textAreas[i].setNullRepresentation("");
		}

		fieldGroup.setBuffered(false);

	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("640px");
		mainLayout.setHeight("400px");

		// top-level component properties
		setWidth("640px");
		setHeight("400px");

		// labelPrototype
		labelPrototype = new Label();
		labelPrototype.setStyleName("prototype2");
		labelPrototype.setImmediate(false);
		labelPrototype.setWidth("-1px");
		labelPrototype.setHeight("-1px");
		labelPrototype.setValue("Label");
		mainLayout.addComponent(labelPrototype, "top:0.0px;right:0.0px;");

		// label_TotalWorkHours
		label_TotalWorkHours = new Label();
		label_TotalWorkHours.setImmediate(false);
		label_TotalWorkHours.setWidth("480px");
		label_TotalWorkHours.setHeight("20px");
		label_TotalWorkHours.setValue("Total Work Hours");
		mainLayout.addComponent(label_TotalWorkHours, "top:140.0px;left:140.0px;");

		// label_Incidents
		label_Incidents = new Label();
		label_Incidents.setImmediate(false);
		label_Incidents.setWidth("480px");
		label_Incidents.setHeight("20px");
		label_Incidents.setValue("Incidents");
		mainLayout.addComponent(label_Incidents, "top:200.0px;right:20.0px;");

		// label_OSHA
		label_OSHA = new Label();
		label_OSHA.setImmediate(false);
		label_OSHA.setWidth("-1px");
		label_OSHA.setHeight("20px");
		label_OSHA.setValue("OSHA Recordable");
		mainLayout.addComponent(label_OSHA, "top:220.0px;left:20.0px;");

		// label_FirstAid1
		label_FirstAid1 = new Label();
		label_FirstAid1.setImmediate(false);
		label_FirstAid1.setWidth("-1px");
		label_FirstAid1.setHeight("20px");
		label_FirstAid1.setValue("First Aid");
		mainLayout.addComponent(label_FirstAid1, "top:240.0px;left:20.0px;");

		// label_NearMiss
		label_NearMiss = new Label();
		label_NearMiss.setImmediate(false);
		label_NearMiss.setWidth("-1px");
		label_NearMiss.setHeight("20px");
		label_NearMiss.setValue("Near Miss");
		mainLayout.addComponent(label_NearMiss, "top:260.0px;left:20.0px;");

		// label_FirstAid2
		label_FirstAid2 = new Label();
		label_FirstAid2.setImmediate(false);
		label_FirstAid2.setWidth("-1px");
		label_FirstAid2.setHeight("20px");
		label_FirstAid2.setValue("First Aid");
		mainLayout.addComponent(label_FirstAid2, "top:280.0px;left:20.0px;");

		// textArea_1
		textArea_1 = new TextArea();
		textArea_1.setImmediate(false);
		textArea_1.setWidth("600px");
		textArea_1.setHeight("100px");
		mainLayout.addComponent(textArea_1, "top:20.0px;left:20.0px;");

		// whCurrent
		whCurrent = new TextField();
		whCurrent.setCaption("Current Period");
		whCurrent.setImmediate(false);
		whCurrent.setWidth("160px");
		whCurrent.setHeight("20px");
		mainLayout.addComponent(whCurrent, "top:180.0px;left:140.0px;");

		// whYTD
		whYTD = new TextField();
		whYTD.setCaption("Calendar YTD");
		whYTD.setImmediate(false);
		whYTD.setWidth("160px");
		whYTD.setHeight("20px");
		mainLayout.addComponent(whYTD, "top:180.0px;left:300.0px;");

		// whPTD
		whPTD = new TextField();
		whPTD.setCaption("Project To Date");
		whPTD.setImmediate(false);
		whPTD.setWidth("160px");
		whPTD.setHeight("20px");
		mainLayout.addComponent(whPTD, "top:180.0px;left:460.0px;");

		// oshaCurrent
		oshaCurrent = new TextField();
		oshaCurrent.setImmediate(false);
		oshaCurrent.setWidth("160px");
		oshaCurrent.setHeight("20px");
		mainLayout.addComponent(oshaCurrent, "top:220.0px;left:140.0px;");

		// oshaYTD
		oshaYTD = new TextField();
		oshaYTD.setImmediate(false);
		oshaYTD.setWidth("160px");
		oshaYTD.setHeight("20px");
		mainLayout.addComponent(oshaYTD, "top:220.0px;left:300.0px;");

		// oshaPTD
		oshaPTD = new TextField();
		oshaPTD.setImmediate(false);
		oshaPTD.setWidth("160px");
		oshaPTD.setHeight("20px");
		mainLayout.addComponent(oshaPTD, "top:220.0px;left:460.0px;");

		// aid1Current
		aid1Current = new TextField();
		aid1Current.setImmediate(false);
		aid1Current.setWidth("160px");
		aid1Current.setHeight("20px");
		mainLayout.addComponent(aid1Current, "top:240.0px;left:140.0px;");

		// aid1YTD
		aid1YTD = new TextField();
		aid1YTD.setImmediate(false);
		aid1YTD.setWidth("160px");
		aid1YTD.setHeight("20px");
		mainLayout.addComponent(aid1YTD, "top:240.0px;left:300.0px;");

		// aid1PTD
		aid1PTD = new TextField();
		aid1PTD.setImmediate(false);
		aid1PTD.setWidth("160px");
		aid1PTD.setHeight("20px");
		mainLayout.addComponent(aid1PTD, "top:240.0px;left:460.0px;");

		// missCurrent
		missCurrent = new TextField();
		missCurrent.setImmediate(false);
		missCurrent.setWidth("160px");
		missCurrent.setHeight("20px");
		mainLayout.addComponent(missCurrent, "top:260.0px;left:140.0px;");

		// missYTD
		missYTD = new TextField();
		missYTD.setImmediate(false);
		missYTD.setWidth("160px");
		missYTD.setHeight("20px");
		mainLayout.addComponent(missYTD, "top:260.0px;left:300.0px;");

		// missPTD
		missPTD = new TextField();
		missPTD.setImmediate(false);
		missPTD.setWidth("160px");
		missPTD.setHeight("20px");
		mainLayout.addComponent(missPTD, "top:260.0px;left:460.0px;");

		// aid2Current
		aid2Current = new TextField();
		aid2Current.setImmediate(false);
		aid2Current.setWidth("160px");
		aid2Current.setHeight("20px");
		mainLayout.addComponent(aid2Current, "top:280.0px;left:140.0px;");

		// aid2YTD
		aid2YTD = new TextField();
		aid2YTD.setImmediate(false);
		aid2YTD.setWidth("160px");
		aid2YTD.setHeight("20px");
		mainLayout.addComponent(aid2YTD, "top:280.0px;left:300.0px;");

		// aid2PTD
		aid2PTD = new TextField();
		aid2PTD.setImmediate(false);
		aid2PTD.setWidth("160px");
		aid2PTD.setHeight("20px");
		mainLayout.addComponent(aid2PTD, "top:280.0px;left:460.0px;");

		// textArea_2
		textArea_2 = new TextArea();
		textArea_2.setCaption("Note");
		textArea_2.setImmediate(false);
		textArea_2.setWidth("600px");
		textArea_2.setHeight("60px");
		mainLayout.addComponent(textArea_2, "top:320.0px;left:20.0px;");

		return mainLayout;
	}

}
