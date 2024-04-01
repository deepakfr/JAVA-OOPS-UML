package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientReader {
    private static final String PATIENT_FILE_PATH = "resources/patients.csv";


    public static List<Patient> readAll() throws IOException, ParseException {
        List<Patient> patients = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(PATIENT_FILE_PATH))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                String patNumHC = fields[0].replaceAll("\"", "");
                String patLastName = fields[1];
                String patFirstName = fields[2];
                String patAddress = fields[3];
                String patTel = fields[4];
                int patInsuranceId = Integer.parseInt(fields[5]);
                Date patSubDate = new SimpleDateFormat("dd/MM/yyyy").parse(fields[6]);

                patients.add(new Patient(patNumHC, patLastName, patFirstName, patAddress, patTel, patInsuranceId, patSubDate));
            }
        }

        return patients;
    }
}



