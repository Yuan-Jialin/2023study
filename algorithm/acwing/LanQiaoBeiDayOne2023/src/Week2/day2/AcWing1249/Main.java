package Week2.day2.AcWing1249;

import java.io.*;


/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 15:19
 */
public class Main {
    static int N = 20010;
    static int[] p = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wt = new PrintWriter(new OutputStreamWriter(System.out));

        String[] s1 = bf.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);

        for (int i = 1; i <= n; i++) p[i] = i;
        while (m-- > 0) {
            String[] s2 = bf.readLine().split(" ");
            int a = Integer.parseInt(s2[0]);
            int b = Integer.parseInt(s2[1]);
            if (find(a) != find(b)) p[find(a)] = find(b);
        }
        int q = Integer.parseInt(bf.readLine());
        while (q-- > 0) {
            String[] s3 = bf.readLine().split(" ");
            int a = Integer.parseInt(s3[0]);
            int b = Integer.parseInt(s3[1]);
            if (find(a) == find(b)) wt.println("Yes");
            else wt.println("No");
        }
        wt.flush();
    }

    public static int find(int a) {
        if (a != p[a]) p[a] = find(p[a]);
        return p[a];
    }
}
