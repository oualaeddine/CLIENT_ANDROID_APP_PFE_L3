package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.map;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import berrehal_rahab_benghezal.pfe.l3app_client.R;

/**
 * Created by berre on 5/11/2018.
 * Project : client_android_app.
 */
public class MyMapFragment extends Fragment {

    public static MyMapFragment newInstance() {
        return new MyMapFragment();
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