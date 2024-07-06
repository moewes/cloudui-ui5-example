package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.ui5.Ui5Link;
import net.moewes.cloudui.ui5.Ui5TextArea;
import net.moewes.cloudui.ui5.Ui5Title;
import net.moewes.cloudui.ui5.dynamicpage.Ui5DynamicPage;
import net.moewes.cloudui.ui5.dynamicpage.Ui5DynamicPageHeader;
import net.moewes.cloudui.ui5.dynamicpage.Ui5DynamicPageTitle;
import net.moewes.cloudui.ui5.form.Ui5Form;

@CloudUiView("/ui5/dynamicPage")
public class DynamicPageView extends Ui5DynamicPage {

    @Inject
    CloudUi ui;

    @PostConstruct
    public void createView() {

        ui.setTitle("Dynamic Page");

        Ui5DynamicPageTitle pageTitle = new Ui5DynamicPageTitle();

        Ui5Title title = new Ui5Title("Title");
        title.getElement().setAttribute("slot", "heading");

        UiComponent breadcrumbs = new UiComponent("ui5-breadcrumbs");
        UiComponent link1 = new UiComponent("ui5-breadcrumbs-item");
        link1.setInnerHtml("link1");
        breadcrumbs.add(link1);
        UiComponent link2 = new UiComponent("ui5-breadcrumbs-item");
        link2.setInnerHtml("link2");
        breadcrumbs.add(link2);

        breadcrumbs.getElement().setAttribute("slot", "breadcrumbs");

        pageTitle.add(breadcrumbs);

        pageTitle.add(title);

        pageTitle.getElement().setAttribute("slot", "titleArea"); // TODO

        add(pageTitle);

        // ----
        Ui5DynamicPageHeader pageHeader = new Ui5DynamicPageHeader();
        pageHeader.getElement().setAttribute("slot", "headerArea");

        pageHeader.add(new Ui5Title("Header"));

        add(pageHeader);


        // ---

        Ui5Form form = new Ui5Form();

        Ui5TextArea ta = new Ui5TextArea();
        ta.setValue("Lorem Ipsum Lorem Ipsum....");

        form.add(ta);
        form.add(new Ui5Link("xxx", "xxx"));

        add(form);

    }


}
