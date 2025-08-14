package semra;

public class Task3_swapTwoNumbers {
    public static void swapWithoutTemp() {
        int a = 10;
        int b = 20;
        System.out.println("Before: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        swapWithoutTemp();
    }
}
