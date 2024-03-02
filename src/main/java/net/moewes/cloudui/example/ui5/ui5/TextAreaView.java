package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;
import net.moewes.cloudui.ui5.Ui5TextArea;

@CloudUiView("/ui5/textarea")
public class TextAreaView extends Ui5DemoBaseView {


    public TextAreaView() {
        super("Text Area");
    }

    @PostConstruct
    public void createView() {

        Ui5Panel panel1 = new Ui5Panel("Basic TextArea", true);
        add(panel1);

        Ui5TextArea textArea1 = new Ui5TextArea();
        textArea1.setPlaceholder("Type as much text as you wish");
        textArea1.setRows(5);
        textArea1.setGrowing(true);
        textArea1.setGrowingMaxLines(10);
        panel1.add(textArea1);

        Ui5Panel panel2 = new Ui5Panel("TextArea with Maximum Length", true);
        add(panel2);

        Ui5TextArea textArea2 = new Ui5TextArea();
        textArea2.setPlaceholder("Type some text");
        textArea2.setMaxLength(10);
        textArea2.showExceededText(true);
        panel2.add(textArea2);

        textArea2.addEventListener("change", event -> {
            panel2.add(new Ui5Label("You wrote: " + textArea2.getValue()));
        });

    }
}
