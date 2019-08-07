
// Enter any value and the ﬁnd out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;

public class NumberOrAlphabetOrSymbol {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number symbol or alphabet");
        char ch = scanner.next().charAt(0);
        //if else condition with finding the alphabet number or symbol
        if(ch >= 'a' && ch <= 'z'){
            System.out.println(" Character is Alphabet");}
        else if(ch >= '0' && ch <= '9'){
            System.out.println("Character is Number");}
            else System.out.println("Character is a Symbol");
    }
        }






