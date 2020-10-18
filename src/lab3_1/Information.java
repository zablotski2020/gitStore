package lab3_1;

public class Information extends Website{
    private int newsCount;
    private  int rateUpdate;

    public Information(String name, boolean adCheck, int newsCount, int rateUpdate) {
        super(name, adCheck);
        this.newsCount = newsCount;
        this.rateUpdate = rateUpdate;
    }
    public Information(String name, boolean adCheck) {
        super(name, adCheck);
        newsCount = 25;
        rateUpdate = 2;
    }
    public Information() {
        super();
        newsCount = 0;
        rateUpdate = 0;
    }
    public int GetNewsCount() {
        return  newsCount;
    }
    public int getRateUpdate() {
        return rateUpdate;
    }

    @Override
    public int popularity() {
        userCount = 4;
        return  userCount;
    }
}
