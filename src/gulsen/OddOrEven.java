package gulsen;


public class OddOrEven {
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(44);
    }

    public static void oddOrEven(int num){

        if (num%2==0){
            System.out.println("number is EVEN = " + num);
        }else {
            System.out.println("number is ODD = " + num);
        }
    }
}
