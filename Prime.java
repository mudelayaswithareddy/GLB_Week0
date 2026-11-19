import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;

        for (i = 2; i < n; i++) {
            if (n % i == 0)
                break;
        }

        if (n > 1 && i == n)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}