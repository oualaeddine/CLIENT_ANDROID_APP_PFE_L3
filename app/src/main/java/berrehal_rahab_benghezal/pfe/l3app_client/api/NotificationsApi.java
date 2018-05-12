package berrehal_rahab_benghezal.pfe.l3app_client.api;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.MyNotification;

/**
 * Created by berre on 5/8/2018.
 * Project : client_android_app.
 */
public class NotificationsApi extends MyApi {

    public LinkedList<MyNotification> getMyNotificationss() {
        LinkedList<MyNotification> notifications = new LinkedList<>();
        // TODO: 5/12/2018 remplace dummy data with data from server

        MyNotification notification = new MyNotification();

        notification.setTitle("notification 1");
        notification.setImg("");
        notifications.add(notification);

        notification.setTitle("notification 2");
        notification.setImg("");
        notifications.add(notification);

        notification.setTitle("notification 3");
        notification.setImg("");
        notifications.add(notification);

        return notifications;
    }


}
