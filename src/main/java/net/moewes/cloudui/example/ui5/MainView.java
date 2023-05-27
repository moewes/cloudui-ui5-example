package net.moewes.cloudui.example.ui5;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.html.H1;

@CloudUiView("/")
public class MainView extends Div {

    public MainView() {
        super();

        getElement().setAttribute("style", "padding: 1em");

        add(new H1("UI5 Examples"));
        add(getLink("Button","/ui5/button"));
    }

    private UiComponent getLink(String text, String url)  {
        Div div = new Div();
        UiComponent link = new UiComponent("a");
        link.setInnerHtml(text);
        link.getElement().setAttribute("href",url);
        div.add(link);
        return div;
    }
}
