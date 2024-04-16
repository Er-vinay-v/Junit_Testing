package com.example.JunitTesting;


@org.springframework.stereotype.Service
public class StudentService {

    public Student getStudent(){
        Student st=new com.example.JunitTesting.Student();
        st.setId(1);
        st.setName("Vinay");
        st.setEmail("vinay2002champ@gmail.com");
        return st;
    }
}
