public class Function {
    public static void main(String[] args) {
        /* System.out.println(" in main method");


       greetUser();
        System.out.println("in main method is calling complete");
        greetUser();
        greetUser();
        greetUser();

    */
        printFirstPattern();
       // printSecondPattern();
       // printThirdPattern();


    }
    public static  void printFirstPattern () {
        // System.out.println(" *");
        // System.out.println(" * * *");
        //System.out.println("* * * *");
        //  System.out.println("* * * * *");
        //   System.out.println("* * * * * *");

        int rows = 0;
        while (rows <100) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println(" ");
            rows++;
        }

 //   public static  void printSecondPattern (){
   //     System.out.println("* * * * *");
  //      System.out.println("* * * *");
//        System.out.println("* * *");
//        System.out.println("* *");
  //      System.out.println("*");
  //  }
//    public static void printThirdPattern () {
  //      System.out.println("     *");
   //     System.out.println("   * *");
   //     System.out.println("  * * *");
  //      System.out.println(" * * * *");
  //      System.out.println("* * * * * ");

    }
}
