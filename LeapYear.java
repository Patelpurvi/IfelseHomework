
//2. WAP to input any year like 1989 and ﬁnd out if it is leap year

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        // applying the true and false policy with if else condition

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year as you wish");
        int year = scanner.nextInt();
        boolean leap = false;
        if (year % 4 == 0) {
            leap = true;
        } else if (year % 100 == 0) {
            leap = false;
        } else if (year % 400 == 0) {
            leap = true;
        } else leap = false;

    {
       if(leap){ System.out.println(year + "is a leap year");}
        else
    System.out.println(year + "is not a leap year"); }}}


