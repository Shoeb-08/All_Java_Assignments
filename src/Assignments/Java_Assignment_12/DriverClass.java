package Assignments.Java_Assignment_12;
import java.util.*;
public class DriverClass {
    public static void main(String[] arg)
    {
        Student student1=new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
        Student student2=new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
        Student student3=new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
        Student student4=new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80);
        Student student5=new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70);
        Student student6=new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70);
        Student student7=new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70);
        Student student8=new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
        Student student9=new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
        Student student10=new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
        Student student11=new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
        Student student12=new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        Student student13=new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        Student student14=new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        Student student15=new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        Student student16=new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
        Student student17=new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        System.out.println();
        System.out.println("Departments :");
        System.out.println();
        DepartmentOfStudent.allDepartments(students);
        System.out.println();
        System.out.println("enrolled  after 2018 :");
        System.out.println();
        Names.names(students,2018);
        System.out.println();
        System.out.println("Male Students in CS:");
        System.out.println();
        CSEStudents.names(students,"Computer Science","Male");
        System.out.println();
        System.out.println("Number of male and female students :");
        System.out.println();
        Count obj=new Count();
        obj.count(students);
        System.out.println();
        System.out.println("Average ages");
        AverageAgeOfStudents.avgAge(students);
        System.out.println();
        HighestPercentage.highestPercentage(students);
        System.out.println();
        NoOfStudentsEachDept.noOfStudentsEachDept(students);
        AvgPercentageInEachDept.avgPercentageInEachDept(students);
        YoungMaleStudentInECE.youngMaleStudentInECE(students);



    }
}
