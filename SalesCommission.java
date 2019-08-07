
//9. WAP input sales id, seller's name, sales amount, salary basic and then ﬁnd this sales commission
// sales amount >= 50,000 35%
// sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,0

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Sales ID");
        String SalesID = scanner.next();
        System.out.println("Enter the SellersName");
        String sellername = scanner.next();
        System.out.println("Enter the Sales Amount");
        double salesamount = scanner.nextDouble();
        System.out.println("Enter the Basic Salary (£) ");
        double BasicSalary = scanner.nextDouble();

        if (salesamount>=50000){
           System.out.println("The total Commission is " + (salesamount*35/100));}
       else if (salesamount >= 30000){
           System.out.println("Total Commission is" + (salesamount*20/100));}
       else if (salesamount >= 20000){
           System.out.println("Total Commission is" + (salesamount*10/100));}
       else if (salesamount >= 10000){
           System.out.println("The Total Commission is"+ (salesamount*5/100));}
           else if (salesamount < 10000){
               System.out.println("The Total Commission is "+ (salesamount*2/100));}
           else System.out.println();

            }
        }






