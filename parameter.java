public class parameter {
    public static void main(String[] args) {

        System.out.println(sumTwoNumbers(4,7));
        System.out.println(sumTwoNumbers(40,7));
        System.out.println(sumTwoNumbers(34,7));
    }
    public  static int sumTwoNumbers (int First , int Second) {
       // int sum = First + Second;
        System.out.println("First number received :" + First  );
        System.out.println("Second number received :" + Second );

        int sum = First + Second;

        return  sum;
    }


}
