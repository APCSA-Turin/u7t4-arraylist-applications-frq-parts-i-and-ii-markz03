// package com.example.project;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import java.util.ArrayList;
// import java.util.Arrays;

// import org.junit.jupiter.api.Test;

// import com.example.project.Student.Student;
// import com.example.project.Student.Utility;

// public class TestUtility {
    
//     @Test
//     public void testSort(){
//         Student s1 = new Student("Abby", "Smith", 96.7);
//         Student s2 = new Student("Michelle", "Jones", 98.1);
//         Student s3 = new Student("Chase", "Bean", 95.2);
//         Student s4 = new Student("Jack", "Clancy", 97.3);
//         Student s5 = new Student("Brittany", "Jones", 95.5);
//         Student s6 = new Student("Lisa", "Frank", 92.4);
//         Student s7 = new Student("Marie", "Angelina", 96.5);
//         Student s8 = new Student("Peter", "Frank", 97.9);
//         Student s9 = new Student("Lisa", "Frank", 99.5);
//         Student s10 = new Student("Dean", "Jones", 93.2);

//         ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
//         ArrayList<Student> expected = new ArrayList<Student>(Arrays.asList(s7,s3,s4,s9,s6,s8,s5,s10,s2,s1));
//         assertEquals(expected,Utility.sortStudents(students));
//     }
// }
