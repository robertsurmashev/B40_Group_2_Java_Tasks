package gulsen;

public class ReverseNegativeNumber {
    // reverseNegativeNumber
    // Write a return method that can reverse digits of a negative number
    // and return it as int
    // input: -35 output: -53

    public static int reverseNegative(int num) {
        int n = -num;   // pozitif hale getiriyoruz
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return -reversed;  // tekrar negatife çeviriyoruz
    }

    public static void main(String[] args) {
        System.out.println(reverseNegative(-35));   // -53
        System.out.println(reverseNegative(-120));  // -21
        System.out.println(reverseNegative(-90));   // -9
    }
}
