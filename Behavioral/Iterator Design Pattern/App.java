import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        Book book = new Book("Math");

        Fascicle fascicle = new Fascicle("Turkish");

        Iterator questionIteratorBook = book.getQuestionIterator();
        Iterator questionIteratorFascicle = fascicle.getQuestionIterator();

        printQuestions(questionIteratorBook);
        printQuestions(questionIteratorFascicle);
    }

    private static void printQuestions(Iterator questionIterator) {
        while (questionIterator.hasNext()) {
            Question question = (Question) questionIterator.next();

            Long questionNumber = question.getQuestionNumber();

            System.out.println("Question Number: " + questionNumber);
        }
    }
}
