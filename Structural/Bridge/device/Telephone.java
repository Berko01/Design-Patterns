package device;

import music.Music;
import musicPlayer.MusicPlayer;
import soundDevice.SoundDevice;

public class Telephone extends ComputerThatCanPlayMusic {

    public Telephone(SoundDevice soundDevice, MusicPlayer musicPlayer){
        super(soundDevice, musicPlayer);
    }

    @Override
    public void playMusic(Music music) {
        System.out.println("Telefon muzik caliyor.");
        super.playMusic(music);
    }
    
}
