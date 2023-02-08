package week4.day4_D;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.next());
        int b = sc.nextInt();

        if (a.compareTo(new BigDecimal("10")) == 1 && b >= 9) {
            System.out.println(-1);
        } else {

            BigDecimal pow = a.pow(b);
            int i = pow.compareTo(new BigDecimal("1000000000"));
            if (i == 1) {
                System.out.println(-1);
            } else {
                System.out.println(pow.toString());
            }

        }


    }
}
