package Youssef;

public class Task3_swapTwoNumbers {

    public static void main(String[] args) {

        //Swap two variables' values without using a third variable

        int a = 2;
        int b = 5;

        a = a + b; // a = 7
        b = a - b; // b = 2
        a = a - b; // a = 5

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }

}
