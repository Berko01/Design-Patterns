package musicPlayer;



import music.Music;

public class Fizy implements MusicPlayer {
    
    public String playMusic(Music music){
        System.out.println("Fizy " + music + " sarkisini caliyor.");
        return music.getSound();
    }

}
