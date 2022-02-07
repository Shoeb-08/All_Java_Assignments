package Assignments.Java_assignment_11;

import java.io.*;
import java.util.HashMap;
import java.util.*;
public class Java_assignment_11 {
    HashMap<Character,Integer> map=new HashMap<>();
    public void count(String input){
        input=input.toLowerCase();
        char inputArray[]=input.toCharArray();
        for(Character ch:inputArray){
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
    }
    public static void main(String args[]) throws IOException {
        File fileinput=new File("/home/shoebs/IdeaProjects/All Java Assignments/src/Assignments/Java_assignment_11/input");
        BufferedReader br=new BufferedReader(new FileReader(fileinput));
        Java_assignment_11 ccount=new Java_assignment_11();
        File fileoutput=new File("/home/shoebs/IdeaProjects/All Java Assignments/src/Assignments/Java_assignment_11/output");
        BufferedWriter bw=new BufferedWriter(new FileWriter(fileoutput));
        String s;
        while((s=br.readLine())!=null){
            ccount.count(s);
            System.out.println(s);
        }
        for(Character c:ccount.map.keySet())
        {
            bw.write(c+" "+ccount.map.get(c));
            bw.newLine();
            System.out.println(c+" "+ccount.map.get(c));
        }
        bw.close();
    }
}
