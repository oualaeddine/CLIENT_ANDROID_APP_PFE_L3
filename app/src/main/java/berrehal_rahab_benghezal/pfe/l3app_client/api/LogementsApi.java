package berrehal_rahab_benghezal.pfe.l3app_client.api;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.Logement;

/**
 * Created by berre on 5/8/2018.
 * Project : client_android_app.
 */
public class LogementsApi extends MyApi {
    public LogementsApi() {
        super();
    }

    public Logement getLogementById(int logementId) {
        return null;
    }

    public LinkedList<Logement> getMyLogements() {
        LinkedList<Logement> logements = new LinkedList<>();
        // TODO: 5/12/2018 remplace dummy data with data from server

        Logement logement = new Logement();

        logement.setTitre("logement 1");
        logement.setPrix(5000000);
        logement.setDescription("logement description lorem ipsum hwayj hwayj");
        logements.add(logement);
        logement.setTitre("logement 2");
        logement.setPrix(5000000);
        logement.setDescription("logement description lorem ipsum hwayj hwayj");
        logements.add(logement);
        logement.setTitre("logement 3");
        logement.setPrix(5000000);
        logement.setDescription("logement description lorem ipsum hwayj hwayj");
        logements.add(logement);
        logement.setTitre("logement 4");
        logement.setPrix(5000000);
        logement.setDescription("logement description lorem ipsum hwayj hwayj");
        logements.add(logement);

        return logements;
    }


}
