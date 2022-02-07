package Assignments.Java_Assignment_5.shoeb;
public class mainC {
    public static void main(String[] args) {
        data obj1=new data();
        obj1.printObj();
        singleton obj2=singleton.staticMethod("hello world");
        obj2.nonStaticMehtod();

    }
}
