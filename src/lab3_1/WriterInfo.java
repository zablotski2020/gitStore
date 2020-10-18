package lab3_1;

public class WriterInfo {

    public static void main(String[] args) {
	 SocialNetwork sc1 = new SocialNetwork("VK", true,true);
	 SocialNetwork sc2 = new SocialNetwork("Ok", true);
	 SocialNetwork sc3 = new SocialNetwork ();

	    Information in1 = new Information("Wikipedia", false, 10,10 );
        Information in2 = new Information("RussiaToday", false );
        Information in3 = new Information();

            Educational ed1 = new Educational("NationalGeographic", true, "Nature");
            Educational ed2 = new Educational("CinemaArt", false);
            Educational ed3 = new Educational();

        System.out.println("\nSocial Network #1:\nName: "+sc1.getName()+"\nAdvertisment Check: "+sc1.getCheck()+
                            "\nPopularity: "+sc1.popularity()+ "\nApplication Check: " + sc1.getApCheck() +"\n-------------------");
        System.out.println("\nSocial Network #2:\nName: "+sc2.getName()+"\nAdvertisment Check: "+sc2.getCheck()+
                "\nPopularity: "+sc2.popularity()+"\nApplication Check: " + sc2.getApCheck() +"\n-------------------");
        System.out.println("\nSocial Network #3:\nName: "+sc3.getName()+"\nAdvertisment Check: "+sc3.getCheck()+
                "\nPopularity: "+sc3.popularity()+"\nApplication Check: " + sc3.getApCheck() +"\n-------------------");


        System.out.println("\nInformation #1:\nName: "+in1.getName()+"\nAdvertisment Check: "+in1.getCheck()
                +"\nNews count: "+ in1.GetNewsCount()+"\nUpdate Rate: "+in1.getRateUpdate()+
                "\nPopularity: "+in1.popularity()+"\n-------------------");
        System.out.println("\nInformation #2:\nName: "+in2.getName()+"\nAdvertisment Check: "+in2.getCheck()
                +"\nNews count: "+ in2.GetNewsCount()+"\nUpdate Rate: "+in2.getRateUpdate()+
                "\nPopularity: "+in2.popularity()+"\n-------------------");
        System.out.println("\nInformation #3:\nName: "+in3.getName()+"\nAdvertisment Check: "+in3.getCheck()
                +"\nNews count: "+ in3.GetNewsCount()+"\nUpdate Rate: "+in3.getRateUpdate()+
                "\nPopularity: "+in3.popularity()+"\n-------------------");

        System.out.println("\nEducational #1:\nName: "+ed1.getName()+"\nAdvertisment Check: "+ed1.getCheck()
                +"\nTopic: " + ed1.getTopic() +
                "\nPopularity: "+ed1.popularity()+"\n-------------------");
        System.out.println("\nEducational #2:\nName: "+ed2.getName()+"\nAdvertisment Check: "+ed2.getCheck()
                +"\nTopic: " + ed2.getTopic() +
                "\nPopularity: "+ed2.popularity()+"\n-------------------");
        System.out.println("\nEducational #3:\nName: "+ed3.getName()+"\nAdvertisment Check: "+ed3.getCheck()
                +"\nTopic: " + ed3.getTopic() +
                "\nPopularity: "+ed3.popularity()+"\n-------------------");


    }
}
