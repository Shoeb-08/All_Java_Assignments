package Assignments.Java_Assignment_12;

import java.util.*;
public class DepartmentOfStudent {
    public static void allDepartments(List<Student> allBranchs)
    {
        allBranchs.stream().map(s->s.branch).distinct().forEach(System.out::println);
    }
}
