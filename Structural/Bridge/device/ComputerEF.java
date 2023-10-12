package device;

import music.Music;
import musicPlayer.Fizy;
import soundDevice.Earphones;

public class ComputerEF extends ComputerThatCanPlayMusic {

    public ComputerEF(){
        soundDevice = new Earphones();
        musicPlayer = new Fizy();
    }

    @Override
    public void playMusic(Music music) {
            System.out.println("Kulaklik ve Fizy bulunduran bilgisayar calisti.");
            super.playMusic(music);
        }
    
    
}
