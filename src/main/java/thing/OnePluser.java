package thing;

import java.math.BigInteger;
import java.util.Arrays;

public class OnePluser {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("728509129536673284379577474947011174006");
        int[] array = new int[]{9, 9};
        int[] arrayPlusOne = plusOne(array);
        System.out.println(Arrays.toString(arrayPlusOne));
    }
    private static int[] plusOne(int[] digits) {
        BigInteger number;
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            numbers.append(digits[i]);
        }
        number = new BigInteger(numbers.toString());
        number = number.add(BigInteger.valueOf(1));

        numbers = new StringBuilder(String.valueOf(number));
        String numbersString = numbers.toString();
        digits = new int[numbersString.length()];
        for (int i = 0; i < numbersString.length(); i++) {
            digits[i] = Character.getNumericValue(numbersString.charAt(i));
        }
        return digits;
    }
}
