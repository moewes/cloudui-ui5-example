package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.ui5.Ui5Panel;
import net.moewes.cloudui.ui5.breadcrumbs.BreadcrumbsSeparator;
import net.moewes.cloudui.ui5.breadcrumbs.Ui5Breadcrumbs;
import net.moewes.cloudui.ui5.breadcrumbs.Ui5BreadcrumbsItem;

import java.util.Arrays;

@CloudUiView("/ui5/breadcrumbs")
public class BreadcrumbsView extends Ui5DemoBaseView {

    static final String TITLE = "Breadcrumbs";
    @Inject
    CloudUi ui;

    @Inject
    public BreadcrumbsView() {

        super(TITLE);
    }

    @PostConstruct
    public void createView() {

        ui.setTitle(TITLE);

        Ui5Panel panel = new Ui5Panel("Separator Styles", true);
        add(panel);

        Arrays.stream(BreadcrumbsSeparator.values()).forEach(v -> {
            Ui5Breadcrumbs bc = new Ui5Breadcrumbs();
            bc.setSeparator(v);
            bc.add(new Ui5BreadcrumbsItem("Parent", "#"),
                    new Ui5BreadcrumbsItem("Page " + v.getAttributeText(), "#"));
            panel.add(bc);
        });


    }


}
