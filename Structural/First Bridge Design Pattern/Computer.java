public class Computer {

    private Spotify spotify;
    private Speaker speaker;

    public Computer(){
        this.spotify = new Spotify();
        this.speaker = new Speaker();
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void playMusic(Music music){
        String sound = spotify.playMusic(music);
        speaker.playSound(sound);
    }
    
}
