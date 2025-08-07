package Youssef;

public class Array_Double23_Task {


    public static boolean double23(int[] nums) {

        if (nums.length == 2) {
            if (nums[0] == 2 && nums[1] == 2) {
                return true;
            }
            if (nums[0] == 3 && nums[1] == 3) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(double23(new int[]{2,2}));
        System.out.println(double23(new int[]{3, 3}));  // true
    }
}

