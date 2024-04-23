import java.util.Scanner;

      class bitwisecompliment {

   public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Welcome to bit wise compliment");
          System.out.println("Enter the number");
         int First = input.nextInt();

          int Result = ~ First;
          System.out.println("Bitwise compliment :" + Result);

     }

}


