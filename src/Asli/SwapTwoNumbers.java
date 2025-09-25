package Asli;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 3,  b = 2;

        System.out.println("Before swap a= " + a + ", b= " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap a= " + a + ", b= " + b);



    }
}
