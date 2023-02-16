package Week1.Day1.Acwing795;

import java.util.*;
import java.util.function.IntFunction;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long a[] = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
            a[i] += a[i - 1];
        }
        while ((m--) > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(a[r] - a[l - 1]);
        }

    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {

        return compare(root.left,root.right);
    }

    public boolean compare(TreeNode a,TreeNode b){

       if(a==null&&b==null)
           return true;
       if(a==null)
           return false;
       if(b==null)
           return false;

       return a.val==b.val&&compare(a.left,b.right)&&compare(a.right,b.left);


    }





}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

