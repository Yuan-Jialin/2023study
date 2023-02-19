package Week1.day3.AcWing789;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/18 15:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        while (q-- > 0) {
            int k = sc.nextInt();
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (a[mid] >= k) r = mid;
                else l = mid + 1;
            }
            if (a[l] != k)
                System.out.println("-1 -1");
            else {
                System.out.printf("%d ", l);
                l = 0;
                r = n - 1;
                while (l < r) {
                    int mid = r + l + 1 >> 1;
                    if (a[mid] <= k) l = mid;
                    else r = mid - 1;
                    System.out.println(l + " " + r);
                }
                System.out.printf("%d \n", r);


            }
        }
    }
}

class Solution {
    public int translateNum(int num) {
        Integer a = num;

        String s = a.toString();
        int n = s.length();
        int dp[] = new int[n + 1];
        Arrays.fill(dp, 0);
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (s.charAt(i - 1) - '0' + (s.charAt(i - 2) - '0') * 10 <= 25)
                dp[i] += dp[i - 2];
            dp[i] += dp[i - 1];
        }
        return dp[n];


    }
}