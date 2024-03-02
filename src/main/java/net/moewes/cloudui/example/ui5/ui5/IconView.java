package net.moewes.cloudui.example.ui5.ui5;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.Ui5Icon;
import net.moewes.cloudui.ui5.Ui5Panel;
import net.moewes.cloudui.ui5.Ui5Title;

@CloudUiView("/ui5/icon")
public class IconView extends Div {

    public IconView() {

        add(new Ui5Title("Icon"));

        Ui5Panel panel = new Ui5Panel("Basic Icons", true);

        panel.add(new Ui5Icon("activate"));
        panel.add(new Ui5Icon("activities"));
        panel.add(new Ui5Icon("add-equipment"));
        panel.add(new Ui5Icon("add-document"));
        panel.add(new Ui5Icon("add-employee"));

        add(panel);

        Ui5Panel panel3 = new Ui5Panel("Customized Icons", true);

        Ui5Icon icon1 = new Ui5Icon("employee");
        icon1.getElement().setAttribute("style", "width:3rem;height:3rem;font-size:1.5rem;color:crimson;background-color:#fafafa");

        Ui5Icon icon2 = new Ui5Icon("menu");
        icon2.getElement().setAttribute("style", "width:3rem;height:3rem;font-size:1.5rem;color:crimson;background-color:#fafafa");

        panel3.add(icon1, icon2);
        add(panel3);
    }
}
