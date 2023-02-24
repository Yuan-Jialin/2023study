package Week1.day4.AcWing2816;

import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/24 19:47
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) i++;
            j++;
        }
        if (i == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
