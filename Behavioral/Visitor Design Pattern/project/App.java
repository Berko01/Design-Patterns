package project;

import project.ministeryofperversion.City;
import project.ministeryofperversion.Country;
import project.ministeryofperversion.EnumIlness;
import project.ministeryofperversion.EnumPatientCondition;
import project.ministeryofperversion.Hospital;
import project.ministeryofperversion.Patient;
import project.transactions.NumberOfCovidDeathsVisitor;
import project.transactions.NumberOfCovidPatientsVisitor;
import project.transactions.NumberOfCovidGotBetterVisitor;
import project.transactions.NumberOfCovidPneumoniasVisitor;
import project.transactions.NumberOfSeriouslyIllPatientsWithCovid;

public class App {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Ahmet", EnumIlness.COVID, EnumPatientCondition.SERIOUSLY_ILL);
        Patient patient2 = new Patient("Mehmet", EnumIlness.COVID, EnumPatientCondition.GOT_BETTER);
        Patient patient3 = new Patient("Fatma", EnumIlness.COVID, EnumPatientCondition.DEATH);
        Patient patient4 = new Patient("Nese", EnumIlness.COVID, EnumPatientCondition.PNEUMONIA);

        Hospital hospital1 = new Hospital("Capa");

        hospital1.addPatient(patient1);
        hospital1.addPatient(patient2);
        hospital1.addPatient(patient3);
        hospital1.addPatient(patient4);

        City city1 = new City("Istanbul");
        city1.addHospital(hospital1);

        Country country = new Country("Turkiye");
        country.addCity(city1);

        reportCountry(country);

    }

    private static void reportCountry(Country country) {

        NumberOfCovidPatientsVisitor numberOfCovidPatientsVisitor = new NumberOfCovidPatientsVisitor();
        String numberOfPatients = numberOfCovidPatientsVisitor.visitCountry(country);

        NumberOfCovidDeathsVisitor numberOfCovidDeathsVisitor = new NumberOfCovidDeathsVisitor();
        String numberOfCovidDeaths = numberOfCovidDeathsVisitor.visitCountry(country);

        NumberOfCovidGotBetterVisitor numberOfGotBetterVisitor = new NumberOfCovidGotBetterVisitor();
        String numberOfGotBetter = numberOfGotBetterVisitor.visitCountry(country);

        NumberOfCovidPneumoniasVisitor numberOfPneumoniasVisitor = new NumberOfCovidPneumoniasVisitor();
        String numberOfPneumonias = numberOfPneumoniasVisitor.visitCountry(country);

        NumberOfSeriouslyIllPatientsWithCovid numberOfSeriouslyIllPatientsWithCovid = new NumberOfSeriouslyIllPatientsWithCovid();
        String numberOfSeriouslyIll = numberOfSeriouslyIllPatientsWithCovid.visitCountry(country);

        System.out.println("Hasta sayisi: " + numberOfPatients);
        System.out.println("Olum sayisi: " + numberOfCovidDeaths);
        System.out.println("Zature sayisi: " + numberOfPneumonias);
        System.out.println("Agir hasta sayisi: " + numberOfSeriouslyIll);
        System.out.println("Iyilesen hasta sayisi: " + numberOfGotBetter);

    }
}
