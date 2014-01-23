package com.pma.mpsr;

import java.text.NumberFormat;
import java.text.ParseException;

import com.pma.vaadin.converter.StringToBigDecimalConverter;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;

@SuppressWarnings("serial")
public class Form_8_1_0 extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private TextArea textArea_2;
	@AutoGenerated
	private Label total;
	@AutoGenerated
	private TextField openCommit;
	@AutoGenerated
	private TextField receiptToDate;
	@AutoGenerated
	private TextArea textArea_1;
	@AutoGenerated
	private Label label_Total;
	@AutoGenerated
	private Label label_OpenCommit;
	@AutoGenerated
	private Label label_ReceiptToDate;
	@AutoGenerated
	private Label labelPrototype;
	FieldGroup fieldGroup = new FieldGroup();
	NumberFormat numberFormatter = NumberFormat.getNumberInstance();

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public Form_8_1_0() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		initFields();
		initListeners();
	}

	private void initFields() {

		// mainLayout.addStyleName("form-8-1");
		textArea_1.setCaption(MPSRUI.TREE_8_1);
		
		labelPrototype.setValue("Prototype");

		StringToBigDecimalConverter numberConverter = new StringToBigDecimalConverter();

		TextArea[] textAreas = { textArea_1, textArea_2 };
		String[] textAreaPropertyIds = { "DESC_8_1_A", "DESC_8_1_B" };
		for (int i = 0; i < textAreas.length; i++) {
			textAreas[i].setNullRepresentation("");
			fieldGroup.bind(textAreas[i], textAreaPropertyIds[i]);
		}

		TextField[] textFields = { receiptToDate, openCommit };
		String[] textFieldPropertyIds = { "RECEIPT_TO_DATE", "OPEN_COMMIT" };
		for (int i = 0; i < textFields.length; i++) {
			textFields[i].setNullRepresentation("");
			textFields[i].setConverter(numberConverter);
			fieldGroup.bind(textFields[i], textFieldPropertyIds[i]);
		}

		fieldGroup.setBuffered(false);
	}

	private void initListeners() {

		final TextField[] textFields = { receiptToDate, openCommit };

		receiptToDate.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				setTotal(textFields, total);
			}
		});

		openCommit.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				setTotal(textFields, total);
			}
		});
	}

	private void setTotal(TextField[] fields, Label totalLabel) {
		double total = 0;
		for (int i = 0; i < fields.length; i++) {
			String value = fields[i].getValue();
			if (null != value && !"".equals(value)) {
				try {
					total += numberFormatter.parse(value).doubleValue();
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		totalLabel.setValue(numberFormatter.format(total));
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("640px");
		mainLayout.setHeight("460px");
		
		// top-level component properties
		setWidth("640px");
		setHeight("460px");
		
		// labelPrototype
		labelPrototype = new Label();
		labelPrototype.setStyleName("prototype2");
		labelPrototype.setImmediate(false);
		labelPrototype.setWidth("-1px");
		labelPrototype.setHeight("-1px");
		labelPrototype.setValue("Label");
		mainLayout.addComponent(labelPrototype, "top:0.0px;right:0.0px;");
		
		// label_ReceiptToDate
		label_ReceiptToDate = new Label();
		label_ReceiptToDate.setImmediate(false);
		label_ReceiptToDate.setWidth("-1px");
		label_ReceiptToDate.setHeight("-1px");
		label_ReceiptToDate.setValue("Receipted to Date");
		mainLayout.addComponent(label_ReceiptToDate, "top:120.0px;left:20.0px;");
		
		// label_OpenCommit
		label_OpenCommit = new Label();
		label_OpenCommit.setImmediate(false);
		label_OpenCommit.setWidth("140px");
		label_OpenCommit.setHeight("-1px");
		label_OpenCommit.setValue("Open Commitments");
		mainLayout.addComponent(label_OpenCommit, "top:160.0px;left:20.0px;");
		
		// label_Total
		label_Total = new Label();
		label_Total.setImmediate(false);
		label_Total.setWidth("60px");
		label_Total.setHeight("-1px");
		label_Total.setValue("Total");
		mainLayout.addComponent(label_Total, "top:200.0px;left:20.0px;");
		
		// textArea_1
		textArea_1 = new TextArea();
		textArea_1.setImmediate(false);
		textArea_1.setWidth("600px");
		textArea_1.setHeight("80px");
		mainLayout.addComponent(textArea_1, "top:20.0px;left:20.0px;");
		
		// receiptToDate
		receiptToDate = new TextField();
		receiptToDate.setImmediate(true);
		receiptToDate.setWidth("140px");
		receiptToDate.setHeight("-1px");
		mainLayout.addComponent(receiptToDate, "top:120.0px;left:180.0px;");
		
		// openCommit
		openCommit = new TextField();
		openCommit.setImmediate(true);
		openCommit.setWidth("140px");
		openCommit.setHeight("-1px");
		mainLayout.addComponent(openCommit, "top:160.0px;left:180.0px;");
		
		// total
		total = new Label();
		total.setImmediate(false);
		total.setWidth("140px");
		total.setHeight("-1px");
		total.setValue("0");
		mainLayout.addComponent(total, "top:200.0px;left:180.0px;");
		
		// textArea_2
		textArea_2 = new TextArea();
		textArea_2.setImmediate(false);
		textArea_2.setWidth("600px");
		textArea_2.setHeight("200px");
		mainLayout.addComponent(textArea_2, "top:240.0px;left:20.0px;");
		
		return mainLayout;
	}

}