package Assignments;

import java.util.*;
public class Java_assignment_8 {
    public void exceptionHandle(int n) {
        try{
            if(100%n==0 && n!=0 && n>0) {
                throw new divisibleByN("n divisible By N");
            }
            else if(n%2==0){
                throw new divisibleBytwo("n divisible By two");
            }
            else if(n>=Integer.MIN_VALUE || n<=Integer.MAX_VALUE)
            {
                throw new IntegerFound("Integer found");
            }
            else{
                throw new NullPointerException();
            }
        }
        catch (divisibleByN | divisibleBytwo | IntegerFound e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally Block executed");
        }

    }
    public static void main(String args[]){
        Java_assignment_8 exception=new Java_assignment_8();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        exception.exceptionHandle(n);
    }


}
class divisibleBytwo extends Exception {
    public divisibleBytwo (String divisible) {
        super(divisible);
    }
}
class divisibleByN extends Exception{
    public divisibleByN (String found_negativeNumber) {
        super(found_negativeNumber);
    }
}
class IntegerFound extends Exception {
    public IntegerFound (String found_zero) {
        super(found_zero);
    }
}