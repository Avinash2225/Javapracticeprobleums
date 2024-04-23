import java.util.Scanner;

class Bitwiseor {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Showcasing Bitwise AND operator");
         System.out.print(" Please enter the first number");
         int Number1 = input.nextInt();
         System.out.print("Now Enter Second Number ");
         int Second = input.nextInt();

         int Result = Number1 | Second;
         System.out.println("Result is:"  +  Result );
     }
}





