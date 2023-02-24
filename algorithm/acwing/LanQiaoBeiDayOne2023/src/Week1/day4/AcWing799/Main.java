package Week1.day4.AcWing799;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/24 14:57
 */
public class Main{
    static int N = 100010;
    static int n;
    static int[] a = new int[N];
    static int[] w = new int[N];
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        for (int i = 0; i < n; i ++) a[i] = scan.nextInt();

        int res = 0;
        for (int i = 0, j = 0; i < n;){
            while (i < n && w[a[i]] == 0) w[a[i ++]] ++;
            res = Math.max(res, i - j);
            while (w[a[i]] == 1){
                w[a[j]] --;
                j ++;
            }
        }
        System.out.println(res);
    }
}

class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root==null)
            return ans;
        List<Integer>v=new ArrayList<>();
        dfs(v,root,0,target);
        return ans;

    }
    public void dfs(List v,TreeNode root,int all,int target){

        if(root.left==null&&root.right==null){
            if(all+root.val==target){
                v.add(root.val);
                ArrayList arrayList = new ArrayList<>(v);
                ans.add(arrayList);
                v.remove(v.size()-1);
            }
        }else{
            v.add(root.val);
            if(root.left!=null)
                dfs(v,root.left,all+root.val,target);
            if(root.right!=null)
                dfs(v,root.right,all+root.val,target);
            v.remove(v.size()-1);

        }

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
