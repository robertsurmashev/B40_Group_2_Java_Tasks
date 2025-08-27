package robert;

import java.util.ArrayList;
import java.util.Collections;

public class Task5_FrequencyOfCharacters_Void_Method {

    public static void frequencyOfChars(String str) {

        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> arr1 = new ArrayList<>();

        for (Character each : str.toCharArray()) {
            arr.add(each);
        }

        for (Character each : arr) {
            if (!arr1.contains(each)) {
                arr1.add(each);
                System.out.print(each + "" + Collections.frequency(arr, each));
            }
        }
    }

    public static void main(String[] args) {

        frequencyOfChars("AAABBCDD");
    }
}
