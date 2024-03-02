package net.moewes.cloudui.example.ui5.ui5;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.*;

@CloudUiView("/ui5/input")
public class InputView extends Div {

    public InputView() {

        add(new Ui5Title("Input"));

        Ui5Panel panel = new Ui5Panel("Basic Input", true);
        Div container = new Div();

        Ui5Input input1 = new Ui5Input();
        input1.setValue("Input");

        Ui5Input input2 = new Ui5Input();
        input2.setReadOnly(true);
        input2.setValue("readonly Input");

        Ui5Input input3 = new Ui5Input();
        input3.setDisabled(true);
        input3.setValue("disabled Input");

        container.add(input1, input2, input3);
        container.getElement().setAttribute("style", "display: flex; flex-direction: column; gap: 0.5em");
        panel.add(container);
        add(panel);

        Ui5Panel panel2 = new Ui5Panel("Basic Input", true);
        Div container2 = new Div();

        Ui5Input input21 = new Ui5Input();
        input21.setValue("Information");
        input21.addValueStateMessage("Value state information", Ui5Input.ValueState.INFORMATION);

        Ui5Input input22 = new Ui5Input();
        input22.setValue("Success");
        input22.addValueStateMessage("Value state success", Ui5Input.ValueState.SUCCESS);

        Ui5Input input23 = new Ui5Input();
        input23.setValue("disabled Input");
        input23.addValueStateMessage("Value state warning", Ui5Input.ValueState.WARNING);

        Ui5Input input24 = new Ui5Input();
        input24.setValue("disabled Input");
        input24.addValueStateMessage("Value state error", Ui5Input.ValueState.ERROR);

        container2.add(input21, input22, input23, input24);
        container2.getElement().setAttribute("style", "display: flex; flex-direction: column; gap: 0.5em");
        panel2.add(container2);
        add(panel2);

        Ui5Panel panel3 = new Ui5Panel("Input as Search Field", true);
        Ui5Input input30 = new Ui5Input();
        input30.addIcon(new Ui5Icon("search"));

        panel3.add(input30);
        add(panel3);

        Ui5Panel panel4 = new Ui5Panel("Input with Label", true);

        Ui5Input nameField = new Ui5Input();
        nameField.setPlaceholder("Enter your Name");
        Ui5Label nameLabel = new Ui5Label("Name");
        nameLabel.setFor(nameField);

        panel4.add(nameLabel, nameField);

        add(panel4);

    }
}
