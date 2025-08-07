package semra;

public class WeeklyTasksFromDavid {

            public static void checkEvenOrOdd(int number) {
                if (number % 2 == 0) {
                    System.out.println(number + " is an even number .");
                } else {
                    System.out.println(number + " is an odd number .");
                }
            }

            public static void main(String[] args) {
                checkEvenOrOdd(7);
                checkEvenOrOdd(10);
            }
        }