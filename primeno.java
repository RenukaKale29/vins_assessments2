import java.util.Scanner;

public class primeno {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && n > 1)
            System.out.println("The number " + n + " is prime");
        else
            System.out.println("The number " + n + " is not prime");
    }
}
