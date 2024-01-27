public class MediaActivity implements Activity{

    private static MediaPlayer mediaPlayer;
    

    public MediaActivity() {

        mediaPlayer = MediaPlayer.getMediaPlayer();
    }

   
    public void play() {
        
        mediaPlayer.start();
    }

    
    public void pause() {
        mediaPlayer.stop();
       
    }

    public void choiceChanel(Chanel chanel){
        mediaPlayer.choiceChanel(chanel);
    }



    @Override
    public void onCreate() {
        mediaPlayer = MediaPlayer.getMediaPlayer();
    }




    
}
