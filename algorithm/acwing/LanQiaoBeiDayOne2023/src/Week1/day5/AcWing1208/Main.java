package Week1.day5.AcWing1208;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/25 10:55
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        String now = sc.next();
        int ans = 0;
        int a[] = new int[now.length() + 1];
        for (int i = 0; i < now.length(); i++) {
            if (now.charAt(i) == target.charAt(i) && a[i] % 2 == 0)
                continue;
            else if (now.charAt(i) != target.charAt(i) && a[i] % 2 == 1) {
                continue;
            } else {
                a[i]++;
                a[i + 1]++;
                ans++;
            }

        }
        System.out.println(ans);
    }
}

class Solution {

    int idx;
    int midorder[];
    int afterorder[];

    HashMap<Integer,Integer>v=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.midorder=inorder;
        this.afterorder=postorder;
        int idx=postorder.length-1;
        for(int i=0;i<inorder.length;i++)
            v.put(inorder[i],i);
        return build(0,idx);
    }
    public TreeNode build(int left,int right){

        TreeNode head=new TreeNode(afterorder[idx]);

        Integer mid = v.get(afterorder[idx]);

        idx--;

        head.right=build(mid+1,right);
        head.left=build(left,mid-1);
        return head;

    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
        this.left = left;
        this.right = right;
    }
  }
