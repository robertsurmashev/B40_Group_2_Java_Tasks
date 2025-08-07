package semra;

public class oddOrEven {

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " It is an even number.");
        } else {
            System.out.println(number + " It is an odd number.");
        }
    }

    public static void main(String[] args) {
        checkEvenOrOdd(7);
        checkEvenOrOdd(10);
    }
}