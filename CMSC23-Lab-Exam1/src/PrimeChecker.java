import java.util.Scanner;

public class PrimeChecker {

    static boolean isPrime(int n, int i) {
        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }

    public static void main(String[]args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPrime(number, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
