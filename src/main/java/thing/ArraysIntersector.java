package thing;

import java.util.Arrays;

public class ArraysIntersector {
    public static void main(String[] args) {
        int[] array = intersect(//new int[]{8,0,3}, new int[]{0,0});
       /* new int[]{1,2,2,1}, new int[]{2,2});*/new int[]{1,2}, new int[]{1,1}); //- passes
        System.out.println(Arrays.toString(array));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        int [] intersection = new int[]{};
        int index = 0;

        int [] outerCircleArray = nums1.length < nums2.length ? nums1 : nums2;
        int [] innerCircleArray = outerCircleArray == nums1 ? nums2 : nums1;
        for (int value : outerCircleArray) {

            int count1 = getElementCount(value, outerCircleArray);
            int count2 = getElementCount(value, innerCircleArray);
            int count = count1 < count2 ? count1 : count2;


            for (int i : innerCircleArray) {
                if (value == i) {
                    int intersectionCount = getElementCount(value, intersection);

                    if(intersectionCount < count) {
                        int[] oldIntersection = intersection;
                        intersection = new int[oldIntersection.length+1];

                        for(int j = 0; j < oldIntersection.length; j++ ) {
                            intersection[j] = oldIntersection[j];
                        }

                        intersection[index++] = i;
                    }

                    break;
                }
            }
        }
        return intersection;

    }

    private static int getElementCount(int element, int[] array) {
        int count = 0;
        if(array.length > 0) {
            for (int i : array) {
                if (i == element) {
                    count++;
                }
            }
        }
        return count;
    }
}
