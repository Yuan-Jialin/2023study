package Week1.day5.AcWing95;

import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/25 11:09
 */
public class Main {
    static StringBuilder map[] = new StringBuilder[5];
    static StringBuilder copy[]=new StringBuilder[5];

    public static void main(String[] args) {
        int ans = 9999999;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {

            for (int i = 0; i < 5; i++) {
                map[i] = new StringBuilder(sc.next());
                copy[i]=new StringBuilder(map[i]);
            }
            for (int k = 0; k < 1 << 5; k++) {
                int res = 0;
                for (int j = 0; j < 5; j++) {
                    if ((k >> j & 1) == 1) {
                        turn(0, j);
                    }
                }
                for (int i = 0; i < 4; i++)
                    for (int j = 0; j < 5; j++) {
                        if (map[i].charAt(j) == '0') {
                            turn(i + 1, j);
                            res++;
                        }

                    }
                boolean is_successful = true;
                for (int j = 0; j < 5; j++)
                    if (map[4].charAt(j) == '0') {
                        is_successful = false;
                        break;
                    }
                if (is_successful) ans = Math.min(ans, res);
                for (int i = 0; i < 5; i++)
                    map[i]=new StringBuilder(copy[i]);

            }
            if (ans > 6) System.out.println(-1);
            else System.out.println(ans);

        }

    }

    public static void turn(int x, int y) {
        int dx[] = {0, -1, 0, 1, 0};
        int dy[] = {0, 0, 1, 0, -1};
        for (int i = 0; i < 5; i++) {
            int a = x + dx[i], b = y + dy[i];
            if (a >= 0 && a < 5 && b >= 0 && b < 5) {
                map[a].replace(b, b + 1, (map[a].charAt(b) - '0') == 1 ? "0" : "1");
            }
        }

    }


}
