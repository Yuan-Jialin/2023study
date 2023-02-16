package Week1.Day2.AcWing798;

import java.util.*;
import java.io.*;

/**
 * @Author 袁佳林
 * @Description 不开心啊
 * @Date 2023/2/16 20:48
 */
public class Main {
    private static int[][] c;

    public static void main(String[] args) {
        InputReader ip = new InputReader(System.in);
        PrintWriter op = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = ip.nextInt(), m = ip.nextInt(), q = ip.nextInt();
        c = new int[n + 2][m + 2];
        for (int i = 1; i <= n; ++i)
            for (int j = 1; j <= m; ++j)
                add(i, j, i, j, ip.nextInt());
        for (int i = 0; i < q; ++i) {
            int x1 = ip.nextInt(), y1 = ip.nextInt();
            int x2 = ip.nextInt(), y2 = ip.nextInt();
            int v = ip.nextInt();
            add(x1, y1, x2, y2, v);
        }
        for (int i = 1; i <= n; ++i)
            for (int j = 1; j <= m; ++j)
                c[i][j] += c[i - 1][j] + c[i][j - 1] - c[i - 1][j - 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; ; ++j) {
                op.print(c[i][j]);
                if (j == m) break;
                op.print(' ');
            }
            op.println();
        }
        op.flush();
    }

    private static void add(int x1, int y1, int x2, int y2, int v) {
        c[x1][y1] += v;
        c[x1][y2 + 1] -= v;
        c[x2 + 1][y1] -= v;
        c[x2 + 1][y2 + 1] += v;
    }
}

class InputReader {
    private final BufferedReader buf;
    private StringTokenizer tkl;

    public InputReader(InputStream is) {
        buf = new BufferedReader(new InputStreamReader(is));
    }

    public boolean hasNext() {
        try {
            while (tkl == null || !tkl.hasMoreElements())
                tkl = new StringTokenizer(buf.readLine());
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public String next() {
        return hasNext() ? tkl.nextToken() : null;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}



