package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import services.Patient;
import services.PatientReader;
import services.PatientDAO;

import java.sql.*;

public class TestJDB1 {

    public static void test() throws SQLException {

        Connection connection = null;


// Connect to the in-memory H2 database
        connection = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");

// Create the PATIENTS table
        PreparedStatement preparedStatement = connection.prepareStatement(
                "CREATE TABLE PATIENTS(pat_num_HC BIGINT," +
                        "pat_lastname VARCHAR(255), " +
                        "pat_firstname VARCHAR(255)," +
                        "pat_address VARCHAR(255)," +
                        "pat_tel INT," +
                        "pat_insurance_id INT," +
                        "pat_subscription_date DATE )");

        preparedStatement.execute();
        System.out.println("Table Created");



    }

}