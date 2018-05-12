package berrehal_rahab_benghezal.pfe.l3app_client.api;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

import berrehal_rahab_benghezal.pfe.l3app_client.MyApp;
import berrehal_rahab_benghezal.pfe.l3app_client.system.VolleyCallback;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.humans.Client;

/**
 * Created by berre on 5/8/2018.
 * Project : client_android_app.
 */
public class AuthApi extends MyApi {


    private String checkUserUrl = "";

    public void login(final VolleyCallback callback, String email, String password) {

        Request req = new StringRequest(Request.Method.POST, checkUserUrl,
                response -> {
                    Log.e("check Profile", response);
                    callback.onSuccess(response);
                }, error -> {
            Log.e("", "error");
            callback.onFailed(error.toString());
        }) {
            @Override
            protected Map<String, String> getParams() {

                Map<String, String> params = new HashMap<String, String>();
                params.put("email", email);
                params.put("password", password);
                return params;
            }
        };
        MyApp.getApp().addToRequestQueue(req);
    }


    public void signup(Client client) {
    }
}
