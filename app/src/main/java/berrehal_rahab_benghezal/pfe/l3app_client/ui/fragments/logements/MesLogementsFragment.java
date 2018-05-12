package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.logements;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.R;
import berrehal_rahab_benghezal.pfe.l3app_client.api.LogementsApi;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.Logement;


public class MesLogementsFragment extends Fragment {
    public static MesLogementsFragment newInstance() {
        Log.e("MesLogementsFragment", "newInstance");

        return new MesLogementsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("MesLogementsFragment", "onCreate");

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("MesLogementsFragment", "onCreateView");

        View rootView = inflater.inflate(R.layout.fragment_mes_logements, container, false);
        //get data from server
        LinkedList<Logement> notifications = new LogementsApi().getMyLogements();
        //init adapter with data
        LogementsAdapter logementsAdapter = new LogementsAdapter(getContext());
        logementsAdapter.setData(notifications);
        //init racycler view
        RecyclerView recyclerView = rootView.findViewById(R.id.rv_logements);
        //setup recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(logementsAdapter);

        return rootView;
    }
}
