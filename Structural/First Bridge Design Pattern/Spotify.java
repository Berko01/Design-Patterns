public class Spotify {
    public String playMusic(Music music){
        System.out.println("Spotify "+ music + " sarkisini caliyor.");
        return music.getSound();
    }
}
