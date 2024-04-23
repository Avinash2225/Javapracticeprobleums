import java.util.Scanner;

class grademarks {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Welcome to grade calculator");
         System.out.println("please enter your percentage");
         float percentage = input.nextFloat();
         if (percentage>=90) {
             System.out.println("you have got grade A");
         } else if (percentage>=75) {
             System.out.println("you have got grade B");
         } else if (percentage>=60) {
             System.out.println("you have got C");
         } else if (percentage>=30) {
             System.out.println("you have got grade D please work hard");
         } else {
             System.out.println("Sorry you have fail the test and got F");
             
         }
     }
     }
