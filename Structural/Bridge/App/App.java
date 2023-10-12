package App;

import device.Computer;
import device.ComputerEF;
import device.Telephone;
import music.Music;
import musicPlayer.Fizy;
import musicPlayer.Spotify;
import soundDevice.Earphones;
import soundDevice.Speaker;

public class App {

    public static void main(String[] args) {
        Music music = new Music("Sezen Aksu - Gulumse", "Gulumse hadi gulumse");
        ComputerEF computerEF = new ComputerEF();
        computerEF.playMusic(music);
        

        System.out.println("***********************************************");

        Telephone telephone = new Telephone(new Earphones(), new Fizy());

        Telephone telephone2 = new Telephone(new Earphones(), new Spotify());

        Computer computer = new Computer(new Speaker(), new Spotify());

        

        System.out.println();

        telephone.playMusic(music);

        System.out.println();

        telephone2.playMusic(music);

        System.out.println();

        computer.playMusic(music);
        
    }
    
}
