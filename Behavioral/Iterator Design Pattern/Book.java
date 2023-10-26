import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Book {

    private String title;
    private List<Question> questionList;

    public Book(String title) {
        this.title = title;
        this.questionList = new ArrayList<>();

        questionList.add(new Question(1L));
        questionList.add(new Question(2L));
        questionList.add(new Question(3L));
        questionList.add(new Question(4L));
        questionList.add(new Question(5L));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Iterator getQuestionIterator() {
        return questionList.iterator();
    }
}
