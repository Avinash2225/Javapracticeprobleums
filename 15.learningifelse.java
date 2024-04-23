import javax.lang.model.element.Name;

class learningifelse {
    public static void main(String[] args) {

        /* boolean isMale = true;
         String name= "bob";
         System.out.println("before if");
         if (isMale) {

             System.out.println("Mr ." + name);
         }  else {
             System.out.println("Mr." + name);

             System.out.println("after if");*/


        boolean isSenoircitizen = false;
        boolean isanAdult = false;

        if (isSenoircitizen) {

            System.out.println("Hello Senoir citizen");
        } else {
            if (isanAdult) {

                System.out.println("Hello Adult");

            } else {
                System.out.println("Hello child");


            }
        }
    }
}