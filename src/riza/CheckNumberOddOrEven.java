package riza;

public class CheckNumberOddOrEven {
    public static void main(String[] args) {
checkNumber(4);
    }

    public static void checkNumber(int num){

        if (num%2 == 0){
            System.out.println("Number is even!");
        }
        else {
            System.out.println("Number is odd!");
        }
    }
}
