package lab3_1;

public class Educational extends Website {
    private String topic;

    public Educational(String name, boolean adCheck, String topic) {
        super(name, adCheck);
        this.topic = topic;
    }
    public Educational(String name, boolean adCheck) {
        super(name, adCheck);
        topic = "-";
    }
    public Educational() {
        super();
        topic = "idk";
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public int popularity() {
        userCount = 34;
        return userCount;
    }
}
