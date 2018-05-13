package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.visites;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.R;
import berrehal_rahab_benghezal.pfe.l3app_client.api.VisitesApi;
import berrehal_rahab_benghezal.pfe.l3app_client.system.VolleyCallback;
import berrehal_rahab_benghezal.pfe.l3app_client.system.util.JsonUtil;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.Myfragment;


public class MesVisitesFragment extends Fragment implements Myfragment {
    View rootView;

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
        rootView = inflater.inflate(R.layout.fragment_mes_visites, container, false);
        initData();
        return rootView;
    }

    @Override
    public void initData() {
        //get data from server
        new VisitesApi(getContext()).getMyVisites(new VolleyCallback() {
            @Override
            public void onSuccess(String result) {
                try {
                    JSONArray jsonVisites = new JSONArray(result);
                    initRecycler(JsonUtil.jsonVisitesToList(jsonVisites));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailed(String result) {

            }
        });
    }

    @Override
    public void initRecycler(LinkedList visites) {
        //init adapter with data
        VisitesAdapter visitesAdapter = new VisitesAdapter(getContext());
        visitesAdapter.setData(visites);
        //init racycler view
        RecyclerView recyclerView = rootView.findViewById(R.id.rv_visites);
        //setup recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(visitesAdapter);
    }
}