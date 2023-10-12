package device;

import musicPlayer.MusicPlayer;
import soundDevice.SoundDevice;
import music.Music;
public abstract class ComputerThatCanPlayMusic {
    protected SoundDevice soundDevice;
    protected MusicPlayer musicPlayer;

    

    public ComputerThatCanPlayMusic(SoundDevice soundDevice, MusicPlayer musicPlayer) {
        this.soundDevice = soundDevice;
        this.musicPlayer = musicPlayer;
    }

    public ComputerThatCanPlayMusic () {

    }

    void playMusic (Music music){
    
        String sound =  musicPlayer.playMusic(music);
        soundDevice.playSound(sound);
     
        
    }


}

