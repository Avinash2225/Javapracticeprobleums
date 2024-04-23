import java.util.Scanner;

class oddevennumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to the odd Even Calculator\n");
         System.out.println(" please enter your first number");
         int num = input.nextInt();
if ((num &1) ==1 ) {
    System.out.println(" your number is odd");
} else    {
             System.out.println(" your number is even");



}


     }
}
