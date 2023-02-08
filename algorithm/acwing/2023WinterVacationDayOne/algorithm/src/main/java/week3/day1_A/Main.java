package week3.day1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    static int a[];
    static int b[];

    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int l = 0, r = (int) 1e6;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (check(mid))
                l = mid;
            else
                r = mid - 1;
        }

        long res = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= r) {
                int c = (a[i] - r) / b[i] + 1;
                int end = a[i] - (c - 1) * b[i];
                cnt += c;
                res += (long) (a[i] + end) * c / 2;

            }

        }
        System.out.println(res - (cnt - m) * r);


    }

    public static boolean check(int mid) {
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= mid)
                res += (a[i] - mid) / b[i] + 1;
        }

        return res >= m;

    }
}
