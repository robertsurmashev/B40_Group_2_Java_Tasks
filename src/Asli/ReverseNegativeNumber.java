package Asli;

import org.w3c.dom.ls.LSOutput;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-35)); //output: -53
        System.out.println(reverseNegativeNumber(-120)); // Output: -21
    }

    public static int reverseNegativeNumber(int num) {
        boolean isNegative = num < 0;
        num = Math.abs(num);

        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;

            // Check for overflow before multiplying and adding
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                // If overflow occurs, return 0 (common convention)
                return 0;
            }
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return isNegative ? -reversed : reversed;
    }
}
