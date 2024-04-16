package com.example.JunitTesting.arithmetic;

import static org.junit.jupiter.api.Assertions.*;

@org.springframework.boot.test.context.SpringBootTest
class SubtractCalculatorTest {

    com.example.JunitTesting.arithmatic.SubtractCalculator c=new com.example.JunitTesting.arithmatic.SubtractCalculator();
    @org.junit.jupiter.api.Test
    void subtractTwo() {

        int r=c.subtractTwo(20,10);
        assertEquals(10,r);
    }

    @org.junit.jupiter.api.Test
    void subtractThree() {
       int r= c.subtractThree(30,20,10);
        assertEquals(0,r);
    }
}