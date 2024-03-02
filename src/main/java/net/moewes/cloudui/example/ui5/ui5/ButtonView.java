package net.moewes.cloudui.example.ui5.ui5;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.Ui5Button;
import net.moewes.cloudui.ui5.Ui5Panel;

@CloudUiView("/ui5/button")
public class ButtonView extends Ui5DemoBaseView {

    public ButtonView() {

        super("Button");
        
        Div container = new Div();
        container.getElement().setAttribute("style", "display: flex; flex-direction: row; gap: 0.5em");
        Ui5Panel panel = new Ui5Panel("Basic Button", true);

        Ui5Button button1 = new Ui5Button("Enabled");
        Ui5Button button2 = new Ui5Button("Disabled");
        button2.setDisabled(true);
        Ui5Button button3 = new Ui5Button("Tranparent");
        button3.setDesign(Ui5Button.Design.TRANSPARENT);
        button3.setIcon("accept");
        button3.setIconEnd(true);

        Ui5Button button4 = new Ui5Button("Remove");
        button4.setIcon("delete");
        button4.setDesign(Ui5Button.Design.NEGATIVE);

        Ui5Button button5 = new Ui5Button();
        button5.setIcon("add");
        button5.setDesign(Ui5Button.Design.POSITIVE);

        Ui5Button button6 = new Ui5Button("Emphasized");
        button6.setIcon("alert");
        button6.setDesign(Ui5Button.Design.EMPHASIZED);

        container.add(button1, button2, button3, button4, button5, button6);
        panel.add(container);
        add(panel);
    }
}
