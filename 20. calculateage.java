import java.util.Scanner;

class calculateage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the age differentiator");
        System.out.println("please Enter your age");
        float age = input.nextFloat();
        if (age>=60) {
            System.out.println("then you are a Senior");
        } else if (age >= 20) {
            System.out.println(" then you are a Adult");
        } else if ( age >=13 ) {
            System.out.println(" then you are a Teen");
        } else
            System.out.println(" then you are a Child");
            
        }

    }



