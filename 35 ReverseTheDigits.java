import java.util.Scanner;

class ReverseTheDigits {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to the reverse digit checker");
         int num = input.nextInt();
         int ReverseOfDigits = ReverseOfDigits(num);
         System.out.println(" Reverse of the digits is:" + ReverseOfDigits );

     }
     public static int ReverseOfDigits ( int num  ){
         int newNum = 0;
         while (num >0) {
             int digit = num %10;
             newNum = newNum * 10 + digit;
             num /=10;

         }
         return newNum;






     }
}
