package net.moewes.cloudui.example.ui5;


import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.Ui5Button;

import java.util.Arrays;

@CloudUiView("/ui5/button")
public class ButtonView extends Div {

    @PostConstruct
    public void createView() {
        getElement().setAttribute("style", "padding: 1em");

        Arrays.stream(Ui5Button.Design.values()).forEach(color -> {

                Ui5Button button = new Ui5Button();
                button.setText(color.name());
                add(button);
                button.setDesign(color);
                button.addClickHandler(uiEvent -> {});

        });
    }
}
