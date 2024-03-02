package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.Ui5DateTimePicker;
import net.moewes.cloudui.ui5.Ui5InputBase;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;

import java.time.LocalDateTime;

@CloudUiView("/ui5/dateTimePicker")
public class DateTimePickerView extends Ui5DemoBaseView {


    public DateTimePickerView() {
        super("Date Time Picker");
    }

    @PostConstruct
    public void createView() {

        Ui5Panel panel1 = new Ui5Panel("Basic Date Time Picker", true);
        add(panel1);
        Ui5DateTimePicker dateTimePicker = new Ui5DateTimePicker();
        panel1.add(dateTimePicker);

        Ui5Panel panel2 = new Ui5Panel("Date Time Picker with format-pattern and events", true);
        add(panel2);
        Ui5DateTimePicker picker2 = new Ui5DateTimePicker();
        panel2.add(picker2);
        picker2.addEventListener("change", event -> {
            event.getParameter("value").ifPresent(value -> picker2.setValue((String) value)); // TODO
            Ui5Label label = new Ui5Label("Value: " + picker2.getValue());
            panel2.add(label);
            picker2.addValueStateMessage("Information...", Ui5InputBase.ValueState.INFORMATION);
        });


        Ui5Panel statePanel = new Ui5Panel("Date Time Picker in states", true);
        add(statePanel);

        //VerticalLayout layout = new VerticalLayout();
        Div layout = new Div();
        layout.getElement().setAttribute("theme", "spacing");

        Ui5DateTimePicker errorPicker = new Ui5DateTimePicker();
        errorPicker.addValueStateMessage("error", Ui5InputBase.ValueState.ERROR);
        Ui5DateTimePicker warningPicker = new Ui5DateTimePicker();
        warningPicker.addValueStateMessage("warning", Ui5InputBase.ValueState.WARNING);
        Ui5DateTimePicker informationPicker = new Ui5DateTimePicker();
        informationPicker.addValueStateMessage("information", Ui5InputBase.ValueState.INFORMATION);
        Ui5DateTimePicker sucessPicker = new Ui5DateTimePicker();
        sucessPicker.setValueState(Ui5InputBase.ValueState.SUCCESS);
        Ui5DateTimePicker readonlyPicker = new Ui5DateTimePicker();
        readonlyPicker.setReadOnly(true);
        readonlyPicker.setValue(LocalDateTime.now());
        Ui5DateTimePicker disabledPicker = new Ui5DateTimePicker();
        disabledPicker.setDisabled(true);
        disabledPicker.setValue(LocalDateTime.now());

        layout.add(errorPicker, warningPicker, informationPicker, sucessPicker, readonlyPicker, disabledPicker);
        statePanel.add(layout);
    }
}
