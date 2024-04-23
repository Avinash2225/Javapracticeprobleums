import java.util.Scanner;

class temperaturecal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the temperature calculator\n");

        System.out.println("Enter the your temperature in Fahranheit  ");
        float Fah = input.nextFloat();

        //System.out.println("Enter the celcius value \n");

        //float cel = input.nextFloat();

        float Cel = (Fah-32) * 5.0f/9.0f;

        System.out.println("your Temperature is : " + Cel + "C" );


    }
}
