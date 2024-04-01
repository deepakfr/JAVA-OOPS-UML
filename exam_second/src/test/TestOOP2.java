package test;

import services.Insurance;
import services.InsuranceReader;
import services.Patient;
import services.PatientReader;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class TestOOP2 {
    public static void main() throws IOException, ParseException {
        // create instances of the readers
        PatientReader patientReader = new PatientReader();
        InsuranceReader insuranceReader = new InsuranceReader();

        // read all patients and insurances
        List<Patient> patients = patientReader.readAll();
        List<Insurance> insurances = insuranceReader.readAll();

        if (insurances != null && !insurances.isEmpty())
            insurances.remove(0);

        // display the list of instances
        System.out.println("Patients:");
        patients.forEach(System.out::println);

        System.out.println("Insurances:");
        insurances.forEach(System.out::println);
    }
}

