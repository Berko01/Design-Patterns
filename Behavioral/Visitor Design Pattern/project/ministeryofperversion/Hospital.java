package project.ministeryofperversion;
import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Patient> patientList;
    public Hospital(String name) {
        this.name = name;
        this.patientList = new ArrayList<>();
    }

    public String accept(Visitor visitor){
        return visitor.visitHospital(this);

    }

    public void addPatient(Patient patient){
        patientList.add(patient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }


    
    
}
