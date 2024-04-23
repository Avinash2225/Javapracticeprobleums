import java.util.Scanner;

class greatestofthreenumbers {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the greatest number calculator\n");
         System.out.println("Enter your first number");
         int First = input.nextInt();
         System.out.println("Enter your second number");
         int second = input.nextInt();
         System.out.println(" Enter your third number");
         int Third = input.nextInt();

         if (First>= second && First>=Third) {
             System.out.println(First + " greatest number");
         } else if (second>=Third) {
             System.out.println(second + " greatest number");
         } else {
             System.out.println(Third + " is the greatest number");
         }

     }








}
