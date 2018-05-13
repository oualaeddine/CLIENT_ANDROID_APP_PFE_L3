package berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.notifications;

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
import berrehal_rahab_benghezal.pfe.l3app_client.api.NotificationsApi;
import berrehal_rahab_benghezal.pfe.l3app_client.system.VolleyCallback;
import berrehal_rahab_benghezal.pfe.l3app_client.system.util.JsonUtil;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.Myfragment;

public class MesNotificationsFragment extends Fragment implements Myfragment {
    View rootView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static MesNotificationsFragment newInstance() {
        return new MesNotificationsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_mes_notifications, container, false);
        initData();

        return rootView;
    }

    public void initData() {
        //get data from server
        new NotificationsApi(getContext()).getMyNotificationss(new VolleyCallback() {
            @Override
            public void onSuccess(String result) {
                try {
                    JSONArray jsonNotifications = new JSONArray(result);
                    initRecycler(JsonUtil.jsonNotificationsToList(jsonNotifications));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailed(String result) {

            }
        });

    }

    public void initRecycler(LinkedList notifications) { //init adapter with data
        NotificationsAdapter notificationsAdapter = new NotificationsAdapter(getContext());
        notificationsAdapter.setData(notifications);
        //init racycler view
        RecyclerView recyclerView = rootView.findViewById(R.id.rv_notifications);
        //setup recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(notificationsAdapter);
    }
}
