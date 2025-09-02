package semra;

public class Task5_FrequencyofCharacters {


    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static String frequencyOfChars(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            if (result.contains("" + ch)) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            result += ch + String.valueOf(count);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); // A3B2C1D2
    }
}
