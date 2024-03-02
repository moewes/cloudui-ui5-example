package net.moewes.cloudui.example.ui5.ui5;

import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.ui5.Ui5Avatar;
import net.moewes.cloudui.ui5.Ui5AvatarGroup;
import net.moewes.cloudui.ui5.Ui5Panel;
import net.moewes.cloudui.ui5.Ui5Title;

import java.util.Arrays;
import java.util.Optional;

@CloudUiView("/ui5/avatarGroup")
public class AvatarGroupView extends Ui5DemoBaseView {

    public AvatarGroupView() {

        super("Avatar Group");

        add(new Ui5Title("Avatar Group", Ui5Title.Level.H1));

        Ui5Panel panel1 = new Ui5Panel("Basic Avatar", true);
        add(panel1);

        Ui5AvatarGroup group = new Ui5AvatarGroup();
        group.setType(Ui5AvatarGroup.AvatarGroupType.GROUP);
        group.setAvatarSize(Ui5Avatar.Size.S);
        panel1.add(group);

        Ui5Avatar avatar = new Ui5Avatar();
        avatar.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");

        Ui5Avatar avatar2 = new Ui5Avatar();
        avatar2.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatar2.setShape(Ui5Avatar.Shape.CIRCLE);

        Ui5Avatar avatar3 = new Ui5Avatar();
        avatar3.setImage("https://sap.github.io/ui5-webcomponents/assets/images/avatars/man_avatar_1.png");
        avatar3.setShape(Ui5Avatar.Shape.SQUARE);

        group.add(avatar, avatar2, avatar3);


        Ui5Panel panel4 = new Ui5Panel("Avatar with Initials and different Color", true);
        add(panel4);

        Ui5AvatarGroup group2 = new Ui5AvatarGroup();
        group2.setType(Ui5AvatarGroup.AvatarGroupType.INDIVIDUAL);
        group2.setAvatarSize(Ui5Avatar.Size.XL);
        panel4.add(group2);

        group2.addEventListener("click", event -> {
            String notificationText = "";
            Optional<Object> targetRef = event.getParameter("targetRef");
            Optional<Object> overflowButtonClicked = event.getParameter("overflowButtonClicked");
            if ((Boolean) overflowButtonClicked.get()) {
                notificationText = "overflow button clicked";
            } else {
                if (targetRef.isPresent()) {
                    notificationText = "Avatar with id " + targetRef.get() + " clicked";
                }
            }
            /* //FIXME
            Notification notification = new Notification(notificationText, 2000);
            notification.open();
            add(notification);
             */
        });

        Arrays.stream(Ui5Avatar.BackgroundColor.values()).forEach(backgroundColor -> {
            Ui5Avatar colorAvatar = new Ui5Avatar();
            colorAvatar.setBackgroundColor(backgroundColor);
            colorAvatar.setInitials("MM");
            colorAvatar.setInteractive(true);
            group2.add(colorAvatar);
        });
    }
}
