package berrehal_rahab_benghezal.pfe.l3app_client.api;

import android.content.Context;

import berrehal_rahab_benghezal.pfe.l3app_client.system.managers.NetworkManager;

/**
 * Created by berre on 5/8/2018.
 * Project : client_android_app.
 */
class MyApi {

    private static final String
            ip = "127.0.0.1",
            API_URL = "http://" + ip + ":8080/api";

    static final String
            AUTH_API_URL = API_URL + "/authApi",
            GET_MY_LOGEMENTS_URL = API_URL + "/logementApi",
            GET_MY_VISITES_URL = API_URL + "/visiteApi",
            GET_MY_NOTIFICATIONS_URL = API_URL + "/notificationsApi";


    private final NetworkManager networkManager;
    public Context context;

    MyApi(Context context) {
        this.networkManager = new NetworkManager();
        this.context = context;
    }

    boolean canConnect() {
        return this.networkManager.isConnectedToInternet();
    }
}
