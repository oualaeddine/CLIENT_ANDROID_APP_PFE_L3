package berrehal_rahab_benghezal.pfe.l3app_client.system.managers;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by berre on 5/10/2018.
 * Project : client_android_app.
 */
public class SharedPreferencesManager {
    private static final String
            PREF_NAME = "MasterPrefs",
            IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch",
            USER_ID = "api_url",
            USER_PASS = "app_id";
    private static final String IS_LOGGED_IN = "is_logged";

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private Context _context;

    // shared pref mode
    private int PRIVATE_MODE = 0;


    public SharedPreferencesManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public void setFirstTimeLaunch() {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, false);
        editor.commit();
    }

    public String getPassword() {
        return pref.getString(USER_PASS, "");
    }


    public void setPassword(String apiUrl) {
        editor.putString(USER_PASS, apiUrl);
        editor.commit();
    }

    public int getUserId() {
        return pref.getInt(USER_ID, 0);
    }

    public void setUserId(int userId) {
        editor.putInt(USER_ID, userId);
        editor.commit();
    }

    public boolean isLoggedIn() {
        return pref.getBoolean(IS_LOGGED_IN, false);
    }
}
