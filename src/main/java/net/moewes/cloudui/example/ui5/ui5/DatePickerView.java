package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.Ui5DatePicker;
import net.moewes.cloudui.ui5.Ui5InputBase;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;


import java.time.LocalDate;

@CloudUiView("/ui5/datePicker")
public class DatePickerView extends Ui5DemoBaseView {


    public DatePickerView() {
        super("Date Picker");
    }

    @PostConstruct
    public void createView() {

        Ui5Panel panel1 = new Ui5Panel("Basic DatePicker", true);
        add(panel1);
        Ui5DatePicker datePicker = new Ui5DatePicker();
        panel1.add(datePicker);
        datePicker.setValue(LocalDate.now());

        Ui5Panel panel2 = new Ui5Panel("DatePicker with Placeholder, Events, ValueState", true);
        add(panel2);
        Ui5DatePicker picker2 = new Ui5DatePicker();
        panel2.add(picker2);
        picker2.setPlaceholder("Delivery Date...");
        picker2.addEventListener("change", event -> {
            event.getParameter("value").ifPresent(value -> picker2.setValue((String) value)); // TODO
            Ui5Label label = new Ui5Label("Value: " + picker2.getValue());
            panel2.add(label);
            picker2.addValueStateMessage("Information...", Ui5InputBase.ValueState.INFORMATION);
        });

        Ui5Panel statePanel = new Ui5Panel("Date Picker in states", true);
        add(statePanel);

        //VerticalLayout layout = new VerticalLayout();
        Div layout = new Div(); // FIXME
        layout.getElement().setAttribute("theme", "spacing");

        Ui5DatePicker errorPicker = new Ui5DatePicker();
        errorPicker.addValueStateMessage("error", Ui5InputBase.ValueState.ERROR);
        Ui5DatePicker warningPicker = new Ui5DatePicker();
        warningPicker.addValueStateMessage("warning", Ui5InputBase.ValueState.WARNING);
        Ui5DatePicker informationPicker = new Ui5DatePicker();
        informationPicker.addValueStateMessage("information", Ui5InputBase.ValueState.INFORMATION);
        Ui5DatePicker sucessPicker = new Ui5DatePicker();
        sucessPicker.setValueState(Ui5InputBase.ValueState.SUCCESS);
        Ui5DatePicker readonlyPicker = new Ui5DatePicker();
        readonlyPicker.setReadOnly(true);
        readonlyPicker.setValue("2021-01-19");
        Ui5DatePicker disabledPicker = new Ui5DatePicker();
        disabledPicker.setDisabled(true);
        disabledPicker.setFormatPattern("QQQ yyyy, MMM dd");
        disabledPicker.setValue(LocalDate.now());

        layout.add(errorPicker, warningPicker, informationPicker, sucessPicker, readonlyPicker, disabledPicker);
        statePanel.add(layout);
    }
}
