package oops.generics.comparing;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }



    @Override
    public int compareTo(@NotNull Student o) {
        int diff = (int) (this.marks - o.marks);
        return diff;
    }
}

