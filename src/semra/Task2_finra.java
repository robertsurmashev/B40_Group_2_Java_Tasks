package semra;

public class Task2_finra {
    public static void printFinRa() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) { //If we really want to print "FINRA" when a number is a multiple of both 3 and 5,
                // we should check for multiples of both 3 and 5 first.
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printFinRa();
    }
}
