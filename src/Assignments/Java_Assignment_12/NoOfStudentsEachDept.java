package Assignments.Java_Assignment_12;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class NoOfStudentsEachDept {
    public static void noOfStudentsEachDept(List<Student> students)
    {
        Map<String,Long> result = students.stream().map(s->s.branch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}