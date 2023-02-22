package Week1.day3.AcWing1227;

import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/20 12:12
 */
public class Main {
    static int h[];
    static int w[];
    static int n, k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        h = new int[n + 1];
        w = new int[n + 1];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();

        }
        int l = 1, r = 100000;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (check(mid)) l = mid;
            else r = mid - 1;
        }
        System.out.printf("%d", r);
    }

    public static boolean check(int mid) {
        //boolean ans=false;
        long all = 0;
        for (int i = 0; i < n; i++) {
            all += (long) (h[i] / mid) * (long) (w[i] / mid);
        }
        if (all >= k)
            return true;
        else
            return false;
        //return ans;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l2==null)
            return l1;
        if(l1==null)
            return l2;
        ListNode p=new ListNode(0);
        ListNode dai=p;
        while (l1!=null&&l2!=null){
            if(l1.val>l2.val)
            {
                p.next=l2;
                l2=l2.next;
                p=p.next;

            }
            else {
                p.next=l1;
                l1=l1.next;
                p=p.next;
            }

        }
        if(l2!=null) {
            p.next=l2;


        }
        if(l1!=null){
            p.next=l1;
        }
        return dai.next;
    }
}



class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
