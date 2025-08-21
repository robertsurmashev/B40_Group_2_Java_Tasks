package robert;

public class Task4_Reverse_Negative_Number {

    public static int reverseNegativeNumber(int originalNumber) {

        if (originalNumber >= 0) {
            return 0;
        } else {
            originalNumber = (-1) * originalNumber;
            int reversed = 0;

            if ((originalNumber > 0) && (originalNumber < 100)) {
                int lastDigit = originalNumber % 10;
                reversed = lastDigit * 10 + originalNumber / 10;

            } else if ((originalNumber >= 100) && (originalNumber < 1000)) {
                int lastDigit = originalNumber % 10;
                int middleDigit = originalNumber % 100 / 10;
                reversed = lastDigit * 100 + middleDigit * 10 + originalNumber / 100;

            } else if ((originalNumber >= 1000) && (originalNumber < 10000)) {
                int lastDigit = originalNumber % 10;
                int secondFromLast = originalNumber % 100 / 10;
                int thirdFromLast = originalNumber % 1000 / 100;
                reversed = lastDigit * 1000 + secondFromLast * 100 + thirdFromLast * 10 + originalNumber / 1000;

            } else if ((originalNumber >= 10000) && (originalNumber < 100000)) {
                int lastDigit = originalNumber % 10;
                int secondFromLast = originalNumber % 100 / 10;
                int thirdFromLast = originalNumber % 1000 / 100;
                int fourthFromLast = originalNumber % 10000 / 1000;
                reversed = lastDigit * 10000 + secondFromLast * 1000 + thirdFromLast * 100 + fourthFromLast * 10 + originalNumber / 10000;
        }
            return (-1) * reversed;
        }
    }

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-48305));
    }
}
