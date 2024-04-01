package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InsuranceReader {
    private static final String INSURANCE_FILE_PATH = "resources/insurances.csv";

    public List<Insurance> readAll() throws IOException {
        List<Insurance> insurances = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(INSURANCE_FILE_PATH))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                int insuranceId = Integer.parseInt(fields[0]);
                String insuranceName = fields[1];

                insurances.add(new Insurance(insuranceId, insuranceName));
            }
        }

        return insurances;
    }
}