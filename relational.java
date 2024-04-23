import java.util.Scanner;

class relational {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to driving license portel");
         System.out.println(" Enter your age :");
         int age = input.nextInt();

         if  (age >= 18)   {
             System.out.println("your are eligible to drive");
         } else{

             System.out.println("you are not eligible to drive");


         }

     }
}
