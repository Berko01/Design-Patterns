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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumIlness getIlness() {
        return ilness;
    }

    public void setIlness(EnumIlness ilness) {
        this.ilness = ilness;
    }

    public EnumPatientCondition getCondition() {
        return condition;
    }

    public void setCondition(EnumPatientCondition condition) {
        this.condition = condition;
    }
    

}