import java.util.Scanner;

class bitwiserightshift {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("Welcome the right shift\n");
         System.out.println("Enter a Number");
         int num = input.nextInt();
         int Result = num >> 1;
         System.out.println(" left shift :" + Result);

     }
}
