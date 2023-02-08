package week1.day3_B;


    import java.util.Arrays;
    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ((t--) > 0) {
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            int sum = 0;
            int max = 0;
            Arrays.fill(a, 0);
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                max = Math.max(max, a[i]);
                a[i] = a[i - 1] + a[i];
            }
            int ans = max;
//            System.out.println();
//            System.out.println("--------------");
//            System.out.println("max="+max+" sum="+sum);

            for (int i = max; i <= sum; i++) {
                if (max == 0) {
                    ans = 0;
                    break;
                }

                if (sum % i != 0)
                    continue;

                if (i == sum)
                    ans = sum;
                else {
                    int be = 0, ed = 1;
                    for (; ed <= n; ed++) {
                        if (a[ed] - a[be] == i) {
                            be = ed;
                        } else if (a[ed] - a[be] > i) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    if (ed == n + 1 && ed - be == 1) {
                        ans = i;
                        break;
                    }


                }
            }
            //System.out.println("-------------------------------");
            if (ans != 0)
                System.out.println((n - sum / ans));
            else
                System.out.println("0");


        }
    }

}
