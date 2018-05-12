package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.visites;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.R;
import berrehal_rahab_benghezal.pfe.l3app_client.api.VisitesApi;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.MyVisite;


public class MesVisitesFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static MesVisitesFragment newInstance() {
        return new MesVisitesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mes_visites, container, false);
        //get data from server
        LinkedList<MyVisite> notifications = new VisitesApi().getMyVisites();
        //init adapter with data
        VisitesAdapter visitesAdapter = new VisitesAdapter(getContext());
        visitesAdapter.setData(notifications);
        //init racycler view
        RecyclerView recyclerView = rootView.findViewById(R.id.rv_visites);
        //setup recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(visitesAdapter);

        return rootView;
    }
}