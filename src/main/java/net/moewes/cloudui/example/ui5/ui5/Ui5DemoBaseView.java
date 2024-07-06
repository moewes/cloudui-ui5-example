package net.moewes.cloudui.example.ui5.ui5;

import jakarta.inject.Inject;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.example.ui5.Ui5View;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.ui5.Ui5Bar;
import net.moewes.cloudui.ui5.Ui5Button;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Page;

public abstract class Ui5DemoBaseView extends Div {

    private final Ui5Page page = new Ui5Page();
    private final Div content = new Div();
    @Inject
    CloudUi ui;

    public Ui5DemoBaseView(String componentName) {

        super.add(page);
        page.getElement().setAttribute("background-design", "Solid"); // FIXME

        page.add(content);
        content.getElement().setAttribute("style", "margin: 0.5rem");

        Ui5Bar bar = new Ui5Bar();
        bar.addMiddleContent(new Ui5Label(componentName));
        bar.getElement().setAttribute("slot", "header");
        page.add(bar);

        Ui5Button home = new Ui5Button();
        home.setIcon("home");
        home.setDesign(Ui5Button.Design.TRANSPARENT);
        home.addEventListener("click", event -> {
            ui.changeUrl("/ui5Elements");
            ui.navigate(Ui5View.class);
        });
        bar.addStartContent(home);
    }

    @Override
    public void add(UiComponent component) {
        content.add(component);
    }
}
