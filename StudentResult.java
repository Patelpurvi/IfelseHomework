
//3. WAP to input student name, roll no, 3 subjects marks..and ﬁnd out total, percentage and result
// if he is pass or fail on basis of percentage (pass>=35) and also give them grade
// >= 80 A+ >= 60 A >= 50 B >= 35 C

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args){
        //first enter the student name
        System.out.println("Enter the Student Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
       // second enter the roll no.
        System.out.println("Enter the Roll No.");
        int roll = scanner.nextInt();

        System.out.println("Enter the Science Marks");
        int sm = scanner.nextInt();
        System.out.println("Enter the Maths Marks");
        int mm = scanner.nextInt();

        System.out.println("Enter the English Marks");
        int em = scanner.nextInt();

        //total marks of three subject
        System.out.println("Total Marks of Three Subject" + "=" + " "+(sm + mm + em));

        //total 3 subject percentage
        System.out.println("Total Percentage" + "=" + " "+ ((sm + mm + em) / (3)) + "%");

        //find out the grade by using if else if else if else

        if ((sm + mm + em) / (3) >= 35)
        { System.out.println("The Result is Pass"); }
        else { System.out.println("The Result is Fail"); }
        System.out.print("The Grade is ");
        if ((sm + mm + em) / (3) >= 80) {
            System.out.print("A+"); }
        else if (((sm + mm + em) / (3) >= 60)) {
            System.out.print("A");
        } else if (((sm + mm + em) / (3) >= 50)) {
            System.out.print("B");
        } else if (((sm + mm + em) / (3) >= 35)) {
            System.out.print("C");
        }else System.out.println();


    }}



