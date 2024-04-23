import java.util.Scanner;

class positivenegativezero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.println("please enter your number");
        int num = input.nextInt();
        if ( num >0 ) {
            System.out.println("your number is positive number");
        } else if (num == 0) {
            System.out.println("your number is zeo");
        } else {
            System.out.println("your number is negative");

        }

    }

}




