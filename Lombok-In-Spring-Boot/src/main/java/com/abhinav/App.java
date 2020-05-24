package com.abhinav;

import com.abhinav.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        Student s1 = new Student();
        s1.setSid("1");
        s1.setSname("Ram");
        s1.setSage("10");
        
        Student s2 = Student.builder().sid("2").sname("Shyam").sage("20").build();
        
        System.out.println(s1);
        System.out.println(s2);
    }
}
