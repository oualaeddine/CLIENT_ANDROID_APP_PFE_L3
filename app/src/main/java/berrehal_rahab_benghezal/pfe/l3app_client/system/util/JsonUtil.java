package berrehal_rahab_benghezal.pfe.l3app_client.system.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.LinkedList;

import berrehal_rahab_benghezal.pfe.l3app_client.system.model.MyVisite;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.Logement;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.MyNotification;

/**
 * Created by berre on 5/13/2018.
 * Project : client_android_app.
 */
public class JsonUtil {
    public static LinkedList<Logement> jsonToLogementsList(JSONArray jsonLogements) {
        LinkedList<Logement> logements = new LinkedList<>();

        for (int i = 0; i < jsonLogements.length(); i++) {
            try {
                JSONObject jsonLogement = jsonLogements.getJSONObject(i);

                Logement logement = new Logement();
                logement.setId(jsonLogement.getInt("id"));
                logement.setTitre(jsonLogement.getString("title"));
                logement.setPrix(jsonLogement.getDouble("price"));
                logement.setDescription(jsonLogement.getString("description"));

                logements.add(logement);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return logements;
    }

    public static LinkedList<MyNotification> jsonNotificationsToList(JSONArray jsonNotifications) {

        LinkedList<MyNotification> notifications = new LinkedList<>();

        for (int i = 0; i < jsonNotifications.length(); i++) {
            try {
                JSONObject jsonNotification = jsonNotifications.getJSONObject(i);

                MyNotification myNotification = new MyNotification();
                myNotification.setId(jsonNotification.getInt("id"));
                myNotification.setTitle(jsonNotification.getString("title"));
                notifications.add(myNotification);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return notifications;
    }

    public static LinkedList<MyVisite> jsonVisitesToList(JSONArray jsonVisites) {

        LinkedList<MyVisite> visites = new LinkedList<>();

        for (int i = 0; i < jsonVisites.length(); i++) {
            try {
                JSONObject jsonLogement = jsonVisites.getJSONObject(i);

                MyVisite visite = new MyVisite();
                visite.setId(jsonLogement.getInt("id"));
                visite.setIdLogement(jsonLogement.getInt("logementId"));
                visite.setIdAgent(jsonLogement.getInt("agentId"));
                visite.setAgentFullName(jsonLogement.getString("agentFullName"));
                visite.setTime(jsonLogement.getString("time"));
                visite.setDate(jsonLogement.getString("date"));
                visite.setState(Util.etatVisiteFromString(jsonLogement.getString("etat")));

                visites.add(visite);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return visites;
    }
}
