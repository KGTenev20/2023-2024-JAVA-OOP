import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        printTest();
//        printTest();
//        printTest();
//        printTest();
//        printTest();
//        printTest();
//        printText("Ivan");
//        printText("Dragan");
//        printText("Petkan");
//        recursion();
        double testDouble = 10.5;
        double finalResult = addTwoNumbers(10,2.5);
        double endResult = addTwoNumbers(100, addTwoNumbers(1000, 10.4));
        System.out.println(endResult);
    }

    public static double addTwoNumbers(int first, double second) {
        //System.out.println(first + second);
        double result = first + second;
        return result;
    }

//    public static void recursion(){
//        recursion();
//    }

    /*
    public static void printText(String text) {
        int a = 5;
        System.out.println(text + " " + a);
        a++;
    }
    */

//    public static void printTest() {
//        System.out.println("test");
//        test();
//    }

//    public static void test() {
//        System.out.println("testing..");
//    }

}