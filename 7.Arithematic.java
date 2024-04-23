import java.util.Scanner;

class Arithematic {
    public static void main(String[] args) {
        System.out.println("Welcome to Arithematic operator");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int FirstNumber = input.nextInt();
        System.out.println("Enter Second Number");
        int SecondNumber = input.nextInt();

        int Add = FirstNumber + SecondNumber;
        int Sub = FirstNumber - SecondNumber;
        int mul = FirstNumber * SecondNumber;
        int devide = FirstNumber / SecondNumber;
        int modulus = FirstNumber % SecondNumber;

        System.out.println("Addition is:" + Add);
        System.out.println("Subtraction is:" + Sub);
        System.out.println("Multiplication is:" + mul);
        System.out.println("Devide is:" + devide);
        System.out.println("modulus is:" + modulus);

    }
}
