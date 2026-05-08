package com.pluralsight;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class DealershipFileManagerTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Calling getDealership returns a dealership object with the data from the file.")
    void getDealership_fromFile_returnsDealership() {
        //arrange
        DealershipFileManager fileManager = new DealershipFileManager();

        //act
        Dealership dealership = fileManager.getDealership();

        //assert
        assertEquals("D & B Used Cars", dealership.getName());
        assertEquals("111 Old Benbrook Rd", dealership.getAddress());
        assertEquals("817-555-5555", dealership.getPhone());
    }
}