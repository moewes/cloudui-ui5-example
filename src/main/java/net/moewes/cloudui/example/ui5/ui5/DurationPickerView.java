package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.Ui5DurationPicker;
import net.moewes.cloudui.ui5.Ui5InputBase;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;

@CloudUiView("/ui5/durationPicker")
public class DurationPickerView extends Ui5DemoBaseView {


    public DurationPickerView() {
        super("Duration Picker");
    }

    @PostConstruct
    public void createView() {

        Ui5Panel panel1 = new Ui5Panel("Basic Duraction Picker", true);
        add(panel1);

        Ui5DurationPicker durationPicker = new Ui5DurationPicker();
        panel1.add(durationPicker);
        durationPicker.setValue("10:30");
        durationPicker.addEventListener("change", event -> {
            event.getParameter("value").ifPresent(value -> durationPicker.setValue((String) value)); // TODO
            Ui5Label label = new Ui5Label("Value: " + durationPicker.getValue());
            panel1.add(label);
            durationPicker.addValueStateMessage("Information...", Ui5InputBase.ValueState.INFORMATION);
        });

        Ui5Panel panel2 = new Ui5Panel("Duration Picker With Steps", true);
        add(panel2);

        Ui5DurationPicker picker2 = new Ui5DurationPicker();
        panel2.add(picker2);
        picker2.setValue("05:10:30");
        picker2.setMinutesStep(10);
        picker2.setSecondsStep(5);

        // Duration Picker With Seconds & Max Value
        Ui5Panel panel4 = new Ui5Panel("Duration Picker With Seconds & Max Value (Bug in UI5)", true);
        add(panel4);

        Ui5DurationPicker picker4 = new Ui5DurationPicker();
        panel4.add(picker4);
        picker4.setValue("05:40:30");
        picker4.setMaxValue("05:30:00");

        // DateTimePicker in states
        Ui5Panel statePanel = new Ui5Panel("Duration Picker in states", true);
        add(statePanel);

        //VerticalLayout layout = new VerticalLayout();
        Div layout = new Div();
        layout.getElement().setAttribute("theme", "spacing");

        Ui5DurationPicker errorPicker = new Ui5DurationPicker();
        errorPicker.addValueStateMessage("error", Ui5InputBase.ValueState.ERROR);
        Ui5DurationPicker warningPicker = new Ui5DurationPicker();
        warningPicker.addValueStateMessage("warning", Ui5InputBase.ValueState.WARNING);
        Ui5DurationPicker informationPicker = new Ui5DurationPicker();
        informationPicker.addValueStateMessage("information", Ui5InputBase.ValueState.INFORMATION);
        Ui5DurationPicker sucessPicker = new Ui5DurationPicker();
        sucessPicker.setValueState(Ui5InputBase.ValueState.SUCCESS);
        Ui5DurationPicker readonlyPicker = new Ui5DurationPicker();
        readonlyPicker.setReadOnly(true);
        readonlyPicker.setValue("02:35:05");
        Ui5DurationPicker disabledPicker = new Ui5DurationPicker();
        disabledPicker.setDisabled(true);
        disabledPicker.setValue("02:35:05");

        layout.add(errorPicker, warningPicker, informationPicker, sucessPicker, readonlyPicker, disabledPicker);
        statePanel.add(layout);
    }
}
