package berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans;


import berrehal_rahab_benghezal.pfe.l3app_client.system.model.beans.humans.Person;

public class Message {        // TODO: 2/18/2018
    private int id;
    private String content;
    private Person sender,receiver;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getReceiver() {
        return receiver;
    }

    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }
}
