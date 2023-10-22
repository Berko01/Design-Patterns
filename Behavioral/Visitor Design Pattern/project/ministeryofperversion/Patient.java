package project.ministeryofperversion;
public class Patient{
    private String name;
    private EnumIlness ilness;
    private EnumPatientCondition condition;
    
    public Patient(String name, EnumIlness ilness, EnumPatientCondition condition) {
        this.name = name;
        this.ilness = ilness;
        this.condition = condition;
    }
    

}