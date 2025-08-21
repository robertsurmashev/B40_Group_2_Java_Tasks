package riza;

public class Task4_reverseNegativeNumber {
    public static int reverseNegativeNumber(int num) {
        // make the number positive temporarily
        int positive = Math.abs(num);

        // reverse the positive part
        int reversed = 0;
        while (positive > 0) {
            int digit = positive % 10;
            reversed = reversed * 10 + digit;
            positive /= 10;
        }

        // return with minus sign
        return -reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-23));  // Output: -53
        System.out.println(reverseNegativeNumber(-32)); // Output: -21
        System.out.println(reverseNegativeNumber(-2435));// Output: -6789
    }
}

