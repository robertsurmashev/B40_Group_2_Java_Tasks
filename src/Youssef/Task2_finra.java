package Youssef;

public class Task2_finra {
    public static void main(String[] args) {


        //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
        //print "FIN" instead of the number and
        //for numbers which are a multiple of 5, print "RA" instead of the number.
        //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

        FINRA(18);
    }

    public static void FINRA(int num) {

        if (num < 1 || num > 30) {
            System.out.println("Number not in the range of 1 --> 30");
        }

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FINRA");
            }else if (num % 5 == 0) {
                System.out.println("RA");
            }else if (num % 3 == 0) {
                System.out.println("FIN");
            }else {
                System.out.println(num);
            }
        }
    }

