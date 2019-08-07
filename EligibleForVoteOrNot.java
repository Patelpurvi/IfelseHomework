
//11. Write Java program to allow the user to input his/her age.
// Then the program will show if the person is eligible to vote.
// A person who is eligible to vote must be older than or equal to 18 years old.


import java.util.Scanner;

public class EligibleForVoteOrNot {


    public static void main(String[] args){
        int age;
        Scanner scanner = new Scanner(System.in);
        // finding the voting age with if else condition

        System.out.println("Enter the Age" );
        age = scanner.nextInt();
        if (age>=18){
            System.out.println("Eligible for Voting"); }
        else if (age<=18){
            System.out.println("Not Eligible for Voting");}
        }


    }

