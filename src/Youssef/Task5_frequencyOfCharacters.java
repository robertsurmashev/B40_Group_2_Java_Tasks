package Youssef;

public class Task5_frequencyOfCharacters {


    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/


        public static String frequencyOfChars(String str) {
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (result.contains("" + each)) continue;

                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == each) count++;
                }

                result += each + "" + count;
            }

            return result;
        }

        public static void main(String[] args) {
            System.out.println(frequencyOfChars("AAABBCCCCDD"));
        }
    }
