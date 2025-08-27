package robert;

import java.util.ArrayList;
import java.util.Collections;

public class Task5_FrequencyOfCharacters_Return_Method {

    public static String frequencyOfChars(String str) {

        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> arr1 = new ArrayList<>();
        String strFinal = "";

        for (Character each : str.toCharArray()) {
            arr.add(each);
        }

        for (Character each : arr) {
            if (!arr1.contains(each)) {
                arr1.add(each);
                strFinal += each + "" + Collections.frequency(arr, each);
            }
        }
        return strFinal;
    }

    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCCCCCCCCCCCCCCCCCDDDDDD"));
    }
}