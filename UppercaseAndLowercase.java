
//12. Input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;

public class UppercaseAndLowercase {

    public static void main(String[] args) {
        char ch;
        int temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any Alphabet in Uppercase");
        ch = scanner.next().charAt(0);
//  if (ch >= 'A' && ch <= 'Z') {
        //    System.out.println("\n" + ch + " an Uppercase Character"); }
        //else if  (ch >= 'a' && ch <= 'z'){
        //  System.out.println("\n" + ch + " an Lowercase Character");

        temp = ch;
        temp =  temp +32;
        ch = (char) temp;
        System.out.println("Any Character in Lowercase= " + ch);

    }}



