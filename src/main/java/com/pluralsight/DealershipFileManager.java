package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class DealershipFileManager {

    public Dealership getDealership() {
        Dealership dealership = null;


        try {
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            line = bufferedReader.readLine();
            dealership = Dealership.parseLine(line); //first line in the file is general dealership information

            while ((line = bufferedReader.readLine()) != null) {
                 Vehicle vehicle = Vehicle.parseLine(line); //all other lines in the file are vehicles
             }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("The inventory file could not be read. Please make sure the file is available and not locked and then try again.");
            e.printStackTrace();
        }

        return dealership;
    }




    public void saveDealership(Dealership dealership) {

    }
}
