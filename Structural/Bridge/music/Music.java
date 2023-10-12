package music;


public class Music{
    private String name;
    private String sound;
    public Music(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    @Override
    public String toString() {
        return "Music [name=" + name + "]";
    }

    
}