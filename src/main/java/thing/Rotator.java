package thing;

import java.util.Arrays;

public class Rotator {
    public static void main(String[] args) {
        int nums [] = new int[]{1,2};
        int k = 3;
        int [] arr = rotateRight(nums, k);
        System.out.println(Arrays.toString(arr));
    }

    private static int [] rotateRight(int[] array, int number) {
        if(number > array.length) {
            int factor = number/ array.length;
            number = number - factor * array.length;
        }
        int[] elementsToShift = new int[array.length - number];
        for (int i = 0; i < elementsToShift.length; i++) {
            elementsToShift[i] = array[i];
        }
        int[] elementsToRotate = new int[number];
        for (int i = 0, k = number; i < elementsToRotate.length && k >=0; i++, k--) {
            elementsToRotate[i] = array[array.length-k];
        }
        for(int i = 0; i < array.length; i++) {
            if(i < number) {
                array[i] = elementsToRotate[i];
            } else {
                array[i] = elementsToShift[i-number];
            }
        }
        return array;
    }

}
