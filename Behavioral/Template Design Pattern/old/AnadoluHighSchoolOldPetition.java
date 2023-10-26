package old;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnadoluHighSchoolOldPetition {

    private String studentClass;
    private String number;
    private String name;

    public AnadoluHighSchoolOldPetition(String studentClass, String number, String name) {
        this.studentClass = studentClass;
        this.number = number;
        this.name = name;
    }

    public void printRequest() {
        System.out.println(requestText());
    }

    private String requestText() {

        StringBuilder requestText = new StringBuilder();

        String formattedDate = getFormattedDate();

        requestText.append("**************************************************************************");
        requestText.append("\n");
        requestText.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + formattedDate);
        requestText.append("\n");
        requestText.append("\t\t\t\t" + "To the Principal of Çankırı Anatolian High School");
        requestText.append("\n");
        requestText.append("\t\t\t\t\t\t\t\t\t\t\t\t" + "Çankırı");
        requestText.append("\n");
        requestText.append("\t");
        requestText.append("I am a student in your school, currently in the " + studentClass  + " class with student number " + number);
        requestText.append("\n");
        requestText.append("I kindly request information about my attendance for the first academic year of " + "2020" + ".\n");
        requestText.append("Yours sincerely.");

        requestText.append("\n\n");

        requestText.append("\t\t\t\t\t\t\t\t\t\t\t\t" + name);
        requestText.append("\n");
        requestText.append("**************************************************************************");

        return requestText.toString();
    }



    private String getFormattedDate() {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        return format.format(new Date());
    }
}