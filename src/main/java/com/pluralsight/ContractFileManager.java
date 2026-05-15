//package com.pluralsight;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class ContractFileManager {
//    public void saveDealership(Dealership dealership) {
//        System.out.println("Enter vehicle make: ");
//        String make = scanner.nextLine();
//
//        System.out.println("Enter vehicle model: ");
//        String model= scanner.nextLine();
//
//        System.out.println("Enter vin number: ");
//        int vin = scanner.nextInt();
//
//        System.out.println("Enter year: ");
//        int year = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Enter vehicle type: ");
//        String vehicleType = scanner.nextLine();
//
//        System.out.println("Enter vehicle color: ");
//        String color = scanner.nextLine();
//
//        System.out.println("Enter mileage: ");
//        int odometer = scanner.nextInt();
//
//        System.out.println("Enter vehicle price: ");
//        double price = scanner.nextDouble();
//        scanner.nextLine();
//
//        vehicles.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
//
//        try {
//            FileWriter fileWriter = new FileWriter("inventory.csv", true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            //            D & B Used Cars|111 Old Benbrook Rd|817-555-5555
////            10112|1993|Ford|Explorer|SUV|Red|525123|995.00
////            37846|2001|Ford|Ranger|truck|Yellow|172544|1995.00
////            44901|2012|Honda|Civic|SUV|Gray|103221|6995.00
//
//            bufferedWriter.write(vin + "|" + year + "|" + make + "|" + model + "|" + vehicleType + "|"
//                    + color + "|" + odometer + "|" + price);
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
