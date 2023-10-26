public class App {

    public static void main(String[] args) {

        

        Memory memory = new Memory();

        Notepad notePad = new Notepad();
        notePad.append("B");
        notePad.append("A");
        notePad.append("H");
        notePad.append("A");

        saveVersion(memory, notePad);

        notePad.append("DIR");

        saveVersion(memory, notePad);

        insertIncorrectDot(notePad);

        undo(memory, notePad);

        saveVersion(memory, notePad);

        notePad.append(" MEMISH"); // Changed " MEMİŞ" to " MEMISH" for correct English pronunciation

        saveVersion(memory, notePad);

        insertIncorrectDot(notePad);

        undo(memory, notePad);
        undo(memory, notePad);
        undo(memory, notePad);

    }

    private static void undo(Memory memory, Notepad notePad) {
        notePad.restore(memory.getLatestVersion());
        notePad.print();
    }

    private static void insertIncorrectDot(Notepad notePad) {
        notePad.append(".");
        notePad.print();
    }

    private static void saveVersion(Memory memory, Notepad notePad) {
        NotePadMemento memento = notePad.save();
        memory.add(memento);

        notePad.print();
    }
}
