public class Notepad {

    private String text;

    public Notepad() {
        text = "";
    }

    public Notepad(String text) {
        this.text = text;
    }

    public void append(String appendedText){
        text = text + appendedText;
    }

    public NotePadMemento save(){
        return new NotePadMemento(text);
    }

    public void restore(NotePadMemento memento){
        text = memento.getText();
    }

    public void print(){
        System.out.println(text);
    }
}