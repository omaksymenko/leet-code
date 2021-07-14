package thing;

public class IntelliasMain {
    /*

[-2, 3, -4, 1, 4, 5, -2, -5, 2, 1]

[1, 4, 5] = 10
    * */
    public static void main(String[] args) {
        int [] array = new int[] {-2, 3, -4, 1, 4, 5, -2, -5, 2, 1, 10};

        int maxSum = array[0];


        for(int i = 0; i < array.length; i++) {
            int sum = array[i];
            for (int j = i+1; j < array.length; j++) {
                sum += array[j];
                if(maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println( maxSum);
    }
}
