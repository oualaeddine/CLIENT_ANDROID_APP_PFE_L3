package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.visites;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import berrehal_rahab_benghezal.pfe.l3app_client.R;

/**
 * Created by berre on 5/12/2018.
 * Project : client_android_app.
 */
public class VisiteViewHolder extends RecyclerView.ViewHolder {

    private TextView id, idAgent, idLogement, date, time, agentFullName;

    public VisiteViewHolder(View view) {
        super(view);
        id = view.findViewById(R.id.tv_item_visite_id_visite);
        idAgent = view.findViewById(R.id.tv_item_visite_id_agent);
        idLogement = view.findViewById(R.id.tv_item_visite_id_logement);
        date = view.findViewById(R.id.tv_item_visite_date);
        time = view.findViewById(R.id.tv_item_visite_horraire);
        agentFullName = view.findViewById(R.id.tv_item_visite_agent_full_name);
    }

    public TextView getId() {
        return id;
    }

    public TextView getIdAgent() {
        return idAgent;
    }

    public TextView getIdLogement() {
        return idLogement;
    }

    public TextView getDate() {
        return date;
    }

    public TextView getTime() {
        return time;
    }

    public TextView getAgentFullName() {
        return agentFullName;
    }
}
