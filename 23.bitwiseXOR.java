import java.util.Scanner;

class bitwiseXOR {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the XOR Operator");
         System.out.println(" Enter the First number");
         int First = input.nextInt();
         System.out.println(" Now Enter Second number");
         int Second = input.nextInt();
       int  Result = First ^ Second;
         System.out.println("the result of First and Second :"  +Result );

     }
}
