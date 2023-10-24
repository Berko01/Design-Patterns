
public class App {

    public static void main(String[] args) {

        System.out.println("-------------------");
        printSort(EnumTrack.SCIENCEMATHEMATICS);
        System.out.println("-------------------");
        printSort(EnumTrack.BALANCED);
        System.out.println("-------------------");
        printSort(EnumTrack.LANGUAGEHUMANITIES);
        System.out.println("-------------------");

    }

    private static void printSort(EnumTrack track) {
        Student student = new Student(track);
        String priorityOrder= student.getPriorityOrder();
        System.out.println(priorityOrder);
    }
}