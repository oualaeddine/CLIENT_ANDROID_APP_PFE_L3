package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.logements;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import berrehal_rahab_benghezal.pfe.l3app_client.R;


public class MesLogementsFragment extends Fragment {
    public static MesLogementsFragment newInstance() {
        return new MesLogementsFragment();
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
