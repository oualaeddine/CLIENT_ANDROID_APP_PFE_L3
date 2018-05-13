package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.notifications;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.R;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.my.MyNotification;

/**
 * Created by berre on 5/12/2018.
 * Project : client_android_app.
 */
public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsViewHolder> {
    private final Context context;
    private LinkedList<MyNotification> data;

    NotificationsAdapter(Context context) {
        this.context = context;
    }

    @Override
    public NotificationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_notification, parent, false);

        return new NotificationsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NotificationsViewHolder holder, int position) {
        MyNotification current = data.get(position);
        holder.getTitle().setText(current.getTitle());
        // Glide.with(context).load(current.getImg()).into(holder.getImg());
    }

    @Override
    public int getItemCount() {
        if (data == null)
            return 0;
        else
            return data.size();
    }

    public void setData(LinkedList<MyNotification> data) {
        this.data = data;
    }
}
