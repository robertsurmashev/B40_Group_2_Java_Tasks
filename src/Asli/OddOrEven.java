package Asli;



public class OddOrEven {
    public static void main(String[] args) {
        oddOrEven(7);
        oddOrEven(12);

    }
    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.print(num + " is an even number ");
        }  else {
            System.out.print(num + " is an odd number ");
        }
    }
}
