package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.example.ui5.Ui5View;
import net.moewes.cloudui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.ui5.*;

@CloudUiView("/ui5/bar")
public class BarView extends Ui5DemoBaseView {

    @Inject
    CloudUi ui;

    public BarView() {
        super("Bar");
    }

    @PostConstruct
    public void createView() {

        Ui5Button home = new Ui5Button();
        home.setIcon("home");
        home.setDesign(Ui5Button.Design.TRANSPARENT);
        home.addEventListener("click", event -> {
            ui.navigate(Ui5View.class);
        });

        Ui5Panel panel = new Ui5Panel("Header Bar", true);
        add(panel);

        Ui5Bar headerBar = new Ui5Bar();
        headerBar.setDesign(Ui5Bar.Design.HEADER);
        headerBar.addMiddleContent(new Ui5Label("Header Title"));
        headerBar.addStartContent(home);
        panel.add(headerBar);

        Ui5Panel panel2 = new Ui5Panel("Subheader Bar", true);
        add(panel2);

        Ui5Bar subheaderBar = new Ui5Bar();
        subheaderBar.setDesign(Ui5Bar.Design.SUBHEADER);
        subheaderBar.addMiddleContent(new Ui5Label("Subtitle"));
        subheaderBar.addEndContent(new Ui5Button("Save"));
        panel2.add(subheaderBar);

        Ui5Panel panel3 = new Ui5Panel("Footer Bar", true);
        add(panel3);

        Ui5Bar footerBar = new Ui5Bar();
        footerBar.setDesign(Ui5Bar.Design.FOOTER);
        footerBar.addStartContent(new Ui5Link("more", "../ui5Elements"));
        footerBar.addMiddleContent(new Ui5Label("Footer"));
        panel3.add(footerBar);

        Ui5Panel panel4 = new Ui5Panel("Floating Footer Bar", true);
        add(panel4);

        Ui5Bar floatingBar = new Ui5Bar();
        floatingBar.setDesign(Ui5Bar.Design.FLOATING_FOOTER);
        floatingBar.addEndContent(new Ui5Button("Action"), new Ui5Button("more Action"));
        panel4.add(floatingBar);

    }
}
