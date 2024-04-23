import java.util.Scanner;

class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year calculator\n");
        System.out.println("Please Enter the Year");
        int year = input.nextInt();
        if (year%400==0 || (year % 4  == 0 && year % 100 !=0) ) {
            System.out.println("year is leap year");
        } else {

            System.out.println("your year is not leap year");
        }

    }


    }

