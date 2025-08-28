package Youssef;

public class ReverseNegativeNumber {



   public static int reversedNegativeNumber(int num) {

       String str = Integer.toString(num); //

       String positivePart = str.substring(1);

       String reversed = new StringBuilder(positivePart).reverse().toString();

       String finalStr = "-" + reversed;

       return Integer.parseInt(finalStr);

   }
   public static void main(String[] args) {

       System.out.println(reversedNegativeNumber(-687));

   }

}
