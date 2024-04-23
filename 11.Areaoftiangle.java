import java.util.Scanner;

class Areaoftiangle {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println(" Now we are calculating Area of the triangle\n");
          System.out.println("Enter the base of the triangle in centimeter: ");
          double base = input.nextDouble();
          System.out.println("Now please enter your perpendicular in centimeter: ");
          double height = input.nextDouble();

          double area = (base*height)/2;

          System.out.println("Area of the triangle: " +area + "Centimetersquare");




     }
}
