package week2.day3_D;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n < 10)
            System.out.println(m);
        else {
            Queue<number> v = new PriorityQueue<>(new Comparator<number>() {
                @Override
                public int compare(number o1, number o2) {
                    if (o1.sum != o2.sum) {
                        return o1.sum - o2.sum;
                    } else {
                        return o1.num - o2.num;
                    }
                }
            });
            for (int i = 1; i <= n; i++)
                v.add(new number(i, get(i)));

            while ((m--) > 1) {
                v.poll();
            }
            System.out.println(v.peek().num);

        }

    }

    public static int get(int a) {
        int sum = 0;
        while (a != 0) {
            sum += (a % 10);
            a /= 10;
        }
        return sum;


    }
}

class number {

    int num;
    int sum;

    public number(int num, int sum) {
        this.num = num;
        this.sum = sum;
    }
}
