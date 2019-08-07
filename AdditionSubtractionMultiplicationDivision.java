

//13. WAP to input enter any two number and ask user to enter their symbol (+, -, /, *)
// ﬁnd addition, subtraction, multiplication and division according to their symbol (using if else)
import java.util.Scanner;

public class AdditionSubtractionMultiplicationDivision {

    public static void main(String[] args){
        int a,b; //initialize
        char ch; //Character initialize

        // enter the numbers and operators

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        a = scanner.nextInt();
        System.out.println("Enter the Second Number");
        b = scanner.nextInt();
        System.out.println("Enter the Operator (+,-,*,/):");
        ch = scanner.next().charAt(0);

        //Definition for Addition,Subtraction,Multiplication,Division

        if (ch == '+'){
            System.out.println("The result is : "+ (a+b));}
            else if (ch == '-'){
            System.out.println("The Result is: "+ (a-b));}
            else if (ch == '*'){
                System.out.println("The Result is : " + (a*b));}
            else if (ch == '/'){
                System.out.println("The Result is : " + (a/b));}
            else System.out.println("Any other Operators Wrong");
        }





    }

