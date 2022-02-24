package Assignments.Java_Assignment_12;

public class Student {
    String gender;
    String branch;
    int year;
    int rollno;
    String name;
    int age;
    double percentage;
    public Student(int rollno,String name,int age,String gender,String branch,int year,double percentage)
    {
        this.rollno=rollno;
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.branch=branch;
        this.year=year;
        this.percentage=percentage;
    }

}