package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.logements;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import berrehal_rahab_benghezal.pfe.l3app_client.R;

/**
 * Created by berre on 5/12/2018.
 * Project : client_android_app.
 */
public class LogementViewHolder extends RecyclerView.ViewHolder {
    private ImageView img;
    private TextView title, prix, description;

    LogementViewHolder(View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.iv_item_logement_picture);
        title = itemView.findViewById(R.id.tv_item_logement_title);
        prix = itemView.findViewById(R.id.tv_item_logement_price);
        description = itemView.findViewById(R.id.tv_item_logement_description);
    }

    public ImageView getImg() {
        return img;
    }

    public TextView getTitle() {
        return title;
    }

    public TextView getPrix() {
        return prix;
    }

    public TextView getDescription() {
        return description;
    }
}
