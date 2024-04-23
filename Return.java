import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        System.out.println("enter first number: ");
        int Number1 = readNumber() + 1;
        int Number2 = readNumber() + 2;
        int sum = Number1 + Number2;
        System.out.println("the sum of numbers is: " + sum);

    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter first number: ");
        int Number1 = input.nextInt();
        return Number1;

    }


public static void greet () {

        System.out.println("welcome to the calculator\n");


    }

}
