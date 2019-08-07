
//15. WAP input any number, the print Day name of the week accordingly by using if else

import java.util.Scanner;

public class WeekName {
    public static void main(String[] args){
// programme to print day name of the week
        Scanner scanner = new Scanner(System.in);
        //user Enter the week number in between (1-7)
       System.out.println("Enter the Week number (1-7) ");

       int week = scanner.nextInt();
       if (week == 1) {
           System.out.println("Monday"); }
       else if (week == 2) {
            System.out.println("Tusday");}
       else if (week == 3) {
           System.out.println("Wednesday");}
        else if (week == 4) {
               System.out.println("Thursday");}
        else if (week == 5) {
           System.out.println("Friday");}
        else if (week == 6) {
           System.out.println("Saturday");}
           else if(week == 7){
               System.out.println("Sunday");}
           else System.out.println("Invalid Input Enter only number in between 1-7");





    }
}
