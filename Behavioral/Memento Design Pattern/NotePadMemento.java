public class NotePadMemento {

    private String text;

    public NotePadMemento() {
        text = "";
    }

    public NotePadMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}