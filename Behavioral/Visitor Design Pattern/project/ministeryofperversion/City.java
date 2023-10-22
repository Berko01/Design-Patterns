package project.ministeryofperversion;
import java.util.ArrayList;
import java.util.List;

public class City {

    private String name;
    private List<Hospital> hospitalList;

    public City(String name) {
        this.name = name;
        this.hospitalList = new ArrayList<>();
    }

    

    public void addHospital(Hospital hospital){
        hospitalList.add(hospital);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Hospital> getHospitalList() {
        return hospitalList;
    }
    public void setHospitalList(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    

    
    
}
