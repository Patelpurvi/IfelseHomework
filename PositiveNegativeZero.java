
//8. WAP to input any number and ﬁd our if it is positive , negative or zero

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number you like");
        int first = scanner.nextInt();
        // finding the negative positive and zero with if else
        if (first < 0) {
            System.out.println("The Number is Negative");
        } else if (first > 0) {
            System.out.println("The number is Positive");
        } else if (first == 0) {
            System.out.println("Zero is Neither Positive nor Negative"); }
        else {}


    }

    }




