package net.moewes.cloudui.example.ui5.ui5;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.html.H2;
import net.moewes.cloudui.ui5.Ui5Input;
import net.moewes.cloudui.ui5.Ui5Label;


@CloudUiView("/ui5/form")
public class FormLayoutView extends Div {

    public FormLayoutView() {

        // TODO
        //getElement().setAttribute("theme", "spacing");
        //add(new Ui5Title("Label"));

        //Ui5Panel panel = new Ui5Panel("Basic Label", true);
        //add(panel);

        /*
        FormLayout form = new FormLayout();
        Ui5Label nameLabel = new Ui5Label("Name");
        Ui5Input nameField = new Ui5Input();
        form.addFormItem(nameField, nameLabel);
        Ui5Label titleLabel = new Ui5Label("Title");
        Ui5Input titleField = new Ui5Input();
        form.addFormItem(titleField, titleLabel);
        Ui5Label label = new Ui5Label("Very long label with some Words");
        Ui5Input field = new Ui5Input();
        // field.getElement().setAttribute("class", "full-width");
        form.addFormItem(field, label);

        //panel.add(form);

        add(form);

         */
        add(new H2("TBD"));
    }
}
