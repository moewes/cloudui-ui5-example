package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.ui5.Ui5Label;
import net.moewes.cloudui.ui5.Ui5Panel;
import net.moewes.cloudui.ui5.tabs.Ui5Tab;
import net.moewes.cloudui.ui5.tabs.Ui5TabSeparator;
import net.moewes.cloudui.ui5.tabs.Ui5Tabcontainer;

@CloudUiView("/ui5/tabContainer")
public class TabcontainerView extends Ui5DemoBaseView {


    public TabcontainerView() {
        super("Tab Container");
    }

    @PostConstruct
    public void createView() {


        Ui5Panel panel1 = new Ui5Panel("Basic TabContainer", true);
        add(panel1);

        Ui5Tabcontainer tabcontainer1 = new Ui5Tabcontainer();
        panel1.add(tabcontainer1);

        Ui5Tab tab1 = new Ui5Tab();
        tab1.setText("Tab 1");
        tab1.setIcon("calendar");
        tab1.add(new Ui5Label("Content 1"));
        tab1.getElement().setAttribute("selected", "true");

        Ui5Tab tab2 = new Ui5Tab();
        tab2.setText("Tab 2");
        tab2.setIcon("activities");
        tab2.add(new Ui5Label("Content 2"));

        Ui5TabSeparator separator = new Ui5TabSeparator();

        Ui5Tab tab3 = new Ui5Tab();
        tab3.setText("Tab 3");
        tab3.setIcon("action-settings");
        tab3.add(new Ui5Label("Content 3"));

        tabcontainer1.add(tab1, tab2, separator, tab3);

        Ui5Panel panel2 = new Ui5Panel("TabContainer with text only tabs", true);
        add(panel2);

        Ui5Tabcontainer tabcontainer2 = new Ui5Tabcontainer();
        panel2.add(tabcontainer2);
        tabcontainer2.setTabPlacement(Ui5Tabcontainer.TabPlacement.BOTTOM);

        Ui5Tab tab21 = new Ui5Tab();
        tab21.setText("Tab 1");

        tab21.add(new Ui5Label("Content 1"));

        Ui5Tab tab22 = new Ui5Tab();
        tab22.setText("Tab 2");
        tab22.add(new Ui5Label("Content 2"));
        tab22.getElement().setAttribute("selected", "true");

        Ui5TabSeparator separator2 = new Ui5TabSeparator();

        Ui5Tab tab23 = new Ui5Tab();
        tab23.setText("Tab 3");
        tab23.add(new Ui5Label("Content 3"));

        tabcontainer2.add(tab21, tab22, separator2, tab23);

        Ui5Panel panel3 = new Ui5Panel("TabContainer with text and additional-text", true);
        add(panel3);

        Ui5Tabcontainer tabcontainer3 = new Ui5Tabcontainer();
        panel3.add(tabcontainer3);

        tabcontainer3.collapse();
        tabcontainer3.setFixed(true);

        Ui5Tab tab31 = new Ui5Tab();
        tab31.setText("Tab 1");
        tab31.setIcon("calendar");
        tab31.add(new Ui5Label("Content 1"));
        tab31.setAdditionalText("5");

        Ui5Tab tab32 = new Ui5Tab();
        tab32.setText("Tab 2");
        tab32.setIcon("activities");
        tab32.add(new Ui5Label("Content 2"));
        tab32.setAdditionalText("10");
        tab32.setDisabled(true);

        tabcontainer3.add(tab31, tab32);

        Ui5Panel panel4 = new Ui5Panel("TabContainer with tabLayout=\"Inline\"", true);
        add(panel4);

        Ui5Tabcontainer tabcontainer4 = new Ui5Tabcontainer();
        panel4.add(tabcontainer4);

        tabcontainer4.collapse();
        tabcontainer4.setFixed(true);
        tabcontainer4.setTabLayout(Ui5Tabcontainer.TabLayout.INLINE);

        Ui5Tab tab41 = new Ui5Tab();
        tab41.setText("Tab 1");

        tab41.add(new Ui5Label("Content 1"));
        tab41.setAdditionalText("(5)");

        Ui5Tab tab42 = new Ui5Tab();
        tab42.setText("Tab 2");
        tab42.add(new Ui5Label("Content 2"));
        tab42.setAdditionalText("(10)");
        tab42.setDisabled(true);

        tabcontainer4.add(tab41, tab42);

        tabcontainer4.addEventListener("tab-select", uiEvent -> {
            /*
            Notification notification = new Notification();
            add(notification);
            String tab = (String) uiEvent.getParameter("tab").orElse("unknown");
            String number = (String) uiEvent.getParameter("number").orElse("-");
            notification.setText("Tab selected " + tab + "(" + number + ")");
            tabcontainer4.getComponentWithId(tab).ifPresent(item -> {
                item.getElement().setAttribute("selected", "true");
            });
            notification.open();
            // FIXME
             */
        });

    }
}
