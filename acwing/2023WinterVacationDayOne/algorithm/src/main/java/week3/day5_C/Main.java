package week3.day5_C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int cha = sum - m;
        int dp[] = new int[cha + 1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = cha; j >= a[i]; j--) {
                dp[j] = Math.max(dp[j - a[i]], dp[j]);
            }
        }

       /* for (int i=0;i<=cha;i++) {
            System.out.println(i+" "+dp[i]);
        }*/

        for (int i = cha; i >= 0; i--) {
            if (dp[i] == 1) {
                System.out.println(sum - i);
                break;
            }
        }

    }
}
