
import java.util.Scanner;

class ArrayConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[6];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            c[i] = a[i];
        }

        System.out.println("Enter second array elements:");
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
            c[i + 3] = b[i];
        }

        System.out.println("Concatenated array:");
        for (int i = 0; i < 6; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
