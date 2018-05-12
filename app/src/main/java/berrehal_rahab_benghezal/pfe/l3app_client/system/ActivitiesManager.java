package berrehal_rahab_benghezal.pfe.l3app_client.system;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import berrehal_rahab_benghezal.pfe.l3app_client.ui.activities.MainActivity;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.activities.PostSignupActivity;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.activities.auth.LoginActivity;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.activities.auth.SignupActivity;

/**
 * Created by berre on 5/12/2018.
 * Project : client_android_app.
 */
public class ActivitiesManager {
    private String TAG = "ActivityManager";
    private Context context;

    public ActivitiesManager(Context context) {
        this.context = context;
    }

    public void startSignup() {
        Intent ii = new Intent(context, SignupActivity.class);
        ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(ii);

    }

    public void startLogin() {
        Intent ii = new Intent(context, LoginActivity.class);
        ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(ii);
    }

    public void startMain() {
        Intent ii = new Intent(context, MainActivity.class);
        ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(ii);
    }

    public void startPostSignup() {
        Intent ii = new Intent(context, PostSignupActivity.class);
        ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        ii.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(ii);
        ((AppCompatActivity) context).finish();
    }

}
