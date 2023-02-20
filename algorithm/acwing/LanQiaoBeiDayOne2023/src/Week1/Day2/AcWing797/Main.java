package Week1.Day2.AcWing797;

import java.util.Scanner;
//袁佳林
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = n; i >= 1; i--)
            a[i] = a[i] - a[i - 1];
        while (m-- > 0) {
            int l, r, c;
            l = sc.nextInt();
            r = sc.nextInt();
            c = sc.nextInt();
            a[l] += c;
            a[r + 1] -= c;
        }
        for (int i = 1; i <= n; i++)
            a[i] += a[i - 1];
        for (int i = 1; i <= n; i++)
            System.out.printf("%d ", a[i]);
    }
}
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int all=0;
        ListNode p=head;
        while (p!=null){
            all++;
            p=p.next;
        }
        p=head;
        all=all-k+1;
        while (all-->0){
            p=p.next;
        }
        return p;

    }
}


class ListNode {
    int val;
   ListNode next;
   ListNode(int x) { val = x; }
 }


