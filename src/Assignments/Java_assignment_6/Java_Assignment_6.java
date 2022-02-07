package Assignments.Java_assignment_6;
import java.util.*;
public class Java_Assignment_6 {
    public static void fun(int n){
        int count=0;
        int num=1;
        while(count<n){
            if(verify(num)){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean verify(int num)
    {
        if(digit(num)){
            int length=countt(num);
            ArrayList<String> permutations=new ArrayList<String>();
            permutationsOfString(Integer.toString(num), "", permutations);
            String num1,num2;
            for(String str:permutations) {
                num1=str.substring(0, length/2);
                num2=str.substring(length/2);
                if(!((hasLeadingZeros(num1) || hasLeadingZeros(num2)) || (hasTrailingZeros(num1) && hasTrailingZeros(num2))))
                {
                    if(Integer.parseInt(num1)*Integer.parseInt(num2)==num)
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean digit(int num){
        int count=countt(num);
        if(count>2 && count%2==0)
            return true;
        return false;
    }

    public static int countt(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

    public static boolean hasTrailingZeros(String num){
        if(Integer.parseInt(num)%10=='0')
            return true;
        return false;
    }

    public static boolean hasLeadingZeros(String num){
        if(num.charAt(0)=='0')
            return true;
        return false;
    }

    public static void permutationsOfString(String num, String ans, ArrayList<String> res){
        if(num.length()==0){
            res.add(ans);
            return;
        }
        boolean digit[] = new boolean[10];
        for(int i=0;i<num.length();i++){
            char target=num.charAt(i);
            String ros = num.substring(0, i) + num.substring(i + 1);
            if(digit[target-'0']==false)
            {
                permutationsOfString(ros, ans+target, res);
            }
            digit[target-'0']=true;
        }
    }

    public static void main(String[] args) {
        fun(100);
        //System.out.print(isVampire(1530));
    }
}