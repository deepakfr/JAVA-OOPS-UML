package test;

import services.Patient;
import services.PatientBLService;
import services.PatientReader;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

public class TestBLI1 {

    public static void main() throws IOException, ParseException {
        String filePath = "resources/patients.csv";
        PatientReader reader = new PatientReader();
        PatientBLService blService = new PatientBLService();

        // Load list of patients
        List<Patient> patients = reader.readAll();

        // Get 6th patient entry in the list and output its information
        int index = 5; // 7th entry has index 6
        if (patients.size() > index) {
            Patient patient = patients.get(index);
            System.out.println("Patient Information:");
            System.out.println("Number: " + patient.getPatNumHC());
            System.out.println("Last Name: " + patient.getPatLastName());
            System.out.println("First Name: " + patient.getPatFirstName());
            System.out.println("Address: " + patient.getPatAddress());
            System.out.println("Telephone: " + patient.getPatTel());
            System.out.println("Insurance ID: " + patient.getPatInsuranceId());
            System.out.println("Subscription Date: " + patient.getPatSubDate());
        } else {
            System.out.println("Invalid index provided");
        }
    }
}


