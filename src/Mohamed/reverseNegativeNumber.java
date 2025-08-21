package Mohamed;

public class reverseNegativeNumber {


    public static void main(String[] args) {


        System.out.println("reverse number = " + reverse(-123));



    }

    public static int reverse(int num) {
        int reversed = 0;
        int sign = 1;

        // If number is negative, mark the sign and make it positive
        if (num < 0) {
            sign = -1;
            num = -num;   // turn into positive without
        }

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return sign * reversed;
    }





}
