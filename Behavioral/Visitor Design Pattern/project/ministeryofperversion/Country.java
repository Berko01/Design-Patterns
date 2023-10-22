package project.ministeryofperversion;
import java.util.ArrayList;
import java.util.List;

public class Country {
    private String name;
    private List<City> cityList;
    
    public Country(String name) {
        this.name = name;
        this.cityList = new ArrayList<>();
    }

    public void addCity(City city){
        cityList.add(city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCity() {
        return cityList;
    }

    public void setCity(List<City> cityList) {
        this.cityList = cityList;
    }

    


}
