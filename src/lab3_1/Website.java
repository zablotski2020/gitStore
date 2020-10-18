package lab3_1;

public class Website {
    protected String name;
    protected boolean adCheck;
    int userCount;

    public Website (String name, boolean adCheck) {
        this.name = name;
        this.adCheck = adCheck;
    }
    public Website () {
        super();
    }
    /*public  Website (boolean adCheck) {
        name = "Nameless";
        this.adCheck = adCheck;
    }*/
    public  String getName() {
        return name;
    }
    public  boolean getCheck() {
        return adCheck;
    }
    public int popularity() {
        return userCount;
    }
}
