import java.util.Scanner;

class Fibonacci {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to the Fibonacci series");
         System.out.println("Enter the number series has to be printed:");
         int num = input.nextInt();
         System.out.println("Here is the Fibonacci series");
         printFibonacci(num);
     }
     public static void printFibonacci ( int num ) {
         if (num < 0) return;
         System.out.println("0");
         if (num == 0) return;
             System.out.println("1");

             int first = 0, second = 1;
             while (first + second <= num) {
                 int third = first + second;
                 System.out.println(third + "  ");
                 first = second;
                 second = third;
             }
     }
     }