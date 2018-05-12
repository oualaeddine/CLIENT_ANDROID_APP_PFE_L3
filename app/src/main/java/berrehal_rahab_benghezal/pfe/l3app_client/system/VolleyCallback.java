package berrehal_rahab_benghezal.pfe.l3app_client.system;

import android.net.Uri;

/**
 * Created by berre on 5/12/2018.
 * Project : client_android_app.
 */
public interface VolleyCallback {
    void onSuccess(String result);

    void onFailed(String result);

    interface UploadImgCallback {
        void onSuccess(Uri result);
    }
}

