package Youssef;

public class Array1_Java_MakeLast {
    public static void main(String[] args) {

        int[] result = makeLast(new int[]{4, 5, 6});
        // Print the result

        for (int num : result) {
            System.out.print(num + " ");

        }

    }
    public static int[] makeLast(int[] nums) {

        int len = nums.length;

        int[] result = new int[len * 2];

        result[result.length -1] = nums[len-1];

        return result;
    }
}
