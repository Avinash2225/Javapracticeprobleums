import java.util.Scanner;

class multiplicationfloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing float multiplication\n");
        System.out.println("Enter First decimal number");

        //System.out.println("Enter Second decimal number");

        double First = input.nextDouble();
        System.out.println("now please Enter second decimal number");

        double Second = input.nextDouble();

     //   double mul = First * Second;
        System.out.println("\n Result of two floating numbers is: " + (First + Second) );

    }
}
