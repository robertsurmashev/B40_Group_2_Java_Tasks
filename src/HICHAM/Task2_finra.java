package HICHAM;

public class Task2_finra {

    //package WeeklyTasksFromDavid;


        public static void main(String[] args) {
            // Call the method to execute the logic
            FINRA();
        }

        public static void FINRA() {
            for (int i = 1; i <= 30; i++) {
                if (i % 15 == 0) { // divisible by both 3 and 5
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
    }

