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

import org.json.JSONArray;
import org.json.JSONException;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.R;
import berrehal_rahab_benghezal.pfe.l3app_client.api.LogementsApi;
import berrehal_rahab_benghezal.pfe.l3app_client.system.VolleyCallback;
import berrehal_rahab_benghezal.pfe.l3app_client.system.util.JsonUtil;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.Myfragment;


public class MesLogementsFragment extends Fragment implements Myfragment {
    private View rootView;

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

        rootView = inflater.inflate(R.layout.fragment_mes_logements, container, false);
        initData();
        return rootView;
    }

    @Override
    public void initData() {
        //get data from server
        new LogementsApi(getContext()).getMyLogements(new VolleyCallback() {
            @Override
            public void onSuccess(String result) {
                try {
                    JSONArray jsonLogements = new JSONArray(result);
                    initRecycler(JsonUtil.jsonToLogementsList(jsonLogements));
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
    public void initRecycler(LinkedList logements) {
        //init adapter with data
        LogementsAdapter logementsAdapter = new LogementsAdapter(getContext());
        logementsAdapter.setData(logements);
        //init racycler view
        RecyclerView recyclerView = rootView.findViewById(R.id.rv_logements);
        //setup recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(logementsAdapter);
    }


}
