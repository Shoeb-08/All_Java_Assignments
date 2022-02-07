package Assignments.Java_Assignment_5.shoeb;
public class singleton {
    private String nonStatic;
    public static singleton staticMethod(String value){
        return new singleton();
    }
    public void nonStaticMehtod(){
        System.out.println("S= "+nonStatic);
    }
    public static void main(String[] args) {

    }
}
