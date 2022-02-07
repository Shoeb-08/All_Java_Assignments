package Assignments.Java_assignment_6;

public class constructor {
    private String value;
    public constructor(){
        System.out.println("Default Constructor");
    }
    public constructor(String val){
        this();
        value=value+val;
        System.out.println("parameterized constructor "+value);
    }
    public static void main(String args[]){
        constructor obj1=new constructor();
        constructor obj2=new constructor(" Parameterized constructor");
    }
}