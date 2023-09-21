import java.util.Scanner;
/* I have neither given nor received any unauthorised aid on this piece of work */
public class Main {

    public static void main(String[] args) {
        int resultOne = add(1, 2);
        System.out.println(resultOne);
        String resultTwo = greeting("Kyle");
        System.out.println(resultTwo);
        int resultThree = add(1, 2, 3, 4);
        System.out.println(resultThree);
        String print = printMe("Hope you have a wonderful day!");
        System.out.println(print);
    }

    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static String greeting(String name){
        return "Bonjour, " + name;
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int first = add(numOne, numTwo);
        int second = add(numThree, numFour);
        return first + second;
    }
    public static String printMe(String toBePrinted){
        return toBePrinted;
    }
}