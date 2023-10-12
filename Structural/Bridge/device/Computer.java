package device;

import music.Music;
import musicPlayer.MusicPlayer;
import soundDevice.SoundDevice;

public class Computer extends ComputerThatCanPlayMusic{

    public Computer(SoundDevice soundDevice, MusicPlayer musicPlayer) {
        super(soundDevice, musicPlayer);
    }

    @Override
    public void playMusic(Music music) {
        System.out.println("Bilgisayar muzik caliyor.");
        super.playMusic(music);
    }
    
}
