package riza;

public class CheckNumberOddOrEven {
    public static void main(String[] args) {
checkEvenOrOdd(4);
    }

    public static void checkEvenOrOdd(int num){

        if (num%2 == 0){
            System.out.println("Number is even!");
        }
        else if (num%2 ==1){
            System.out.println("Number is odd!");
        }
        else {
            System.out.println("Number equals zero");
        }
    }
}
