package berrehal_rahab_benghezal.pfe.l3app_client.system.model.util;

/**
 * Created by berre on 5/8/2018.
 * Project : client_android_app.
 */
public class MyCredentials {
    private String username, password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyCredentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
