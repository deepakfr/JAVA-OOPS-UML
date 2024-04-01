package test;

import services.Patient;
import services.PatientReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import static services.PatientBLService.computeSeniorityByPatient;

public class TestBLI2 {
    public static void main() throws IOException, ParseException {
        List<Patient> patients = PatientReader.readAll();
        Map<String, Integer> seniorityMap = computeSeniorityByPatient(patients);

        // Display the data structure in the console
        System.out.println(seniorityMap);

        // Print out the resulting map

        for (Map.Entry<String, Integer> entry : seniorityMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}

