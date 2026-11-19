
import java.util.Scanner;

class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int N = sc.nextInt();

        System.out.println("Palindrome numbers:");

        for (int i = 1; i < N; i++) {
            int temp = i;
            int rev = 0;

            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            if (i == rev) {
                System.out.print(i + " ");
            }
        }
    }
}
