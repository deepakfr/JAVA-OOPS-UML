package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient {
    private String patNumHC;

    @Override
    public String toString() {
        return "Patient{" +
                "patNumHC='" + patNumHC + '\'' +
                ", patLastName='" + patLastName + '\'' +
                ", patFirstName='" + patFirstName + '\'' +
                ", patAddress='" + patAddress + '\'' +
                ", patTel='" + patTel + '\'' +
                ", patInsuranceId=" + patInsuranceId +
                ", patSubDate=" + patSubDate +
                '}';
    }

    private String patLastName;
    private String patFirstName;
    private String patAddress;
    private String patTel;
    private int patInsuranceId;
    private Date patSubDate;

    public String getPatNumHC() {
        return patNumHC;
    }

    public void setPatNumHC(String patNumHC) {
        this.patNumHC = patNumHC;
    }

    public String getPatLastName() {
        return patLastName;
    }

    public void setPatLastName(String patLastName) {
        this.patLastName = patLastName;
    }

    public String getPatFirstName() {
        return patFirstName;
    }

    public void setPatFirstName(String patFirstName) {
        this.patFirstName = patFirstName;
    }

    public String getPatAddress() {
        return patAddress;
    }

    public void setPatAddress(String patAddress) {
        this.patAddress = patAddress;
    }

    public String getPatTel() {
        return patTel;
    }

    public void setPatTel(String patTel) {
        this.patTel = patTel;
    }

    public int getPatInsuranceId() {
        return patInsuranceId;
    }

    public void setPatInsuranceId(int patInsuranceId) {
        this.patInsuranceId = patInsuranceId;
    }

    public Date getPatSubDate() {
        return patSubDate;
    }

    public void setPatSubDate(Date patSubDate) {
        this.patSubDate = patSubDate;
    }

    public Patient(String patNumHC, String patLastName, String patFirstName, String patAddress,
                   String patTel, int patInsuranceId, Date patSubDate) {
        this.patNumHC = patNumHC;
        this.patLastName = patLastName;
        this.patFirstName = patFirstName;
        this.patAddress = patAddress;
        this.patTel = patTel;
        this.patInsuranceId = patInsuranceId;
        this.patSubDate = patSubDate;
    }

    // Getters and setters
}

