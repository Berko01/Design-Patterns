package soundDevice;

public class Earphones implements SoundDevice {

    @Override
    public void playSound(String sound) {
        System.out.println("Kulaklik ses caliyor -> " + sound);
    }

}
