package com.example.JunitTesting.arithmetic;

import static org.junit.jupiter.api.Assertions.*;

@org.springframework.boot.test.context.SpringBootTest
class AddCalculatorTest {


    com.example.JunitTesting.arithmatic.AddCalculator a=new com.example.JunitTesting.arithmatic.AddCalculator();
    @org.junit.jupiter.api.Test
    void add() {
      int r= a.add(45,5);
        assertEquals(50,r);
    }

    @org.junit.jupiter.api.Test
    void addThree() {
      int r=  a.addThree(5,7,9);
        assertEquals(21,r);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.ValueSource(ints = {1,3,5,7,9,11,13,17,19,21,23,31,37,35,49})
    void isOdd(int n){
        com.example.JunitTesting.arithmatic.AddCalculator a=new com.example.JunitTesting.arithmatic.AddCalculator();
       boolean r= a.isOdd(n);
        org.junit.jupiter.api.Assertions.assertTrue(r);

    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.ValueSource(ints ={2,4,6,8,10,12,14,16,18,20,22,102,1000,9024})
    void isEven(int n){
        com.example.JunitTesting.arithmatic.AddCalculator calculator=new com.example.JunitTesting.arithmatic.AddCalculator();
       boolean r= calculator.isEven(n);
        org.junit.jupiter.api.Assertions.assertTrue(r);
    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvSource({"23,20,43","12,13,25","15,17,32","9,8,17"})
    void addTwoCSV(int a,int b,int expected){
        com.example.JunitTesting.arithmatic.AddCalculator c=new com.example.JunitTesting.arithmatic.AddCalculator();
        int r=c.addTwoCSV(a,b);
        org.junit.jupiter.api.Assertions.assertEquals(expected,r);

    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.CsvFileSource(resources ="/testcases.csv",numLinesToSkip = 1)
    void addTwoCSVFile(int a,int b,int expected){
        com.example.JunitTesting.arithmatic.AddCalculator c=new com.example.JunitTesting.arithmatic.AddCalculator();
       int r= c.addTwoCSV(a,b);
        org.junit.jupiter.api.Assertions.assertEquals(expected,r);
    }
}