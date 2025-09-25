package semra;

public class Task4_reverseNegativeNumber {

    // reverseNegativeNumber
    // Write a return method that can reverse digits of a negative number and return it as int
    // input: -35  output: -53

    public static int reverseNegativeNumber(int num) {

        String str = String.valueOf(Math.abs(num));

        String reversed = new StringBuilder(str).reverse().toString();

        return -Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-35)); // -53
        System.out.println(reverseNegativeNumber(-120)); // -21
    }

}
