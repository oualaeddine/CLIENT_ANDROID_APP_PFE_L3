package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.visites;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import berrehal_rahab_benghezal.pfe.l3app_client.R;


public class MesVisitesFragment extends Fragment {

    public static MesVisitesFragment newInstance() {
        return new MesVisitesFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mes_visites, container, false);
    }
}