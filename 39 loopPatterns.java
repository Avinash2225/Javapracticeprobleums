import java.util.Scanner;

class loopPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are here to the Pattern\n");
        System.out.println("please enter the no of rows: ");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);
        printReverseRightHalfPyramid(rows);
        printLeftHalfPyramid(rows);
    }

    public static void printReverseRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is the reverse right half pyramid");
        int rows = maxRows;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void printRightHalfPyramid(int maxRows) {
        System.out.println("\n Here is right half pyramid");
        int rows = 0;
        while (rows < maxRows)
            System.out.println("*");
        int i = 0;
        while (i < rows) {
            System.out.print(" *");
            i++;
        }
        System.out.println();
        rows--;
    }
}

public static void printLeftHalfPyramid ( int maxRows){
    System.out.println("\n Here is left Half pyramid");
    int rows = maxRows;
    while (rows > 0){
    int j = 0;
    while (j< rows){
        System.out.println(" ");
        j++;
    }
    // this loop prints stars
    int i = 0;
    while (i < =(maxRows - rows)) {
        System.out.print("* ");
        i++;
    }
    System.out.println();
    rows--;
}
}










































        /* public static void printFirstPattern(int maxRows){
        int rows = 0;
        while ( rows < maxRows){
            System.out.print("*");
            int i = 0;
            while ( i < rows) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows++;

            }*/

