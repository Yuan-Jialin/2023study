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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();
        Stack<TreeNodePlus>s=new Stack<>();
        Stack<TreeNodePlus>p=new Stack<>();
        List<Integer>v=new ArrayList<>();
        int f=1;
        s.add(new TreeNodePlus(root,1));
        while (!s.isEmpty()){
            if(s.isEmpty())
            {
                s=p;
                for (TreeNodePlus treeNodePlus : p) {
                    System.out.printf(String.valueOf(treeNodePlus.treeNode.val));
                }
                for (TreeNodePlus treeNodePlus : s) {
                    System.out.printf(String.valueOf(treeNodePlus.treeNode.val));
                }
                p=new Stack();
            }

            TreeNodePlus pop = s.pop();
            if(pop.f!=f){
                ans.add(v);
                v=new ArrayList<>();
                f++;
            }
            v.add(pop.treeNode.val);
            if(f%2==1){
                if(pop.treeNode.left!=null)
                    s.add(new TreeNodePlus(pop.treeNode.left,f+1));
                if(pop.treeNode.right!=null)
                    s.add(new TreeNodePlus(pop.treeNode.right,f+1));
            }
            else{
                if(pop.treeNode.right!=null)
                    s.add(new TreeNodePlus(pop.treeNode.right,f+1));
                if(pop.treeNode.left!=null)
                    s.add(new TreeNodePlus(pop.treeNode.left,f+1));
            }


        }

return ans;
    }
}

class TreeNodePlus {

    TreeNode treeNode;
    int f;

    public TreeNodePlus(TreeNode treeNode, int f) {
        this.treeNode = treeNode;
        this.f = f;
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

