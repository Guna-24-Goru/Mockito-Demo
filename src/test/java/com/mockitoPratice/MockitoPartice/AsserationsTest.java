package com.mockitoPratice.MockitoPartice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AsserationsTest {
    @Test
    public  void standardAsserations(){

        String excepted="Varshi";
        String actual="Varshi";
        assertEquals(excepted,actual);
        System.out.println("Its is Done......");
    }
}
