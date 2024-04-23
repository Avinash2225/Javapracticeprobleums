import java.util.Scanner;

 class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station\n \n");
        //Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a= input.nextInt();
        System.out.println("Enter the value of B: ");
        int b= input.nextInt();

        int c = a;

        a = b;

        b =c;
        System.out.println("Swapping done......");
        System.out.println("Value of a is:" + a );
        System.out.println("Value of b is:" + b);







    }


}
