import java.util.Scanner;
 class Simpleinterest {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("welcome to the simple interest calculator");

         System.out.println("Enter the principal amount in RS\n");
         int principal = input.nextInt();

         System.out.println("Enter the rate in float");
        float rate= input.nextFloat();

         System.out.println("Now tell me how many years are you borrowing the money ");
         float years = input.nextFloat();

          float interest = (principal*rate*years)/100;
         System.out.println("\n\n your simple interest in Rs:" +interest );





     }

}
