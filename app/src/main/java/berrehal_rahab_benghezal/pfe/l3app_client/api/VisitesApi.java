package berrehal_rahab_benghezal.pfe.l3app_client.api;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.system.model.MyVisite;

/**
 * Created by berre on 5/8/2018.
 * Project : client_android_app.
 */
public class VisitesApi extends MyApi {

    public LinkedList<MyVisite> getMyVisites() {
        LinkedList<MyVisite> visites = new LinkedList<>();
// TODO: 5/12/2018 remplace dummy data with data from server

        MyVisite myVisite = new MyVisite();
        myVisite.setId(9562);
        myVisite.setIdLogement(2566);
        myVisite.setIdAgent(256526);
        myVisite.setAgentFullName("Taher boulhwayj");
        myVisite.setDate("15/05/2018");
        myVisite.setTime("de 8:00 à 10:00");

        visites.add(myVisite);


        myVisite.setId(956852852);
        myVisite.setIdLogement(2566);
        myVisite.setIdAgent(256526);
        myVisite.setAgentFullName("Taher bouldjaj");
        myVisite.setDate("15/05/2018");
        myVisite.setTime("de 10:00 à 12:00");

        visites.add(myVisite);

        myVisite.setId(95622222);
        myVisite.setIdLogement(2566);
        myVisite.setIdAgent(256526);
        myVisite.setAgentFullName("Taher boul3dam");
        myVisite.setDate("15/05/2018");
        myVisite.setTime("de 14:00 à 16:00");
        visites.add(myVisite);

        myVisite.setId(95622222);
        myVisite.setIdLogement(2566);
        myVisite.setIdAgent(256526);
        myVisite.setAgentFullName("Taher boucheham");
        myVisite.setDate("16/05/2018");
        myVisite.setTime("de 14:00 à 16:00");

        visites.add(myVisite);

        return visites;
    }


}
