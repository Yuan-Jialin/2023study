package Week2.day1.AcWing97;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 14:49
 */
import java.util.Scanner;
public class Main {
    public static final int MOD = 9901;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int res = 1;
        for(int i = 2; i <= A; i++) {
            int s = 0;
            while(A % i == 0) {
                s++;
                A /= i;
            }
            if(s != 0) {
                res = res * sum(i, s*B) % MOD;
            }
        }
        if(A == 0) res = 0;
        System.out.println(res);

        in.close();
    }

    public static int sum(int p, int k) {
        if(k == 0) return 1;
        if(k % 2 == 0) return (p % MOD * sum(p, k-1) + 1) % MOD;
        return (1 + qmi(p, k/2+1)) % MOD * sum(p, k/2)% MOD;
    }

    public static int qmi(int p, int k) {
        p %= MOD;
        int res = 1;
        while(k != 0) {
            if((k & 1) != 0) res = res * p % MOD;
            p = p*p % MOD;
            k >>= 1;
        }
        return res;
    }
}

