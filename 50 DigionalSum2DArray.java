 class DigionalSum2DArray {
     public static void main(String[] args) {
         System.out.println("Welcome to the Digional sum");
         int[][] numArr = ArrayUtility.input2DArray();
         long sum = sumOfDigionals(numArr);
         System.out.println("Sum of Dignoals is: " +sum);
     }
     public static long sumOfDigionals(int[][] numArr) {
         long leftSum = sumOfLeftDigionals(numArr);
         long rightSum = sumOfRightDigionals(numArr);
         long sum = leftSum + rightSum;
         if (numArr.length % 2 != 0){
             int ind = numArr.length / 2;
             sum -= numArr[ind][ind];
         }
         return sum;
     }
     public static long sumOfLeftDigionals(int[][] numArr) {
         long sum = 0;
         int i = 0;
         while (i < numArr.length) {
             sum += numArr[i][i];
             i++;
         }
         return sum;
     }
     public static long sumOfRightDigionals(int[][] numArr) {
         long sum = 0;
         int i = 0;
         while (i < numArr.length) {
             int col = numArr.length - 1-i;
             sum += numArr[i][col];
             i++;
         }
         return sum;
     }
 }
