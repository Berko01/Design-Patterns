package project.transactions;

import java.util.List;

import project.ministeryofperversion.EnumIlness;
import project.ministeryofperversion.EnumPatientCondition;
import project.ministeryofperversion.Hospital;
import project.ministeryofperversion.Patient;

public class CalculateNumberOfPatientUtil {

    public static int calculateNumberOfPatients(Hospital hospital, EnumIlness ilness){
        List<Patient> patientList = hospital.getPatientList();

        int numberOfPatients = 0;

        for(Patient patient: patientList){
            if(ilness.equals(patient.getIlness())){
                numberOfPatients++;
            }
        }
        return numberOfPatients;
    }

    
    public static int calculateNumberOfPatients(Hospital hospital, EnumIlness ilness, EnumPatientCondition condition){
        List<Patient> patientList = hospital.getPatientList();

        int numberOfPatients = 0;

        for(Patient patient: patientList){
            if(ilness.equals(patient.getIlness())){
                    if(condition.equals(patient.getCondition()))
                    {
                        numberOfPatients++;
                    }
              
            }
        }
        return numberOfPatients;
    }
    
}
