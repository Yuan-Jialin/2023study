package week2.day5_D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String num = a.substring(1, 2);
        int n = num.charAt(0) - '0';
        int h = 1189, w = 841;
        while ((n--) > 0) {

            if (h > w) {
                h /= 2;
            } else {
                w /= 2;
            }
        }
        System.out.println(Math.max(h, w));
        System.out.println(Math.min(h, w));

    }
}
