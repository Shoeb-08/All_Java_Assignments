package Assignments.Java_assignment_6;

import java.util.*;
public class objectRef {
    public objectRef(String var){
        System.out.println("Entered Value: "+var);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        objectRef[] array=new objectRef[n];
        for(int i=0;i<n;i++){
            String input=sc.next();
            array[i]=new objectRef(input);
        }

    }
}