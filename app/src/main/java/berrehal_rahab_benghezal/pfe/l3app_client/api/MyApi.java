package berrehal_rahab_benghezal.pfe.l3app_client.api;

import berrehal_rahab_benghezal.pfe.l3app_client.system.managers.NetworkManager;

/**
 * Created by berre on 5/8/2018.
 * Project : client_android_app.
 */
class MyApi {
    private static String ip = "192.168.1.5";
    protected static final String API_URL = "http://" + ip + ":8080/api/";
    protected final NetworkManager networkManager;

    MyApi() {
        this.networkManager = new NetworkManager();
    }

    protected boolean canConnect(){
        return this.networkManager.isConnectedToInternet();
    }
}
