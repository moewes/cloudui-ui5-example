package net.moewes.cloudui.example.ui5.ui5;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.Ui5Link;
import net.moewes.cloudui.ui5.Ui5Panel;
import net.moewes.cloudui.ui5.Ui5Title;

@CloudUiView("/ui5/link")
public class Ui5LinkView extends Div {

    public Ui5LinkView() {

        String url = "https://moewes.github.io/cloud-ui/index.html";

        add(new Ui5Title("Link", Ui5Title.Level.H1));

        Ui5Panel panel = new Ui5Panel("Different Link Designs", true);

        Ui5Link link = new Ui5Link("Default design", url);
        link.setDesign(Ui5Link.Design.DEFAULT);

        Ui5Link link2 = new Ui5Link("Emphasized design", url);
        link2.setDesign(Ui5Link.Design.EMPHASIZED);
        link2.setTarget(Ui5Link.Target.BLANK);

        Ui5Link link3 = new Ui5Link("Subtle design", url);
        link.setDesign(Ui5Link.Design.SUBTLE);

        Ui5Link link4 = new Ui5Link("disabled", url);
        link4.setDesign(Ui5Link.Design.EMPHASIZED);
        link4.setDisabled(true);

        Div container = new Div();
        container.getElement().setAttribute("style", "display: flex; flex-direction: column; gap: 0.5em");
        container.add(link, link2, link3, link4);
        panel.add(container);

        add(panel);
    }
}
