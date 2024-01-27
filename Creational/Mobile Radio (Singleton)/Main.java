public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        Chanel chanel1 = new Chanel("KanalD", "KanalD.com");
        Chanel chanel2 = new Chanel("Fox", "Fox.com");

        ChanelActivity chanelActivity = new ChanelActivity();
        MediaActivity mediaActivity = new MediaActivity();

        chanelActivity.onCreate();
        chanelActivity.addChanel(chanel2);
        chanelActivity.addChanel(chanel1);

        mediaActivity.onCreate();

        mediaActivity.choiceChanel(chanel2);
        mediaActivity.play();
        Thread.sleep(5000);
        mediaActivity.choiceChanel(chanel1);
        Thread.sleep(5000);
        mediaActivity.pause();

        
    }
}
