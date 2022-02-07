package Assignments;
import java.util.*;
import java.util.regex.*;
public class Java_assignment_9 {
    public void patternMatching(String input) {
        Pattern p=Pattern.compile("^[A-Z]+.*\\.$");
        if(p.matcher(input).matches()) {
            System.out.println("success pattern");
        }
        else {
            System.out.println("failed pattern");
        }
    }
    public static void main(String args[]){
        Java_assignment_9 match=new Java_assignment_9();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        match.patternMatching(s);
    }
}
