package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.logements;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.R;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.Logement;

/**
 * Created by berre on 5/12/2018.
 * Project : client_android_app.
 */
public class LogementsAdapter extends RecyclerView.Adapter<LogementViewHolder> {
    private final Context context;
    private LinkedList<Logement> data;

    LogementsAdapter(Context context) {
        this.context = context;
    }

    @Override
    public LogementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_logement, parent, false);

        return new LogementViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LogementViewHolder holder, int position) {
        Logement current = data.get(position);
        holder.getTitle().setText(current.getTitre());
        holder.getPrix().setText(current.getPrix() + "0 Da");
        holder.getDescription().setText(current.getDescription());
        //    Glide.with(context).load(current.getImg()).into(holder.getImg());
    }

    @Override
    public int getItemCount() {
        if (data == null)
            return 0;
        else
            return data.size();
    }

    public void setData(LinkedList<Logement> data) {
        this.data = data;
    }
}
