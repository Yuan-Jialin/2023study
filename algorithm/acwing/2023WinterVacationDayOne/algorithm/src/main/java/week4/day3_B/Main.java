package week4.day3_B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    final static int N = 100010;
    static int edge[] = new int[N];
    static int next[] = new int[N];
    static int last[] = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Arrays.fill(last, -1);
        int idx = 0;
        for (int i = 2; i <= n; i++) {
            int p = sc.nextInt();
            add(p, i, idx);
            idx++;
        }

        System.out.println(dfs(1));


    }


    public static void add(int a, int b, int cnt) {
        edge[cnt] = b;
        next[cnt] = last[a];
        last[a] = cnt;
    }

    public static int dfs(int u) {

        int max = 0, cnt = 0;
        for (int i = last[u]; i != -1; i = next[i]) {
            max = Math.max(max, dfs(edge[i]));
            cnt++;
        }
        return max + cnt;
    }
}
