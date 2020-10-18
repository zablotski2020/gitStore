package lab3_1;

public class SocialNetwork extends Website {
    private boolean apCheck;

    public SocialNetwork(String name, boolean adCheck, boolean apCheck) {
        super(name, adCheck);
        this.apCheck = apCheck;
    }
    public SocialNetwork(String name, boolean adCheck) {
        super(name, adCheck);
        apCheck = false;
    }
    public SocialNetwork() {
        super();
        apCheck = true;
    }

    public boolean getApCheck() {
        return apCheck;
    }

    @Override
    public int popularity() {
        userCount = 100000000;
        return userCount;
    }
}
