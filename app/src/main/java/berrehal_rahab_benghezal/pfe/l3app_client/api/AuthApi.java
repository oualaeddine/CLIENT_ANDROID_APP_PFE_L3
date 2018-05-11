package berrehal_rahab_benghezal.pfe.l3app_client.api;

import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.humans.Client;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.util.MyCredentials;

/**
 * Created by berre on 5/8/2018.
 * Project : client_android_app.
 */
public class AuthApi extends MyApi {
    public boolean login(MyCredentials credentials) {
        return true;
    }

    public void signup(Client client) {
    }
}
