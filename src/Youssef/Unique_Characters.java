package Youssef;
/*
Write a return method that can find the unique characters from the String. Ex.: unique("AAABBBCCCDEF") ---> "DEF";
 */

public class Unique_Characters {

    static String str = "AAABBBCCCDEFFkpp";

    public static void main(String[] args) {
        System.out.println(unique(str));

    }
        public static String unique(String str){
            String result = "";
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    result += ch;
                }
            }
            return result;
        }
}


