
//4. same as above but pass or fails on the basis of..student needs to pass all the subjects

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Science mark");
        int Sciencemark = scanner.nextInt();
        System.out.println("Enter the Maths mark");
        int Mathsmark = scanner.nextInt();
        System.out.println("Enter the English mark");
        int Englishmark = scanner.nextInt();

        // student is pass or fail finding with if else condition
        if(Sciencemark>=30){System.out.println(" in Science Pass");}
        else { System.out.println("in Science Fail");}
        if(Mathsmark>=30){System.out.println("in Maths Pass");}
            else { System.out.println("in Maths Fail");}
            if (Englishmark >= 30) { System.out.println("in English Pass"); }
            else { System.out.println("in English Fail"); }
            }}