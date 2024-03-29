package berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.humans;

public class Client extends Person {
    private boolean isBanned;


    public Client() {
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    public String isBannedString() {
        if (isBanned)
            return "banned";
        else
            return "not banned";
    }

    @Override
    public String toString() {
        return "Client{" +
                "isBanned=" + isBanned +
                "} " + super.toString();
    }
}
