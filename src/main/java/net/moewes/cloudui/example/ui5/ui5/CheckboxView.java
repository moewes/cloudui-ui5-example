package net.moewes.cloudui.example.ui5.ui5;

import jakarta.inject.Inject;
import net.moewes.cloudui.annotations.CloudUiView;

import net.moewes.cloudui.example.ui5.Ui5View;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.ui5.*;


@CloudUiView("/ui5/checkbox")
public class CheckboxView extends Div {

    @Inject
    public CheckboxView(CloudUi ui) {

        Ui5Bar bar = new Ui5Bar();
        bar.addMiddleContent(new Ui5Label("Check Box"));
        add(bar);

        Ui5Button home = new Ui5Button();
        home.setIcon("home");
        home.setDesign(Ui5Button.Design.TRANSPARENT);
        home.addEventListener("click", event -> {
            ui.navigate(Ui5View.class);
        });
        bar.addStartContent(home);

        Ui5Panel panel = new Ui5Panel("Basic Check Box", true);
        add(panel);

        Ui5CheckBox cb1 = new Ui5CheckBox();
        cb1.setText("Chocolate");
        cb1.addEventListener("change", uiEvent -> {
            /*
            Notification notification = new Notification();
            add(notification);
            notification.setText("Value change ");
            notification.open();
            // FIXME
             */
        });
        Ui5CheckBox cb2 = new Ui5CheckBox();
        cb2.setText("Strawberry");
        cb2.setValue("true");
        Ui5CheckBox cb3 = new Ui5CheckBox();
        cb3.setText("Waffles");
        cb3.getElement().setAttribute("checked", "true");
        //cb3.setValueState(ERROR);
        Ui5CheckBox cb4 = new Ui5CheckBox();
        cb4.setText("Cake");
        //cb4.setValueState(WARNING);

        panel.add(cb1, cb2, cb3, cb4);

        Ui5Panel panel2 = new Ui5Panel("Check Box states", true);
        add(panel2);

        Ui5CheckBox cb21 = new Ui5CheckBox();
        cb21.setText("Error");
        cb21.setValueState(Ui5InputBase.ValueState.ERROR);
        Ui5CheckBox cb22 = new Ui5CheckBox();
        cb22.setText("Warning");
        cb22.setValueState(Ui5InputBase.ValueState.WARNING);
        Ui5CheckBox cb23 = new Ui5CheckBox();
        cb23.setText("Disabled");
        cb23.setDisabled(true);
        Ui5CheckBox cb24 = new Ui5CheckBox();
        cb24.setText("Readonly");
        cb24.setReadOnly(true);
        Ui5CheckBox cb25 = new Ui5CheckBox();
        cb25.setText("Error disabled");
        cb25.setValueState(Ui5InputBase.ValueState.ERROR);
        cb25.setDisabled(true);
        Ui5CheckBox cb26 = new Ui5CheckBox();
        cb26.setText("Warning disabled");
        cb26.setDisabled(true);
        cb26.setValueState(Ui5InputBase.ValueState.WARNING);
        Ui5CheckBox cb27 = new Ui5CheckBox();
        cb27.setText("Error readonly");
        cb27.setReadOnly(true);
        cb27.setValueState(Ui5InputBase.ValueState.ERROR);
        Ui5CheckBox cb28 = new Ui5CheckBox();
        cb28.setText("Warning readonly");
        cb28.setValueState(Ui5InputBase.ValueState.WARNING);
        cb28.setReadOnly(true);

        panel2.add(cb21, cb22, cb23, cb24, cb25, cb26, cb27, cb28);

        Ui5Panel panel3 = new Ui5Panel("Check Box with Text Wrapping ", true);
        add(panel3);

        Ui5CheckBox cb31 = new Ui5CheckBox();
        cb31.setText("ui5-checkbox with 'wrap' set and some long text.");
        cb31.setWrap(true);
        cb31.getElement().setAttribute("style", "width:200px");
        Ui5CheckBox cb32 = new Ui5CheckBox();
        cb32.setText("ui5-checkbox with out 'wrap' set and some long text.");
        cb32.getElement().setAttribute("style", "width:200px");

        panel3.add(cb31, cb32);

    }
}
