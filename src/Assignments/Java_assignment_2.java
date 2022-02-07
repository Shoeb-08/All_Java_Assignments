package Assignments;
import java.util.*;
public class Java_assignment_2 {
    public static boolean function(String s){
        //Time complexity is O(n)

        s=s.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size()==26){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(function(s));

    }
}
