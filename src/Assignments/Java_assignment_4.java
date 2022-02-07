package Assignments;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.time.*;
public class  Java_assignment_4{
    public final int N=30;
    public void identifyTheRange(String signupdate, String currDate) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signIn=LocalDate.parse(signupdate,df);

        LocalDate PresentDay=LocalDate.parse(currDate,df);
        if(PresentDay.getYear()<=signIn.getYear())
        {
            System.out.println("Range does not exist");
        }
        else
        {
            int diff=signIn.getYear()-PresentDay.getYear();
            signIn=signIn.minusYears(diff);
            LocalDate begin=signIn.minusDays(N);
            LocalDate end=signIn.plusDays(N);
            if(PresentDay.compareTo(end)<0) {
                end=PresentDay;
            }
            System.out.println(begin.format(df)+" "+end.format(df));
        }

    }
    public static void main(String args[]) {
        Java_assignment_4 jav=new Java_assignment_4();
        Scanner sc=new Scanner(System.in);
        ArrayList<Void> l=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s1=sc.next();
            String s2=sc.next();
            jav.identifyTheRange(s1,s2);
        }
    }
}