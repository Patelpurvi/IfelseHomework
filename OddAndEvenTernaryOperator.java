
//1. Input any two number and ﬁnd out its odd or even use ternary operator (? :)

import java.util.Scanner;

public class OddAndEvenTernaryOperator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int a1 = scanner.nextInt();
        System.out.println("Please enter any number");
        int b1 = scanner.nextInt();

     // finding the Even of Odd number with Ternary condition
        System.out.println((a1%2 == 0) ? "first number is even" : "second number is odd");
        System.out.println((b1%2 == 0) ? "first number is even" : "second number is odd");


    }
}
