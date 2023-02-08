package week4.day2_C;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), l = sc.nextInt(), s = sc.nextInt();
        Set<Long> set = new HashSet<>();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            a[i][0] = x;
            a[i][1] = y;
            set.add(hash(x, y));
        }

        int[][] b = new int[s + 1][s + 1];
        for (int i = s; i >= 0; i--) {
            for (int j = 0; j <= s; j++)
                b[i][j] = sc.nextInt();
        }

        int res = 0;
        for (int[] p : a) {
            int bx = p[0], by = p[1];
            if (bx + s > l || by + s > l) continue;
            boolean flag = true;
            label:
            for (int i = 0; i <= s; i++) {
                for (int j = 0; j <= s; j++) {
                    int t = b[i][j];
                    long h = hash(i + bx, j + by);
                    if (t == 1) {
                        if (!set.contains(h)) {
                            flag = false;
                            break label;
                        }
                    } else {
                        if (set.contains(h)) {
                            flag = false;
                            break label;
                        }
                    }
                }
            }
            if (flag) {
                res++;
            }
        }
        System.out.println(res);
    }

    static long hash(long a, long b) {
        return a << 31 | b;
    }
}

