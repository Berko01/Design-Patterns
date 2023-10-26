package new2;

import java.util.Date;

public class ScienceHighSchoolOldPetition extends AbsenteeismPetition {
    
    private String studentClass;
    private String number;
    private String name;
    private String branch;
    
    public ScienceHighSchoolOldPetition(String studentClass, String number, String name, String branch) {
        this.studentClass = studentClass;
        this.number = number;
        this.name = name;
        this.branch = branch;
    }

@Override
public Date getDate() {
    return new Date();
}

@Override
public String getInstitutionName() {
    return "Çankırı Fen High School";
}

@Override
public String getCity() {
    return "Çankırı";
}

@Override
public String getClassroomName() {
    return studentClass + " Science-" + branch;
}

@Override
public String getStudentNumber() {
    return "91";
}

@Override
public String getAcademicYear() {
    return "2020";
}

@Override
public String getSemester() {
    return "Second";
}

@Override
public String getStudentFullName() {
    return name;
}
}
