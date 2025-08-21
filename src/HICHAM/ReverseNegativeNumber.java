package HICHAM;

public class ReverseNegativeNumber {



        public static int reverseNegativeNumber(int num) {
            if (num >= 0) {
                throw new IllegalArgumentException("Input must be a negative number.");
            }

            // Convert to positive, reverse it, then make it negative again
            int reversed = Integer.parseInt(new StringBuilder(String.valueOf(-num)).reverse().toString());

            return -reversed;
        }

        public static void main(String[] args) {
            int input = -35;
            int output = reverseNegativeNumber(input);
            System.out.println("Reversed: " + output);  // Output: -53
        }
    }


