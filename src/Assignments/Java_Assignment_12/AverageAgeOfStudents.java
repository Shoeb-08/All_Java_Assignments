package Assignments.Java_Assignment_12;

import java.util.*;

public class AverageAgeOfStudents {
    public static void avgAge(List<Student> students)
    {
        int sumOfAgeOfMale=students.stream().filter(s->s.gender.equals("Male")).mapToInt(i -> i.age).sum();
        int sumOfAgeOfFemale=students.stream().filter(s->s.gender.equals("Female")).mapToInt(i -> i.age).sum();
        CountFemale obj1=new CountFemale();
        long numberofFemales=obj1.countFemale(students);
        System.out.println("Avg age of Female "+sumOfAgeOfFemale/numberofFemales);
        CountNumberOfMale obj2=new CountNumberOfMale();
        long numberofMales=obj2.countMale(students);
        System.out.println("Avg Age of Male "+sumOfAgeOfMale/numberofMales);

    }
}
