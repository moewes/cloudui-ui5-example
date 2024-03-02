package net.moewes.cloudui.example.ui5.ui5;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.ui5.Ui5Badge;
import net.moewes.cloudui.ui5.Ui5Icon;
import net.moewes.cloudui.ui5.Ui5Panel;

import java.util.Arrays;

@CloudUiView("/ui5/badge")
public class BadgeView extends Ui5DemoBaseView {

    public BadgeView() {

        super("Badge");

        Ui5Panel panel = new Ui5Panel("Basic Badge", true);
        add(panel);

        Arrays.stream(Ui5Badge.ColorScheme.values()).forEach(design -> {
            Ui5Badge badge = new Ui5Badge("Color Scheme " + (design.ordinal() + 1));
            badge.setColorScheme(design);
            panel.add(badge);
        });

        Ui5Panel panel2 = new Ui5Panel("Badge with Icon", true);
        add(panel2);

        panel2.add(new Ui5Badge("Employee", new Ui5Icon("employee")));
        panel2.add(new Ui5Badge(new Ui5Icon("employee")));
    }
}
