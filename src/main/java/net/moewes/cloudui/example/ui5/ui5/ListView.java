package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.ui5.Ui5Panel;
import net.moewes.cloudui.ui5.list.Ui5List;
import net.moewes.cloudui.ui5.list.Ui5ListGroupHeader;
import net.moewes.cloudui.ui5.list.Ui5ListItem;

@CloudUiView("/ui5/list")
public class ListView extends Ui5DemoBaseView {


    public ListView() {
        super("List");
    }

    @PostConstruct
    public void createView() {

        Ui5Panel panel1 = new Ui5Panel("Basic List", true);
        add(panel1);

        Ui5List list1 = new Ui5List();
        panel1.add(list1);

        Ui5ListItem li11 = new Ui5ListItem();
        li11.setText("Pinapple");
        li11.setIcon("nutrition-activity", false);
        li11.setDescription("Tropical plant with an edible fruit");
        li11.setInfo("in-stock");
        li11.setInfoState(Ui5ListItem.InfoState.SUCCESS);

        Ui5ListItem li12 = new Ui5ListItem();
        li12.setText("Orange");
        li12.setIcon("nutrition-activity", false);
        li12.setDescription("Occurs between red and yellow");
        li12.setInfo("expires");
        li12.setInfoState(Ui5ListItem.InfoState.WARNING);

        Ui5ListItem li13 = new Ui5ListItem();
        li13.setText("Blueberry");
        li13.setIcon("nutrition-activity", false);
        li13.setDescription("Tropical plant with an edible fruit");
        li13.setInfo("re-stock");
        li13.setInfoState(Ui5ListItem.InfoState.INFORMATION);

        Ui5ListItem li14 = new Ui5ListItem();
        li14.setText("Mango");
        li14.setIcon("nutrition-activity", false);
        li14.setDescription("The tropical stone fruit");
        li14.setInfo("re-stock");
        li14.setInfoState(Ui5ListItem.InfoState.ERROR);

        list1.add(li11, li12, li13, li14);

        list1.addEventListener("item-click", uiEvent -> {
            /*
            Notification notification = new Notification();
            add(notification);
            String item = (String) uiEvent.getParameter("item").orElse("unknown");
            notification.setText("Item " + item + " selected");
            notification.open();
            // FIXME
             */
        });

        Ui5Panel panel2 = new Ui5Panel("List in Single-selection Mode", true);
        add(panel2);

        Ui5List list2 = new Ui5List();
        panel2.add(list2);
        list2.setMode(Ui5List.Mode.SINGLE_SELECT);
        list2.setHeaderText("Select a Country");

        Ui5ListItem li21 = new Ui5ListItem();
        li21.setText("France");
        li21.setIcon("map", true);

        Ui5ListItem li22 = new Ui5ListItem();
        li22.setText("Germany");
        li22.setIcon("map", true);

        Ui5ListItem li23 = new Ui5ListItem();
        li23.setText("Norway");
        li23.setIcon("map", true);

        Ui5ListItem li24 = new Ui5ListItem();
        li24.setText("China");
        li24.setIcon("map", true);
        li24.setType(Ui5ListItem.Type.INACTIVE);

        list2.add(li21, li22, li23, li24);

        list2.addEventListener("selection-change", uiEvent -> {
            /*
            Notification notification = new Notification();
            add(notification);
            String item = (String) uiEvent.getParameter("item").orElse("unknown");
            notification.setText("Item " + item + " selected");
            notification.open();
            // FIXME
             */
        });

        Ui5Panel panel3 = new Ui5Panel("List in Multi-selection Mode", true);
        add(panel3);

        Ui5List list3 = new Ui5List();
        panel3.add(list3);
        list3.setMode(Ui5List.Mode.MULTISELECT);
        list3.setHeaderText("Select a Country");

        Ui5ListItem li31 = new Ui5ListItem();
        li31.setText("France");

        Ui5ListItem li32 = new Ui5ListItem();
        li32.setText("Germany");

        Ui5ListItem li33 = new Ui5ListItem();
        li33.setText("Norway");

        Ui5ListItem li34 = new Ui5ListItem();
        li34.setText("China");

        list3.add(li31, li32, li33, li34);

        // TODO selected item
        // TODO Event handler
        list3.addEventListener("selection-change", uiEvent -> {
            /*
            Notification notification = new Notification();
            add(notification);
            String item = (String) uiEvent.getParameter("item").orElse("unknown");
            notification.setText("Item " + item + " selected");
            notification.open();
            // FIXME
             */
        });

        Ui5Panel panel4 = new Ui5Panel("List with GroupHeaders", true);
        add(panel4);

        Ui5List list4 = new Ui5List();
        panel4.add(list4);
        list4.setMode(Ui5List.Mode.SINGLE_SELECT_END);

        Ui5ListGroupHeader gh1 = new Ui5ListGroupHeader("Europe");

        Ui5ListItem li41 = new Ui5ListItem();
        li41.setText("France");

        Ui5ListItem li42 = new Ui5ListItem();
        li42.setText("Germany");

        Ui5ListItem li43 = new Ui5ListItem();
        li43.setText("Norway");

        Ui5ListGroupHeader gh2 = new Ui5ListGroupHeader("Asia");

        Ui5ListItem li44 = new Ui5ListItem();
        li44.setText("China");

        list4.add(gh1, li41, li42, li43, gh2, li44);

        list4.addEventListener("selection-change", uiEvent -> {
            /*
            Notification notification = new Notification();
            add(notification);
            String item = (String) uiEvent.getParameter("item").orElse("unknown");
            notification.setText("Item " + item + " selected");
            notification.open();
            // FIXME
             */
        });

        Ui5Panel panel5 = new Ui5Panel("List in Delete-Mode", true);
        add(panel5);

        Ui5List list5 = new Ui5List();
        panel5.add(list5);
        list5.setMode(Ui5List.Mode.DELETE);
        list5.setHeaderText("Delete Mode");

        Ui5ListItem li51 = new Ui5ListItem();
        li51.setText("France");

        Ui5ListItem li52 = new Ui5ListItem();
        li52.setText("Germany");

        Ui5ListItem li53 = new Ui5ListItem();
        li53.setText("Norway");

        Ui5ListItem li54 = new Ui5ListItem();
        li54.setText("China");

        list5.add(li51, li52, li53, li54);

        list5.addEventListener("item-delete", uiEvent -> {
            /*
            Notification notification = new Notification();
            add(notification);
            String item = (String) uiEvent.getParameter("item").orElse("unknown");
            notification.setText("Delete item " + item);
            notification.open();
            // FIXME
             */
        });

        Ui5Panel panel6 = new Ui5Panel("List with no data", true);
        add(panel6);

        Ui5List list6 = new Ui5List();
        panel6.add(list6);
        list6.setHeaderText("Products");
        list6.setNoDataText("no data available");
    }
}
