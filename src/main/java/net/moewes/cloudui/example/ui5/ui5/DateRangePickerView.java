package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.Ui5DateRangePicker;
import net.moewes.cloudui.ui5.Ui5InputBase;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;

import java.time.LocalDate;

@CloudUiView("/ui5/dateRangePicker")
public class DateRangePickerView extends Ui5DemoBaseView {


    public DateRangePickerView() {
        super("Date Range Picker");
    }

    @PostConstruct
    public void createView() {

        Ui5Panel panel1 = new Ui5Panel("Basic DateRangePicker", true);
        add(panel1);
        Ui5DateRangePicker picker1 = new Ui5DateRangePicker();
        panel1.add(picker1);

        Ui5Panel panel2 = new Ui5Panel("DateRangePicker with Minimum and Maximum Date - 1/1/2020 - 4/5/2020 format-pattern=\"dd/MM/yyyy\"", true);
        add(panel2);

        Ui5DateRangePicker picker2 = new Ui5DateRangePicker();
        panel2.add(picker2);
        picker2.setFormatPattern("dd/MM/YYYY");
        picker2.setMinDate(LocalDate.of(2020, 12, 1));
        picker2.setMaxDate(LocalDate.of(2021, 1, 31));
        picker2.addEventListener("change", event -> {
            event.getParameter("value").ifPresent(item -> {
                panel2.add(new Ui5Label("Your input: " + item));
                picker2.setValue((String) item);
            });
        });

        Ui5Panel panel3 = new Ui5Panel("DateRangePicker with format-pattern='long'", true);
        add(panel3);

        Ui5DateRangePicker picker3 = new Ui5DateRangePicker();
        panel3.add(picker3);

        Ui5Panel statePanel = new Ui5Panel("Date Range Picker in states", true);
        add(statePanel);

        //VerticalLayout layout = new VerticalLayout();
        Div layout = new Div(); // FIXME
        layout.getElement().setAttribute("theme", "spacing");

        Ui5DateRangePicker errorPicker = new Ui5DateRangePicker();
        errorPicker.addValueStateMessage("error", Ui5InputBase.ValueState.ERROR);
        Ui5DateRangePicker warningPicker = new Ui5DateRangePicker();
        warningPicker.addValueStateMessage("warning", Ui5InputBase.ValueState.WARNING);
        Ui5DateRangePicker informationPicker = new Ui5DateRangePicker();
        informationPicker.addValueStateMessage("information", Ui5InputBase.ValueState.INFORMATION);
        Ui5DateRangePicker sucessPicker = new Ui5DateRangePicker();
        sucessPicker.setValueState(Ui5InputBase.ValueState.SUCCESS);
        Ui5DateRangePicker readonlyPicker = new Ui5DateRangePicker();
        readonlyPicker.setReadOnly(true);
        readonlyPicker.setValue("2021-01-19"); // TODO
        Ui5DateRangePicker disabledPicker = new Ui5DateRangePicker();
        disabledPicker.setDisabled(true);
        disabledPicker.setValue("2021-01-19"); // TODO

        layout.add(errorPicker, warningPicker, informationPicker, sucessPicker, readonlyPicker, disabledPicker);
        statePanel.add(layout);

        // TODO Event Change
        // TODO Value
        // TODO common BaseClass with DatePicker? also Calendar?

    }
}
