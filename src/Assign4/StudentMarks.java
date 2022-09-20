package Assign4;

import java.util.*;

public class StudentMarks {
    public static void main(String[] args){

        //Initialization
        Student st1=new Student("raj","aaa",80f);
        Student st2=new Student("priya","abc",45f);
        Student st3=new Student("rani","ghy",78f);
        Student st4=new Student("ragh","hju",40f);
        Student st5=new Student("neha","ase",35f);
        Student st6=new Student("manu","ujh",92f);
        Student st7=new Student("jyo","kmn",55f);
        Student st8=new Student("tina","wsa",76f);

        // Adding to Array
        Student[] studentList = new Student[]{st1, st2, st3, st4, st5, st6, st7, st8};

        // Define comparator
        Comparator<Student> a= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGpa() > o2.getGpa() ?  -1 : 1;
            }
        };

        //Sort
        Arrays.sort(studentList,a);

        // Print Student info
        for (Student s : studentList)
        {
            System.out.println("First : " + s.getFirstName() + " Last : " + s.getLastName() + " GPA : " + s.getGpa());
        }

    }

}
