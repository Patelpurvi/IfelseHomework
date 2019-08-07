
//5. WAP to input any two numbers and then print their interchanged value

import java.util.Scanner;

public class InterchangedValue {
 public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     System.out.println("Input the First number");
     int x = scanner.nextInt();
     System.out.println("Input the Second number");
       int y = scanner.nextInt();
      System.out.println("Input the third number");
      int z = scanner.nextInt();
     z = x;
     x = y;
     y = z;


     System.out.println("Interchanged value are3:" + x + " and " );
     System.out.println("Interchanged value are3:" + y + " and " );
     System.out.println("Interchanged value are3:" + x + " and " + y);

 }}