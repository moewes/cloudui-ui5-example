package net.moewes.cloudui.example.ui5.ui5;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.ui5.Ui5Avatar;
import net.moewes.cloudui.ui5.Ui5Panel;

import java.util.Arrays;

@CloudUiView("/ui5/avatar")
public class Ui5AvatarView extends Ui5DemoBaseView {

    public Ui5AvatarView() {

        super("Avatar");

        Ui5Panel panel1 = new Ui5Panel("Basic Avatar", true);
        add(panel1);

        Ui5Avatar avatar = new Ui5Avatar();
        avatar.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");

        Ui5Avatar avatar2 = new Ui5Avatar();
        avatar2.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatar2.setShape(Ui5Avatar.Shape.CIRCLE);

        Ui5Avatar avatar3 = new Ui5Avatar();
        avatar3.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatar3.setShape(Ui5Avatar.Shape.SQUARE);

        panel1.add(avatar, avatar2, avatar3);

        Ui5Panel panel2 = new Ui5Panel("Avatar Sizes", true);
        add(panel2);

        Ui5Avatar avatarxs = new Ui5Avatar();
        avatarxs.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatarxs.setSize(Ui5Avatar.Size.XS);

        Ui5Avatar avatars = new Ui5Avatar();
        avatars.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatars.setSize(Ui5Avatar.Size.S);

        Ui5Avatar avatarm = new Ui5Avatar();
        avatarm.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatarm.setSize(Ui5Avatar.Size.M);

        Ui5Avatar avatarl = new Ui5Avatar();
        avatarl.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatarl.setSize(Ui5Avatar.Size.L);

        Ui5Avatar avatarxl = new Ui5Avatar();
        avatarxl.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatarxl.setSize(Ui5Avatar.Size.XL);

        panel2.add(avatarxs, avatars, avatarm, avatarl, avatarxl);

        Ui5Panel panel3 = new Ui5Panel("Avatar with Icons", true);
        add(panel3);

        Ui5Avatar iconxs = new Ui5Avatar();
        iconxs.setIcon("employee");
        iconxs.setSize(Ui5Avatar.Size.XS);


        Ui5Avatar icons = new Ui5Avatar();
        icons.setIcon("employee");
        icons.setSize(Ui5Avatar.Size.S);

        Ui5Avatar iconm = new Ui5Avatar();
        iconm.setIcon("employee");
        iconm.setSize(Ui5Avatar.Size.M);

        Ui5Avatar iconl = new Ui5Avatar();
        iconl.setIcon("employee");
        iconl.setSize(Ui5Avatar.Size.L);

        Ui5Avatar iconxl = new Ui5Avatar();
        iconxl.setIcon("employee");
        iconxl.setSize(Ui5Avatar.Size.XL);

        panel3.add(iconxs, icons, iconm, iconl, iconxl);

        Ui5Panel panel4 = new Ui5Panel("Avatar with Initials and different Color", true);
        add(panel4);

        Arrays.stream(Ui5Avatar.BackgroundColor.values()).forEach(backgroundColor -> {
            Ui5Avatar colorAvatar = new Ui5Avatar();
            colorAvatar.setBackgroundColor(backgroundColor);
            colorAvatar.setInitials("MM");
            colorAvatar.setInteractive(true);
            panel4.add(colorAvatar);
        });
    }
}
