package Week1.day3.AcWing1221;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description unhappy
 * @Date 2023/2/20 11:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n + 5];
        int d[] = new int[n + 5];
        Arrays.fill(c, -1);
        for (int i = 0; i * i <= n; i++) {
            for (int j = 0; i * i + j * j <= n; j++) {
                int t = i * i + j * j;
                if (c[t] == -1) {
                    c[t] = i;
                    d[t] = j;
                }
            }
        }

        for (int i = 0; i * i <= n; i++) {
            for (int j = 0; j * j + i * i <= n; j++) {

                int sum = n - i * i - j * j;
                if (c[sum] != -1) {
                    System.out.printf("%d %d %d %d", i, j, c[sum], d[sum]);
                    return;
                }

            }
        }
    }
}
