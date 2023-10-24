public enum EnumTrack {

    
    LANGUAGEHUMANITIES("Sözel"),
    SCIENCEMATHEMATICS("Sayısal"),
    BALANCED("Eşit Ağırlık"),
    ;

    private String track;

    EnumTrack(String track) {
        this.track = track;
    }

    @Override
    public String toString() {
        return track;
    }

}
