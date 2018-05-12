package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.notifications;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import berrehal_rahab_benghezal.pfe.l3app_client.R;

/**
 * Created by berre on 5/12/2018.
 * Project : client_android_app.
 */
class NotificationsViewHolder extends RecyclerView.ViewHolder {
    private ImageView img;
    private TextView title;

    NotificationsViewHolder(View view) {
        super(view);
        img = view.findViewById(R.id.iv_item_notification_icon);
        title = view.findViewById(R.id.tv_item_notification_title);
    }

    public ImageView getImg() {
        return img;
    }

    public TextView getTitle() {
        return title;
    }
}
