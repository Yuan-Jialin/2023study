package week3.day4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n + 1];
        int c[] = new int[n + 1];
        c[0] = 1;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            //c[i]=c[i-1]*a[i];
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf(m % a[i] + " ");
            m = m - m % a[i];
            m /= a[i];
        }
        /*
         *
         *
         *   b1+a1*b2+a1*a2*b3
         *
         * b1=m%a1`
         * a1*b2+a1*a2*b3
         * b2+a2*b3
         *
         *
         *
         *  */


    }
}
