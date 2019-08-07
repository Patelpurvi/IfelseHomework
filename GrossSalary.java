import sun.net.www.content.audio.basic;

//6. WAP to input employee id, name, basic salary then ﬁnd HRA, TA, DA, PF and Gross salary
// HRA = basic salary 10%
// DA = Basic salary 8%
// TA = Basic salary 9%
// PF= Basic salary 20%
// Gross salary = basic salary + HRA + TA + DA -PF

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        //variable
        String EmployeeID;
        String Name;
        Double BasicSalary;
        Double HRA;
        Double DA;
        Double TA;
        Double PF;
        Double GrossSalary;

        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee ID");
        EmployeeID = scanner.next();
        System.out.println("Enter the Employee Name");
        Name = scanner.next();
        System.out.println("Enter the Basic Salary (£):");
        BasicSalary = scanner.nextDouble();
        //calculation for deduction
            HRA = BasicSalary * 0.10;
            DA = BasicSalary * 0.008;
            TA = BasicSalary * 0.009;
            PF = BasicSalary * 0.20;
            //calculate gross salary*/
        GrossSalary = BasicSalary + HRA + DA + TA - PF;
        System.out.println(GrossSalary = BasicSalary + HRA + DA + TA - PF);
    }
 }













