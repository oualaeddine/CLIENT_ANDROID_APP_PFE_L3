package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.visites;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.R;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.my.MyVisite;

/**
 * Created by berre on 5/12/2018.
 * Project : client_android_app.
 */
public class VisitesAdapter extends RecyclerView.Adapter<VisiteViewHolder> {
    private final Context context;
    private LinkedList<MyVisite> data;

    VisitesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public VisiteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_visite, parent, false);

        return new VisiteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VisiteViewHolder holder, int position) {
        MyVisite current = data.get(position);

        holder.getId().setText("" + current.getId());
        holder.getIdLogement().setText("" + current.getIdLogement());
        holder.getIdAgent().setText("" + current.getIdAgent());
        holder.getAgentFullName().setText(current.getAgentFullName());
        holder.getDate().setText(current.getDate());
        holder.getTime().setText(current.getTime());

    }

    @Override
    public int getItemCount() {
        if (data == null)
            return 0;
        else
            return data.size();
    }

    public void setData(LinkedList<MyVisite> data) {
        this.data = data;
    }
}
