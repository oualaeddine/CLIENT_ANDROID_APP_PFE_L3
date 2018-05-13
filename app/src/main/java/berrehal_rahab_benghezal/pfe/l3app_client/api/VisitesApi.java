package berrehal_rahab_benghezal.pfe.l3app_client.api;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

import berrehal_rahab_benghezal.pfe.l3app_client.MyApp;
import berrehal_rahab_benghezal.pfe.l3app_client.system.VolleyCallback;
import berrehal_rahab_benghezal.pfe.l3app_client.system.managers.SharedPreferencesManager;

/**
 * Created by berre on 5/8/2018.
 * Project : client_android_app.
 */
public class VisitesApi extends MyApi {


    public VisitesApi(Context context) {
        super(context);
    }

    public void getMyVisites(VolleyCallback callback) {
        Request req = new StringRequest(Request.Method.POST, GET_MY_VISITES_URL,
                response -> {
                    Log.e("getMyVisites", response);
                    callback.onSuccess(response);
                }, error -> {
            Log.e("getMyVisites", "error");
            callback.onFailed(error.toString());
        }) {
            @Override
            protected Map<String, String> getParams() {
                SharedPreferencesManager preferencesManager = new SharedPreferencesManager(context);
                Map<String, String> params = new HashMap<String, String>();
                params.put("userId", preferencesManager.getUserId() + "");
                params.put("password", preferencesManager.getPassword());
                params.put("action", "getMyVisites");
                params.put("type", "client");
                return params;
            }
        };
        MyApp.getApp().addToRequestQueue(req);

    }


}
