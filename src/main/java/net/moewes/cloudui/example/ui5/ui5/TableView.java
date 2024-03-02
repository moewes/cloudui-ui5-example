package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import net.moewes.cloudui.annotations.CloudUiView;

import net.moewes.cloudui.example.ui5.ui5.table.Model;
import net.moewes.cloudui.ui5.table.Ui5Table;

import java.util.ArrayList;
import java.util.List;

@CloudUiView("/ui5/table")
public class TableView extends Ui5DemoBaseView {

    private Ui5Table<Model> tableElement = new Ui5Table<>();

    public TableView() {
        super("Table");
    }

    @PostConstruct
    public void createView() {

        add(tableElement);
        tableElement.getElement().setAttribute("show-no-data", "true");
        tableElement.getElement().setAttribute("no-data-text", "no data");

        List<Model> list = new ArrayList<>();
        list.add(new Model("Test", "Hans", 22));
        list.add(new Model("Palme", "Olov", 47));
        list.add(new Model("Einstein", "Albert", 100));

        tableElement.setItems(list);

        tableElement.addColumn("Name", Model::getName);
        tableElement.addColumn("Surname", Model::getSurname);
        tableElement.addColumn("Age", Model::getAge);
    }
}
