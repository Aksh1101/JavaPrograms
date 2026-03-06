package oops;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // here public is redundant for java 25
        // store 5 roll number
        int[] rno = new int[5];
        // store 5 name
        String [] names = new String[5];

        // data of 5 students : {roll no , name , marks }
        int [] rollNo =  new int[5];
        String [] name = new String[5];
        float [] marks =  new float[5];

        // but i wanted it to be stored in one data type , so here
        // classes comes into picture

        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students)); // this will array of null

        Student student1;
        student1 = new Student();
        System.out.println(); // this will give me nothing just blank space
        System.out.println(student1.rollNo); // this will give 0 by default
        System.out.println(student1.name); // this will show null
        System.out.println(student1.marks); // this will give 0.0

        Student student2 = new Student();
        student2.rollNo = 6;
        student2.name = "Esteban";
        student2.marks = 88.5f;
        System.out.println(student2);// this will show random value
        System.out.println(student2.rollNo);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        Student  student3 = new Student();
        System.out.println(student3.rollNo);
        System.out.println(student3.name);
        System.out.println(student3.marks);

        student3.greeting();
        student3.changeName("Martha");
        student3.greeting();
        Student  student4 = new Student(4,"Mikasa",97.6f);
        System.out.println(student4.rollNo);
        System.out.println(student4.name);
        System.out.println(student4.marks);

        Student  student5 = new Student(student4);
        System.out.println(student5.name);
    }

    // creating a class
    static class Student {
        int rollNo ;
        String name;
        float marks;
        // if i will have a default value here then it will not be changed if i define my object
        // i have to do something different

        // we need a way to add the values of the above properties object by object
        // we need one word to access every object

//        Student(){
//            this.rollNo = 3;
//            this.name = "Reiner";
//            this.marks = 80.5f;
//        } // this is a constructor , will help to directly pass in the value

        // this keyword will give the values to the invoking object

        void greeting(){
            System.out.println("Hello, My name is " + name);
        }
        void changeName(String newName){
            name = newName;
        }
        Student(int roll, String Name, float mark) {
            rollNo = roll;
            name = Name;
            marks = mark;
        }
        // here we have taken the variable name different if we keep it same then we have to use this keyword

        Student(Student other){
            rollNo = other.rollNo;// it can work without this but using it is good
            this.name = other.name;
            this.marks = other.marks;
        }

        Student(){
            // this is how you call a constructor from another constructor
            // internally - new Student()
            this (10,"daniel",94.0f);
        }
    }
}
