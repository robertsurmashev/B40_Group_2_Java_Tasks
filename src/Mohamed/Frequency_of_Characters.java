package Mohamed;

import java.util.ArrayList;

public class Frequency_of_Characters {

    public static String frequencyOfChars(String str) {
        ArrayList<Character> checked = new ArrayList<>(); // keeps track of counted chars
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (checked.contains(ch)) {
                continue; // skip if already counted
            }

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            result.append(ch).append(count);
            checked.add(ch); // mark this char as counted
        }

        return result.toString();
    }




}
