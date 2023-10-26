package new2;
import java.text.SimpleDateFormat;
import java.util.Date;



public abstract class AbsenteeismPetition{
    
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
        requestText.append("\t\t\t\tTo the Principal of " + getInstitutionName());
        requestText.append("\n");
        requestText.append("\t\t\t\t\t\t\t\t\t\t\t\t" + getCity());
        requestText.append("\n");
        requestText.append("\t");
        requestText.append("I am currently a student in your school, in the " + getClassroomName() + " class with student number " + getStudentNumber());
        requestText.append(".\n");
        requestText.append("I kindly request information about my attendance for the academic year " + getAcademicYear() + ".\n");
        requestText.append("I remain, with respect.");

        requestText.append("\n\n");

        requestText.append("\t\t\t\t\t\t\t\t\t\t\t\t" + getStudentFullName());
        requestText.append("\n");
        requestText.append("**************************************************************************");

        return requestText.toString();
    }

    private String getFormattedDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(getDate());
    }

    public abstract Date getDate();

    public abstract String getInstitutionName();

    public abstract String getCity();

    public abstract String getClassroomName();

    public abstract String getStudentNumber();

    public abstract String getAcademicYear();

    public abstract String getSemester();

    public abstract String getStudentFullName();

}