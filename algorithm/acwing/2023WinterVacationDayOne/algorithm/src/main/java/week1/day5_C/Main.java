package week1.day5_C;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        long max = 0;
        long tuition = 0;


        for (int i = 0; i < n; i++) {
            //System.out.println(a[i]);
            if (a[i] * (n - i) > max) {
                max = a[i] * (n - i);
                tuition = a[i];
            }
        }
        System.out.println(max + " " + tuition);

    }
}
