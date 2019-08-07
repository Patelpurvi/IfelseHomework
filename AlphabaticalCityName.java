

//10. Input any alphabet from a to f and print their city name accordingly
// (use if else) any other alphabet should be invalid entry
import java.util.Scanner;


public class AlphabaticalCityName {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Alphabet");
        ch = scanner.next().charAt(0);

        //if else condition with Alphabetically City name

        if (ch == 'a'){
            System.out.println("A is for Ahmedabad");}
        else if (ch == 'b'){
            System.out.println("B is for Bombay");}
        else if (ch == 'c'){
            System.out.println("C is for Chattisgadh");}
        else if (ch == 'd'){
            System.out.println("D is for Delhi");}
        else if (ch == 'e'){
            System.out.println("E is for Etah");}
        else if (ch == 'f'){
            System.out.println("F is for Fatehpur Shikri");}

        else System.out.println("Invalid Entry");
        }

    }