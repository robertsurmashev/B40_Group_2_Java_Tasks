package Omer;

public class Task6_Unique_Chars_From_String {


    //let's make a method that returns the unique

    public static void main(String[] args) {

        String word = uniqueChecker("CYYYDEOOOISSSHHHEBBBEST");
        System.out.println(word);
    }


    public static String uniqueChecker(String word) {
        //return unique chars in a string
        String uniqueChars = "";
        boolean unique = false;

        for (int i = 0; i < word.length(); i++) {
            unique = true;
            for (int j = 0; j < word.length(); j++) {
                if (j != i && word.charAt(i) == word.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                uniqueChars += word.charAt(i);
            }
        }
        return uniqueChars;
    }

}

