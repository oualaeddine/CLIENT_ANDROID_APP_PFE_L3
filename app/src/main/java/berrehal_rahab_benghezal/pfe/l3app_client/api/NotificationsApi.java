package berrehal_rahab_benghezal.pfe.l3app_client.api;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

import berrehal_rahab_benghezal.pfe.l3app_client.MyApp;
import berrehal_rahab_benghezal.pfe.l3app_client.system.managers.SharedPreferencesManager;
import berrehal_rahab_benghezal.pfe.l3app_client.system.util.VolleyCallback;

/**
 * Created by berre on 5/8/2018.
 * Project : client_android_app.
 */
public class NotificationsApi extends MyApi {


    public NotificationsApi(Context context) {
        super(context);
    }

    public void getMyNotificationss(VolleyCallback callback) {
        Request req = new StringRequest(Request.Method.POST, GET_MY_NOTIFICATIONS_URL,
                response -> {
                    Log.e("getMyNotificationss", response);
                    callback.onSuccess(response);
                }, error -> {
            Log.e("getMyNotificationss", "error");
            callback.onFailed(error.toString());
        }) {
            @Override
            protected Map<String, String> getParams() {
                SharedPreferencesManager preferencesManager = new SharedPreferencesManager(context);
                Map<String, String> params = new HashMap<String, String>();
                params.put("userId", preferencesManager.getUserId() + "");
                params.put("password", preferencesManager.getPassword());
                params.put("action", "getMyNotifications");
                params.put("type", "client");
                return params;
            }
        };
        MyApp.getApp().addToRequestQueue(req);

    }


}
