package class14;

public class Task3 {
//Write a method to return whether given number is prime or not?

    boolean prime(int number) {

        boolean isPrime = false;

        if (number > 1) {
            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                }else{
                    isPrime=true;
                }
            }
        } else {
            isPrime = false;

        }return isPrime;
    }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        boolean result=obj.prime(11);
        System.out.println(result);
    }
}
