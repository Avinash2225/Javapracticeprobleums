import java.util.Scanner;

class Palindrome {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the palindrome checker");
         System.out.println("Enter the number");
         int num = input.nextInt();
         boolean isPalindrome = isPalindrome(num);
       //  System.out.println("your number is palindrome number ");
         if (isPalindrome) {
             System.out.println("your number is palindrome number");
         }else {
             System.out.println("your number is not palindrome");

         }

     }

     public static boolean isPalindrome(int num){
         return num == reverse (num);

     }
    public static int reverse ( int num  ){
        int newNum = 0;
        while (num >0) {
            int digit = num %10;
            newNum = newNum * 10 + digit;
            num /=10;

        }
        return newNum;






    }
}