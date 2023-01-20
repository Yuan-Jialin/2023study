package week2.day4;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer a[] = new Integer[n + 1];
        long sum[] = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            sum[i] = sum[i - 1] + a[i];
        }
        Arrays.sort(a, 1, n + 1, new MyComparator());
        int m = sc.nextInt();
        int b[] = new int[n + 2];
        Long before = 0L;
        while ((m--) > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            before += (sum[r] - sum[l - 1]);
            b[l] += 1;
            b[r + 1] -= 1;

        }
        Queue<num> v = new PriorityQueue<>(new Comparator<num>() {
            @Override
            public int compare(num o1, num o2) {
                return o2.num - o1.num;
            }
        });

        for (int i = 1; i <= n; i++)
            b[i] += b[i - 1];

        for (int i = 1; i <= n; i++) {
            v.add(new num(i, b[i]));
        }

        Long after = 0L;
        for (int i = 1; i <= n; i++) {
            after = after + (long) ((long) v.poll().num * (long) a[i]);
        }
        System.out.println(after - before);


    }
}

class num {
    int i, num;

    public num(int i, int num) {
        this.i = i;
        this.num = num;
    }
}

// 实现Comparator接口
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        /*
         * 如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值， 这样颠倒一下，就可以实现降序排序了,反之即可自定义升序排序了
         */
        return (int) (o2 - o1);
    }
}



