package berrehal_rahab_benghezal.pfe.l3app_client.api;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

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
public class LogementsApi extends MyApi {

    public LogementsApi(Context context) {
        super(context);
    }

    public void getLogementById(final VolleyCallback callback, int logementId) {
        Request req = new StringRequest(Request.Method.POST, GET_MY_LOGEMENTS_URL,
                response -> {
                    Log.e("getLogementById", response);
                    callback.onSuccess(response);
                }, error -> {
            Log.e("getLogementById", "error");
            callback.onFailed(error.toString());
        }) {
            @Override
            protected Map<String, String> getParams() {
                SharedPreferencesManager preferencesManager = new SharedPreferencesManager(context);
                Map<String, String> params = new HashMap<String, String>();
                params.put("userId", preferencesManager.getUserId() + "");
                params.put("password", preferencesManager.getPassword());
                params.put("logementId", "" + logementId);
                params.put("action", "getLogementById");
                params.put("type", "client");
                return params;
            }
        };
        if (canConnect())
            MyApp.getApp().addToRequestQueue(req);
        else
            Toast.makeText(context, "probleme internet", Toast.LENGTH_SHORT).show();
    }

    public void getMyLogements(final VolleyCallback callback) {
        Request req = new StringRequest(Request.Method.POST, GET_MY_LOGEMENTS_URL,
                response -> {
                    Log.e("getMyLogements", response);
                    callback.onSuccess(response);
                }, error -> {
            Log.e("getMyLogements", "error");
            callback.onFailed(error.toString());
        }) {
            @Override
            protected Map<String, String> getParams() {
                SharedPreferencesManager preferencesManager = new SharedPreferencesManager(context);
                Map<String, String> params = new HashMap<String, String>();
                params.put("userId", preferencesManager.getUserId() + "");
                params.put("password", preferencesManager.getPassword());
                params.put("action", "getMyLogements");
                params.put("type", "client");
                return params;
            }
        };
        if (canConnect())
            MyApp.getApp().addToRequestQueue(req);
        else
            Toast.makeText(context, "probleme internet", Toast.LENGTH_SHORT).show();
    }


}
