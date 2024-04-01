package main;

import test.*;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class launcher {
    public static void main(String args[]) throws SQLException, IOException, ParseException {
        TestOOP1.main();
        TestOOP2.main();
        TestBLI1.main();
        TestBLI2.main();
        TestJDB1.test();
    }
}
