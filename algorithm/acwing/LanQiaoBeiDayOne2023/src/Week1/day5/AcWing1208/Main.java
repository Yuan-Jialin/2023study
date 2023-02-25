package Week1.day5.AcWing1208;

import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/25 10:55
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        String now = sc.next();
        int ans = 0;
        int a[] = new int[now.length() + 1];
        for (int i = 0; i < now.length(); i++) {
            if (now.charAt(i) == target.charAt(i) && a[i] % 2 == 0)
                continue;
            else if (now.charAt(i) != target.charAt(i) && a[i] % 2 == 1) {
                continue;
            } else {
                a[i]++;
                a[i + 1]++;
                ans++;
            }

        }
        System.out.println(ans);
    }
}
