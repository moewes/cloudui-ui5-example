package net.moewes.cloudui.example.ui5.ui5;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.html.H1;
import net.moewes.cloudui.ui5.Ui5Panel;

@CloudUiView("/ui5/panel")
public class Ui5PanelView extends Div {

    public Ui5PanelView() {

        Ui5Panel panel = new Ui5Panel("Basic Panel", false);
        add(panel);

        Div content = new Div();
        content.setInnerHtml("lorem ipsum lorem ipsom...");
        panel.add(content);

        Ui5Panel panel2 = new Ui5Panel("Fixed Panel", true);
        add(panel2);

        panel2.add(content);

        Ui5Panel panel3 = new Ui5Panel("Collapsed Panel", false);
        add(panel3);

        panel3.add(content);
        panel3.setCollapsed(true);

        Ui5Panel panel4 = new Ui5Panel("Panel with custom header", false);
        add(panel4);

        panel4.add(content);
        panel4.addToHeader(new H1("Custom Header"));
    }
}
