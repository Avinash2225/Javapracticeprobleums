import java.util.Scanner;
 class oddsum {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Welcome to Odd number\n");
         System.out.println("Please Enter your number: ");
         int num = scanner.nextInt();
         int sum = oddSum(num);
         System.out.println("odd sum till" + num + " is sum :" + sum);


     }

     public static int oddSum(int num) {
         int Sum = 0;
         int i = 1;
         while ( i<=num) {
             Sum += i;
             i += 2;

         }
       return Sum;
     }


 }


