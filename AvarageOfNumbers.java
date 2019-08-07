
//7. WAP input any ﬁve number and then ﬁnd average of ﬁve numbers

import java.util.Scanner;

public class AvarageOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First number");
        int a1 = scanner.nextInt();
        System.out.println("Enter the Second number");
        int a2 = scanner.nextInt();
        System.out.println("Enter the Third number");
        int a3 = scanner.nextInt();
        System.out.println("Enter the Fourth number");
        int a4 = scanner.nextInt();
        System.out.println("Enter the Fifth number");
        int a5 = scanner.nextInt();
       //Average of five number = total of 5 numbers and divided by 5
        System.out.println("Avarage of Five number is: " + (a1+a2+a3+a4+a5) /5);



    }
}
