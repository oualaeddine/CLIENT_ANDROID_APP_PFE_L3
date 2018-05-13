package berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.my;

import berrehal_rahab_benghezal.pfe.l3app_client.system.model.enums.EtatVisite;

/**
 * Created by berre on 5/12/2018.
 * Project : client_android_app.
 */
public class MyVisite {

    private int id, idAgent, idLogement;
    private String date, time, agentFullName;
    private EtatVisite state;

    public MyVisite() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public int getIdLogement() {
        return idLogement;
    }

    public void setIdLogement(int idLogement) {
        this.idLogement = idLogement;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAgentFullName() {
        return agentFullName;
    }

    public void setAgentFullName(String agentFullName) {
        this.agentFullName = agentFullName;
    }

    public void setState(EtatVisite state) {
        this.state = state;
    }
}
