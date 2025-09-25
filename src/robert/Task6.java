package robert;

import java.util.ArrayList;
import java.util.Collections;

public class Task6 {

    public static void main(String[] args) {

        /*
        Write a return method that can find the unique characters from the String.
        Ex.: unique("AAABBBCCCDEF") ---> "DEF";
         */
        System.out.println(uniqueChars("AAABBBCCCDEF"));
    }
    public static String uniqueChars(String str) {             // Used String as return type (to get exact final String)

        ArrayList<Character> arr = new ArrayList<>();          // Used an ArrayList to utilize Collections.frequency() method

        StringBuilder strUnique = new StringBuilder();         // Used StringBuilder to create a required final String

        for (Character ch : str.toCharArray()) {               // Adding all characters from given String to ArrayList

                arr.add(ch);
        }
        for (Character ch : arr) {                             // Unique (characters with frequency 1) added to StringBuilder

            if (Collections.frequency(arr, ch) == 1) {         // Calling frequency method from Collections util class

                strUnique.append(ch);
            }
        }
        return strUnique.toString();                           // Converting StringBuilder to String and return
    }
}
