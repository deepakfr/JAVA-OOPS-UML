package services;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PatientBLService {

    public static Map<String, Integer> computeSeniorityByPatient(List<Patient> patients) {
        Map<String,Integer> myMap=new TreeMap<String,Integer>();
        for (Patient patient: patients) {
            myMap.put(patient.getPatNumHC(),computePatientSeniority(patient));
        }

        return myMap;
    }

    public static int computePatientSeniority(Patient patient) {
        LocalDate patSubDate = patient.getPatSubDate().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(patSubDate, currentDate);
        return period.getYears();
    }

    public void printPatientInformation(Patient patient) {
        System.out.println("Patient Information:");
        System.out.println("Healthcare Number: " + patient.getPatNumHC());
        System.out.println("Last Name: " + patient.getPatLastName());
        System.out.println("First Name: " + patient.getPatFirstName());
        System.out.println("Address: " + patient.getPatAddress());
        System.out.println("Telephone Number: " + patient.getPatTel());
        System.out.println("Insurance ID: " + patient.getPatInsuranceId());
        System.out.println("Subscription Date: " + patient.getPatSubDate());
        System.out.println("Seniority: " + computePatientSeniority(patient) + " years");
    }

    public void printAllPatientsInformation(List<Patient> patients) {
        for (Patient patient : patients) {
            printPatientInformation(patient);
            System.out.println();
        }
    }
}

