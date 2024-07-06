package net.moewes.cloudui.example.ui5;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.example.ui5.ui5.Ui5DemoBaseView;
import net.moewes.cloudui.ui5.Ui5Link;
import net.moewes.cloudui.ui5.form.Ui5Form;

@CloudUiView("/ui5Elements")
public class Ui5View extends Ui5DemoBaseView {

    public Ui5View() {
        super("Ui5 Elements");

        Ui5Form form = new Ui5Form();
        // getElement().setAttribute("style", "padding: var(--_ui5_card_content_padding); display:
        // flex; flex-direction: column; gap: 0.1em");

        //add(new Ui5Title("Ui5 Elements"));
        add(form);

        form.add(new Ui5Link("Avatar", "/ui5/avatar"));
        form.add(new Ui5Link("Avatar Group", "/ui5/avatarGroup"));
        form.add(new Ui5Link("Badge", "/ui5/badge"));
        form.add(new Ui5Link("Bar", "/ui5/bar"));
        form.add(new Ui5Link("Button", "/ui5/button"));
        form.add(new Ui5Link("Breadcrumbs", "/ui5/breadcrumbs"));
        form.add(new Ui5Link("Calendar", "/ui5/calendar"));
        form.add(new Ui5Link("Card", "/ui5/card"));
        form.add(new Ui5Link("Carousel", "/ui5/carousel"));
        form.add(new Ui5Link("Check Box", "/ui5/checkbox"));
        form.add(new Ui5Link("Combo Box", "/ui5/combobox"));
        form.add(new Ui5Link("Date Picker", "/ui5/datePicker"));
        form.add(new Ui5Link("Date Range Picker", "/ui5/dateRangePicker"));
        form.add(new Ui5Link("Date Time Picker", "/ui5/dateTimePicker"));
        form.add(new Ui5Link("Duration Picker", "/ui5/durationPicker"));
        form.add(new Ui5Link("Icon", "/ui5/icon"));
        form.add(new Ui5Link("Input", "/ui5/input"));
        form.add(new Ui5Link("Label", "/ui5/label"));
        form.add(new Ui5Link("List", "/ui5/list"));
        form.add(new Ui5Link("Link", "/ui5/link"));
        form.add(new Ui5Link("Panel", "/ui5/panel"));
        form.add(new Ui5Link("Tab Container", "/ui5/tabContainer"));
        form.add(new Ui5Link("Table", "/ui5/table"));
        form.add(new Ui5Link("Text Area", "/ui5/textarea"));
        form.add(new Ui5Link("Timeline", "/ui5/timeline"));
        form.add(new Ui5Link("Time Picker", "/ui5/timePicker"));
        form.add(new Ui5Link("Title", "/ui5/title"));
        form.add(new Ui5Link("Wizard", "/ui5/wizard"));
    }
}
