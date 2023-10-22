package project.transactions;

import java.util.List;



import project.ministeryofperversion.City;
import project.ministeryofperversion.Country;
import project.ministeryofperversion.EnumIlness;
import project.ministeryofperversion.EnumPatientCondition;
import project.ministeryofperversion.Hospital;
import project.ministeryofperversion.Visitor;

public class NumberOfCovidPneumoniasVisitor implements Visitor{


    @Override
    public String visitHospital(Hospital hospital) {
        int numberOfPatients = calculateNumberOfPatients(hospital);

        return String.valueOf(numberOfPatients);
    }

    private int calculateNumberOfPatients(Hospital hospital) {
        return CalculateNumberOfPatientUtil.calculateNumberOfPatients(hospital, EnumIlness.COVID, EnumPatientCondition.PNEUMONIA);
        
    }

    @Override
    public String visitCity(City city) {
        int numberOfPatients = calculateNumberOfPatients(city);

        return String.valueOf(numberOfPatients);
    }

    private int calculateNumberOfPatients(City city) {

        List<Hospital> hospitalList = city.getHospitalList();

        int numberOfPatients = 0;
        for(Hospital hospital: hospitalList){
            int eachNumberOfPatients = calculateNumberOfPatients(hospital);
            numberOfPatients += eachNumberOfPatients;
        }
        return numberOfPatients;
    }

    @Override
    public String visitCountry(Country country) {
        int numberOfPatients = calculateNumberOfPatients(country);

        return String.valueOf(numberOfPatients);
    }

    private int calculateNumberOfPatients(Country country) {
        List<City> cityList = country.getCityList();

        int numberOfPatients = 0; 
        for(City city: cityList){
            int eachNumberOfPatients = calculateNumberOfPatients(city);
            numberOfPatients += eachNumberOfPatients;
        }

        return numberOfPatients;


    
}
}
