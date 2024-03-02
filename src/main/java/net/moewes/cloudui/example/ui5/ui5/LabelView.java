package net.moewes.cloudui.example.ui5.ui5;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.html.Div;
import net.moewes.cloudui.ui5.Ui5Input;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;
import net.moewes.cloudui.ui5.Ui5Title;

@CloudUiView("/ui5/label")
public class LabelView extends Div {

    public LabelView() {

        add(new Ui5Title("Label"));

        Ui5Panel basicPanel = new Ui5Panel("Basic Label", true);
        add(basicPanel);

        basicPanel.add(new Ui5Label("The quick brown fox jumps over the lazy dog."));

        Ui5Panel requiredPanel = new Ui5Panel("Required Label", true);
        add(requiredPanel);
        Ui5Label requiredLabel = new Ui5Label("Required Label");
        requiredLabel.setRequired(true);
        requiredPanel.add(requiredLabel);

        Ui5Panel colonPanel = new Ui5Panel("Required Label with Colon", true);
        add(colonPanel);
        Ui5Label colonLabel = new Ui5Label("Required Label");
        colonLabel.setRequired(true);
        colonLabel.setShowColon(true);
        colonPanel.add(colonLabel);

        Ui5Panel truncPanel = new Ui5Panel("Truncated Label", true);
        add(truncPanel);
        Ui5Label truncLabel = new Ui5Label("Long labels can wrap if the 'wrap' property is set.");
        truncLabel.getElement().setAttribute("style", "width:200px");
        truncPanel.add(truncLabel);

        Ui5Panel wrapPanel = new Ui5Panel("Wrapped Label", true);
        add(wrapPanel);
        Ui5Label wrapLabel = new Ui5Label("Long labels can wrap if the 'wrap' property is set.");
        wrapLabel.getElement().setAttribute("style", "width:200px");
        wrapLabel.setWrap(true);
        wrapPanel.add(wrapLabel);

        Ui5Panel panel = new Ui5Panel("Label 'for'", true);
        add(panel);

        Div layout = new Div();
        FormLayout form = new FormLayout();
        form.getElement().setAttribute("style", "background-color: whitesmoke;");

        layout.add(form);
        Ui5Label nameLabel = new Ui5Label("Name");
        nameLabel.setRequired(true);
        nameLabel.setShowColon(true);
        Ui5Input nameField = new Ui5Input();
        form.addFormItem(nameField, nameLabel);
        Ui5Label titleLabel = new Ui5Label("Title");
        titleLabel.setShowColon(true);
        Ui5Input titleField = new Ui5Input();
        form.addFormItem(titleField, titleLabel);
        Ui5Label label = new Ui5Label("Very long label");
        Ui5Input field = new Ui5Input();
        form.addFormItem(field, label);

        panel.add(layout);

    }

    // TODO Refactor
    public static class FormLayout extends UiComponent {

        /**
         * default constructor
         */
        public FormLayout() {
            super("div");
        }

        /**
         * @param inputComponent input ui component
         * @param labelComponent label ui component
         */
        public void addFormItem(UiComponent inputComponent, UiComponent labelComponent) {
            UiComponent formItem = new UiComponent("div");
            formItem.getElement().setAttribute("style", "display: flex;justify-content: flex-end; padding: .1rem;");
            labelComponent.getElement().setAttribute("style", "padding: .5em 1em .5em 0; flex: 1; text-align: right;");
            inputComponent.getElement().setAttribute("style", "flex: 2; ");
            formItem.add(labelComponent, inputComponent);
            add(formItem);
        }

    }
}
