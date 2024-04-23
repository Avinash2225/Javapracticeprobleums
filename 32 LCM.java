import java.util.Scanner;

class LCM {
    public static void main ( String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.println("Enter your number:");
        int first = input.nextInt();
        System.out.println("Please enter your number:");
        int second = input.nextInt();
        int lcm = lcm (first , second);
        System.out.println("LCM of the numbers is :" + lcm);

    }

    public static int  lcm (int first, int second){
        int i = 1;
        while (i <= second ){
            int factor = first*i;
            if (factor % second ==0) {
                return factor ;
            }
            i++;
        }
    return 0;
    }
}
