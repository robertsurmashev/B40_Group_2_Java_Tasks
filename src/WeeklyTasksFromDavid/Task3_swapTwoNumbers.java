package WeeklyTasksFromDavid;

public class Task3_swapTwoNumbers {
    public static void main(String[] args) {

        swapWithoutTemp(3, 2);

    }


    //Swap two variables' values without using a third variable

    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b; // sum of both
        b = a - b; // subtract b from sum
        a = a - b; // subtract new b from sum

        System.out.println("After swap: a = " + a + ", b = " + b);


    }

}

