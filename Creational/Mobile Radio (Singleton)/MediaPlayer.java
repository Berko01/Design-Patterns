public class MediaPlayer implements Runnable {

    private Chanel chanel;
    private boolean control;
    private static MediaPlayer mediaPlayer;


    private MediaPlayer(){
        control = true;
    }

    public static MediaPlayer getMediaPlayer(){

        if(mediaPlayer == null)
        {
            return new MediaPlayer();
        }
            

        return mediaPlayer;
    }

    public void stop(){
        control = false;
    }

    public void start(){
        control = true;
        new Thread(this).start();
    }

    public void choiceChanel(Chanel chanel){
        setChanel(chanel);
    }
    @Override
    public void run() {
       while(control){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println(chanel.getIsim() + "-" + chanel.getLink());
       }
        
    }

    public Chanel getChanel() {
        return chanel;
    }

    public void setChanel(Chanel chanel) {
        this.chanel = chanel;
    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }
    
}
