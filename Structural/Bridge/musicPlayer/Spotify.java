package musicPlayer;

import music.Music;

public class Spotify implements MusicPlayer {

    @Override
    public String playMusic(Music music) {
        System.out.println("Spotify " + music + " sarkisini caliyor.");
        return music.getSound();
    }
    
}
