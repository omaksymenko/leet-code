package thing;

public class Main {
    public static void main(String[] args) {
        int [] nums = new int [] {0,0,1,1,1,1,1,2,2,2,3,3,4};
        int count = removeDupes(nums);
        System.out.println(count);
    }

    private static int removeDupes(int [] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i + 1]) {
                int dupesCountBetweenIndices = findCountEqualElementsFrom(array, i);
                // need to rewrite numbers between i and newly set value (set them as the latter)
                for(int z = i+1; z  < i+1 + dupesCountBetweenIndices && i+1 + dupesCountBetweenIndices < array.length; z++) {
                    array[z] = array[i + 1 + dupesCountBetweenIndices];
                }
            }
        }

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                return i+1;
            }
        }
        return array.length;
    }

    private static int findCountEqualElementsFrom(int[] numbers, int index) {
        int dupesCounter = 0;
        for (int i = index + 1; i < numbers.length; i++) {
            if (numbers[index] == numbers[i]) {
                dupesCounter++;
            }
        }
        return dupesCounter;
    }
}
