
import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int sum = 0;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Sum = " + sum);
    }
}
