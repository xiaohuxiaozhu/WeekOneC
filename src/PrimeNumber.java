import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = s.nextInt();


        if (n <= 1) {

            System.out.println(n + "\t" + "is not a prime number");
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + "\t" + "is not a prime number");

                break;
            } else {

                System.out.println(n + "\t" + "is a prime number");


            }
        }
    }
}




