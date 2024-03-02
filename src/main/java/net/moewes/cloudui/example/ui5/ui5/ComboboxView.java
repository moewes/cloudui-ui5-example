package net.moewes.cloudui.example.ui5.ui5;

import jakarta.inject.Inject;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.example.ui5.Ui5View;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.ui5.*;

import java.util.ArrayList;
import java.util.List;

@CloudUiView("/ui5/combobox")
public class ComboboxView extends Div {

    @Inject
    public ComboboxView(CloudUi ui) {

        Ui5Bar bar = new Ui5Bar();
        bar.addMiddleContent(new Ui5Label("Combo Box"));
        add(bar);

        Ui5Button home = new Ui5Button();
        home.setIcon("home");
        home.setDesign(Ui5Button.Design.TRANSPARENT);
        home.addEventListener("click", event -> {
            ui.navigate(Ui5View.class);
        });
        bar.addStartContent(home);

        Ui5Panel panel = new Ui5Panel("Basic Combo Box", true);
        add(panel);

        List<String> myItems = new ArrayList<>();
        myItems.add("Item 1");
        myItems.add("Item 2");
        myItems.add("Item 3");

        Ui5ComboBox cb1 = new Ui5ComboBox();
        cb1.setPlaceholder("Enter value");
        cb1.setItems(myItems);

        Ui5ComboBox cb2 = new Ui5ComboBox();
        cb2.setPlaceholder("Enter value");
        cb2.setItems(myItems);
        cb2.setValueState(Ui5InputBase.ValueState.SUCCESS);
        cb2.setValue("Item 1");

        Div container = new Div();
        container.getElement().setAttribute("style", "display: flex; flex-direction: row; gap: 0.5em");
        container.add(cb1, cb2);
        panel.add(container);

    }
}
