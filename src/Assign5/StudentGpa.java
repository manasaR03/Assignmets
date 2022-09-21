package Assign5;

import Assign4.Student;

import java.util.*;


public class StudentGpa {
    public static void main(String[] args) {

        Student st1 = new Student("apple", "abc", 34f);
        Student st2 = new Student("mango", "mad", 22f);
        Student st3 = new Student("raj", "vta", 57f);
        Student st4 = new Student("aish", "kyf", 67f);


        List<Student> studentList = new ArrayList(){};
        studentList.addAll(Arrays.asList(st1,st2,st3,st4));
        Comparator<Student> a = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        };
            studentList.sort(a);

        for (Student student : studentList) {
            System.out.println("First: " + student.getFirstName() +"last: " +student.getLastName() + "gpa:" +student.getGpa());
        }

        studentList.remove(3);
        System.out.println("after removing");

        studentList.forEach(student -> System.out.println("First: " + student.getFirstName() +"last: " +student.getLastName() + "gpa:" +student.getGpa()) );



    }
}

