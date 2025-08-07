package Youssef;

import java.util.Scanner;

public class OddOrEven {
    //Write  a method which can identifies given number is even or odd
    public static void main(String[] args) {

      numberCheck(5);
      numberCheck(10);

    }
    public static void numberCheck ( int n){

        if (n % 2 == 0) {
            System.out.println(" The entered number is Even");
        } else {
            System.out.println(" The entered number is Odd");
        }

    }
}