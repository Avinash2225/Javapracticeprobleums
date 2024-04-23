import java.security.Principal;
import java.util.Scanner;
 class compoundinterest {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the compound interest calculator\n");
         System.out.println("ENter the Principal amount in RS\n");
         int principal = input.nextInt();

         System.out.println("Now Enter rate in float");
         float rate = input.nextFloat();

         System.out.println(" Now Enter Number of Years");
         float years = input.nextFloat();

         double compoundinterest = principal* Math.pow ((1+ rate/100) , years );

         System.out.println("Your compound interest is: " + compoundinterest );










     }
}
