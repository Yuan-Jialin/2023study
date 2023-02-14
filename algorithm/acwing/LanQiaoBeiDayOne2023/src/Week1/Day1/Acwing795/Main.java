package Week1.Day1.Acwing795;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long a[] = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
            a[i] += a[i - 1];
        }
        while ((m--) > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(a[r] - a[l - 1]);
        }

    }
}
