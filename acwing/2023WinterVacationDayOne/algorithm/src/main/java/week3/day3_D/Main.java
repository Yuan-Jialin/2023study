package week3.day3_D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n + 1];
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        double a_average = (double) sum / n;
        double da = 0;
        for (int i = 1; i <= n; i++) {
            da += (a[i] - a_average) * (a[i] - a_average);
        }
        da = da / n;
        da = Math.sqrt(da);
        //double b[]=new double[n];
        for (int i = 1; i <= n; i++) {
            System.out.println((a[i] - a_average) / da);
        }
    }
}
