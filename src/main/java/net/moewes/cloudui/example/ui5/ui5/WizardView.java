package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.ui5.Ui5Title;
import net.moewes.cloudui.ui5.Ui5Wizard;
import net.moewes.cloudui.ui5.Ui5WizardStep;


import java.util.Optional;

@CloudUiView("/ui5/wizard")
public class WizardView extends Ui5DemoBaseView {


    public WizardView() {
        super("Wizard");
    }

    @PostConstruct
    public void createView() {

        Ui5Wizard wizard = new Ui5Wizard();
        add(wizard);

        Ui5WizardStep step1 = new Ui5WizardStep();
        step1.setHeading("Step 1");
        step1.setSubheading("Start");
        step1.add(new Ui5Title("Step 1"));

        Ui5WizardStep step2 = new Ui5WizardStep();
        step2.setHeading("Step 2");
        step2.setSubheading("Main Work");
        step2.add(new Ui5Title("Step 2"));
        step2.setBranching(true);
        step2.setDisabled(true);
        step2.setIconName("employee");

        Ui5WizardStep step3 = new Ui5WizardStep();
        step3.setHeading("Step 3");
        step3.setSubheading("Finish");

        wizard.add(step1, step2, step3);

        wizard.addEventListener("selection-change", uiEvent -> {
            uiEvent.getParameter("selectedStep").ifPresent(step -> {
                /*
                Notification notification = new Notification();
                add(notification);
                notification.setText("Value change " + step);
                notification.open();
                Optional<UiComponent> selectedStep = getComponentWithId((String) step);
                selectedStep.get().getElement().setAttribute("selected", "true"); // TODO
                // FIXME
                 */
            });
        });
    }
}
