package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.Ui5InputBase;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;
import net.moewes.cloudui.ui5.Ui5TimePicker;


import java.time.LocalTime;

@CloudUiView("/ui5/timePicker")
public class TimePickerView extends Ui5DemoBaseView {


    public TimePickerView() {
        super("Time Picker");
    }

    @PostConstruct
    public void createView() {

        Ui5Panel panel1 = new Ui5Panel("Basic Time Picker", true);
        add(panel1);
        Ui5TimePicker timePicker = new Ui5TimePicker();
        panel1.add(timePicker);
        timePicker.addEventListener("change", event -> {
            event.getParameter("value").ifPresent(item -> {
                LocalTime time = LocalTime.parse((String) item, timePicker.getFormatter());
                timePicker.setValue(time);
                panel1.add(new Ui5Label("Your input: " + timePicker.getValue()));
            });
        });

        Ui5Panel panel2 = new Ui5Panel("TimePicker in twelve hours format", true);
        add(panel2);

        Ui5TimePicker picker2 = new Ui5TimePicker();
        panel2.add(picker2);
        picker2.setFormatPattern("hh:mm:ss a");
        picker2.setValue(LocalTime.now());

        Ui5Panel panel3 = new Ui5Panel("TimePicker with only hours and minutes", true);
        add(panel3);

        Ui5TimePicker picker3 = new Ui5TimePicker();
        panel3.add(picker3);
        picker3.setFormatPattern("HH:mm");
        picker3.setValue(LocalTime.now());

        Ui5Panel panel4 = new Ui5Panel("TimePicker with value-state and valueStateMessage", true);
        add(panel4);

        Ui5TimePicker picker4 = new Ui5TimePicker();
        picker4.addValueStateMessage("Please provide valid value", Ui5InputBase.ValueState.ERROR);
        panel4.add(picker4);

        Ui5Panel statePanel = new Ui5Panel("Time Picker in states", true);
        add(statePanel);

        //VerticalLayout layout = new VerticalLayout();
        Div layout = new Div();
        layout.getElement().setAttribute("theme", "spacing");

        Ui5TimePicker errorPicker = new Ui5TimePicker();
        errorPicker.addValueStateMessage("error", Ui5InputBase.ValueState.ERROR);
        Ui5TimePicker warningPicker = new Ui5TimePicker();
        warningPicker.addValueStateMessage("warning", Ui5InputBase.ValueState.WARNING);
        Ui5TimePicker informationPicker = new Ui5TimePicker();
        informationPicker.addValueStateMessage("information", Ui5InputBase.ValueState.INFORMATION);
        Ui5TimePicker sucessPicker = new Ui5TimePicker();
        sucessPicker.setValueState(Ui5InputBase.ValueState.SUCCESS);
        Ui5TimePicker readonlyPicker = new Ui5TimePicker();
        readonlyPicker.setReadOnly(true);
        readonlyPicker.setValue("08:23:59");
        Ui5TimePicker disabledPicker = new Ui5TimePicker();
        disabledPicker.setDisabled(true);
        disabledPicker.setValue("08:23:59");

        layout.add(errorPicker, warningPicker, informationPicker, sucessPicker, readonlyPicker, disabledPicker);
        statePanel.add(layout);

        // TODO Change Event
        // TODO Value in LocalTime Variable
    }
}
