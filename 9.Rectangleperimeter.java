import java.util.Scanner;

class Rectangleperimeter {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to perimeter calculator");
         System.out.println("please enter 1st sides of the rectangle");
         double a = input.nextDouble();
         System.out.println("please enter 2nd sides of the rectangle");
         double b = input.nextDouble();
         System.out.println("please enter 3ed sides of the rectangle");
         double c = input.nextDouble();
         System.out.println("please enter 4th sides of the rectangle");
         double d = input.nextDouble();

         double perimeter = a+b+c+d;

         System.out.println("perimeter of your rectangle is:" +perimeter);





     }

}
