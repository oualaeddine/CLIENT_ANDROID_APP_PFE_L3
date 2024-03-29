package berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans;


import java.util.Date;

import berrehal_rahab_benghezal.pfe.l3app_client.system.model.enums.EtatClient;

public class Rapport {
    private Visite visite;
    private EtatClient etatClient;
    private String commentaire;
    private boolean avis;
    private int id;
    private Date dateEtabli;

    // TODO: 4/26/2018 add an id
    public Rapport() {
    }

    public boolean isAvis() {
        return avis;
    }

    public void setAvis(boolean avis) {
        this.avis = avis;
    }

    public Visite getVisite() {
        return visite;
    }

    public void setVisite(Visite visite) {
        this.visite = visite;
    }

    public EtatClient getEtatClient() {
        return etatClient;
    }

    public void setEtatClient(EtatClient etatClient) {
        this.etatClient = etatClient;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getId() {
        return id;
    }

    public String getEtatClientString() {
        switch (etatClient) {
            case PRESENT:
                return "present";
            case ABSENT:
                return "absent";
            default:
                return null;
        }
    }

    public Date getDateEtabli() {
        return dateEtabli;
    }
}
