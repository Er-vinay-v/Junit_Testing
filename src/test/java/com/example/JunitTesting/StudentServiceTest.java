package com.example.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

@org.springframework.boot.test.context.SpringBootTest
class StudentServiceTest {

    @org.junit.jupiter.api.AfterAll
    public static void runFirst(){
        int a=70;
        int b=30;
        int result=a+b;
        System.out.println("output of code is "+result+"-->"+(char)result);
    }


    @org.junit.jupiter.api.Test
    void getStudent() {
        StudentService studentService=new com.example.JunitTesting.StudentService();
        Student st=studentService.getStudent();
        org.junit.jupiter.api.Assertions.assertEquals("Vinay",st.getName());

    }



}