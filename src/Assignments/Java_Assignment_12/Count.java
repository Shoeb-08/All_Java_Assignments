package Assignments.Java_Assignment_12;

import java.util.List;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count {
    public void count(List<Student> students)
    {
        Map<String,Long> result = students.stream().map(s->s.gender).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}