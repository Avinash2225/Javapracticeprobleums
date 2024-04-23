import java.util.Scanner;

class Search2DArray {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to the 2D search \n");
        int [] [] numArr = ArrayUtility.input2DArray();
        System.out.println(" Now Enter The Number you Want to Search");
        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        if (isFound) {
            System.out.println("Your Number was Found");
        } else {
            System.out.println(" Your number was not found");
        }
    }

    public static boolean search ( int [] [] numArr ,int num ){
        int i = 0;
        while (i< numArr.length){
            int j = 0;
            while (j< numArr[i].length){
                if (numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            j++;
        }
        return false;
    }
}
