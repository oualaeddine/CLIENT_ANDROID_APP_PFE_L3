package berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans;


import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.humans.Client;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.humans.Employe;

public class Signalement {
    private Employe plaignant;
    private Client client;
    private String motif;

    public Signalement() {
    }

    public Employe getPlaignant() {
        return plaignant;
    }

    public void setPlaignant(Employe plaignant) {
        this.plaignant = plaignant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
}
