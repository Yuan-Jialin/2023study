package week1.day4_D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double credit[] = new double[n];
        double gpa[] = new double[n];

        double sum = 0;
        double p = 0;
        for (int i = 0; i < n; i++) {
            credit[i] = sc.nextDouble();
            p += credit[i];
        }
        for (int i = 0; i < n; i++)
            gpa[i] = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            sum += credit[i] * get(gpa[i]);
        }

        System.out.printf("%.2f", sum / p);


    }

    static double get(double a) {
        if (a >= 90)
            return 4.0;
        else if (a >= 85)
            return 3.7;
        else if (a >= 82)
            return 3.3;
        else if (a >= 78)
            return 3.0;
        else if (a >= 75)
            return 2.7;
        else if (a >= 72)
            return 2.3;
        else if (a >= 68)
            return 2.0;
        else if (a >= 64)
            return 1.5;
        else if (a >= 60)
            return 1.0;
        else
            return 0;


    }
}
