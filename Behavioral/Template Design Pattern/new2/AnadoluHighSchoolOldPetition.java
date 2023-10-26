package new2;
import java.text.SimpleDateFormat;
import java.util.Date;


public class AnadoluHighSchoolOldPetition extends AbsenteeismPetition {
    private String studentClass;
    private String number;
    private String name;
    
    public AnadoluHighSchoolOldPetition(String studentClass, String number, String name) {
        this.studentClass = studentClass;
        this.number = number;
        this.name = name;
    }
    
    @Override
    public Date getDate() {
        return new Date();
    }
    
    @Override
    public String getInstitutionName() {
        return "Çankırı Anatolian High School";
    }
    
    @Override
    public String getCity() {
        return "Çankırı";
    }
    
    @Override
    public String getClassroomName() {
        return "12 Science-A";
    }
    
    @Override
    public String getStudentNumber() {
        return "1093";
    }
    
    @Override
    public String getAcademicYear() {
        return "2020";
    }
    
    @Override
    public String getSemester() {
        return "First";
    }
    
    @Override
    public String getStudentFullName() {
        return name;
    
    
}
}
