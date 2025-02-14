package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        
        for (int i = list.size() - 1; i > 0; i--) {
            int furthestIdx = i;
            for (int j = 0; j < i; j++) {
                String lastNameI = list.get(furthestIdx).getLastName();
                String lastNameJ = list.get(j).getLastName();
                if (lastNameJ.compareTo(lastNameI) > 0) {
                    furthestIdx = j;
                }
                
            }
            Student swapTemp = list.get(i);
            list.set(i, list.get(furthestIdx));
            list.set(furthestIdx, swapTemp);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            String firstName1 = list.get(i).getFirstName();
            String lastName1 = list.get(i).getLastName();
            String firstName2 = list.get(i+1).getFirstName();
            String lastName2 = list.get(i+1).getLastName();

            if (lastName1.equals(lastName2)) {
                if (firstName1.compareTo(firstName2) > 0) {
                    Student swapTemp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, swapTemp);
                }
            }
        }

        for (int i = 0; i < list.size() - 1; i++) {
            String firstName1 = list.get(i).getFirstName();
            String lastName1 = list.get(i).getLastName();
            double gpa1 = list.get(i).getGpa();
            String firstName2 = list.get(i+1).getFirstName();
            String lastName2 = list.get(i+1).getLastName();
            double gpa2 = list.get(i+1).getGpa();

            if (firstName1.equals(firstName2) && lastName1.equals(lastName2)) {
                if (gpa2 > gpa1) {
                    Student swapTemp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, swapTemp);
                }
            }
        }


        return list;
    }

    

}
