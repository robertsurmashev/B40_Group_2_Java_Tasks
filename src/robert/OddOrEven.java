package robert;

public class OddOrEven {

    public static void oddOrEvenMethod(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is an even number");
        } else {
            System.out.println(x + " is an odd number");
        }
    }

    public static void main(String[] args) {

        oddOrEvenMethod(21);
    }
}