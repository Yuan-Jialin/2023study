package Week1.Day1.Acwing99;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        r = Math.min(r, 5001);
        long map[][] = new long[5010][5010];
        int x, y;
        long v;
        int max_x = r, max_y = r, min_x = 9999, min_y = 9999;
        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            max_x = Math.max(x + 1, max_x);
            max_y = Math.max(y + 1, max_y);
            min_y = Math.min(y + 1, min_y);
            min_x = Math.min(x + 1, min_x);
            v = sc.nextLong();
            map[x + 1][y + 1] += v;
        }
        for (int i = 1; i <= max_x; i++) {
            for (int j = 1; j <= max_y; j++) {
                map[i][j] = map[i][j] + map[i][j - 1] + map[i - 1][j] - map[i - 1][j - 1];
            }
        }
        long ans = 0;
        for (int i = r; i <= max_x; i++) {
            for (int j = r; j <= max_y; j++) {
                ans = Math.max(ans, map[i][j] - map[i - r][j] - map[i][j - r] + map[i - r][j - r]);
            }
        }
        System.out.println(ans);

    }
}

