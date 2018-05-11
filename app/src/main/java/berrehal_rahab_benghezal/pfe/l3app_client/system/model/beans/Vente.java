package berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans;


import java.io.Serializable;
import java.util.Date;

import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.humans.Client;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.enums.EtatVente;

public class Vente implements Serializable {
    private int id;
    private Date date;
    private Logement logement;
    private Client client;
    private EtatVente etatVente;

    public Vente() {

    }

    public EtatVente getEtatVente() {
        return etatVente;
    }

    public void setEtatVente(EtatVente etatVente) {
        this.etatVente = etatVente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Logement getLogement() {
        return logement;
    }

    public void setLogement(Logement logement) {
        this.logement = logement;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Vente{" +
                "id=" + id +
                ", date=" + date +
                ", logement=" + logement +
                ", client=" + client +
                ", etatVente=" + etatVente +
                '}';
    }
}
