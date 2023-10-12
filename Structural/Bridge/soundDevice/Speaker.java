package soundDevice;


public class Speaker implements SoundDevice {

    @Override
    public void playSound(String sound) {
        System.out.println("Hoparlor ses caliyor -> " + sound);
    }


    
}
