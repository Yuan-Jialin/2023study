package Week2.day1.Acwing1497;

import java.util.*;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/25 16:14
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {   //后序
            a[i] = sc.nextInt();
        }
        //中序
        int b[] = new int[n];


        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();
        Solution solution=new Solution();

        TreeNode root=solution.buildTree(a,b);
        Queue<TreeNode>v=new LinkedList<>();
        v.add(root);
        while (v.size()!=0){
            TreeNode treeNode=v.poll();
            System.out.printf("%d ",treeNode.val);
            if(treeNode.left!=null)
                v.add(treeNode.left);
            if(treeNode.right!=null)
                v.add(treeNode.right);
        }


    }

}
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        //为空直接跳出
        if (postorder == null || postorder.length == 0) {
            return null;
        }
        //总的根节点一定是后序遍历的最后一个节点
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        int inorderIndex = inorder.length - 1;
        for (int i = postorder.length - 2; i >= 0; i--) {
            int postorderVal = postorder[i];
            TreeNode node = stack.peek();
            if (node.val != inorder[inorderIndex]) {
                node.right = new TreeNode(postorderVal);
                stack.push(node.right);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {


                    node = stack.pop();
                    System.out.println(node.val+" "+inorder[inorderIndex]);
                    inorderIndex--;
                }
                node.left = new TreeNode(postorderVal);
                stack.push(node.left);
            }
        }
        return root;
    }

    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        else return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    boolean ans=true;
    public boolean isBalanced(TreeNode root) {

        getDept(root);
        return ans;

    }

    public int getDept(TreeNode root){
        if(root==null)
            return 0;
        else {
            int n=getDept(root.left);
            int m=getDept(root.right);
            if(Math.abs(n-m)>1)
                ans=false;
            return 1+Math.max(n,m);
        }


    }
    TreeNode treeNode;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

       dfs(root, p, q);

       return treeNode;

    }

    public int[] dfs(TreeNode root,TreeNode p,TreeNode q){
        int a[]=new int[2];
        int b[]=new int[2];
        if(root.left!=null)
        a=dfs(root.left,p,q);
        if(root.right!=null)
        b=dfs(root.right,p,q);

        int ans[]=new int[2];
        if(root.val==p.val)
            ans[0]=1;
        if(root.val==q.val)
            ans[1]=1;
        if(a[0]==1||b[0]==1)
            ans[0]=1;
        if(b[1]==1||a[1]==1)
            ans[1]=1;
        if(ans[0]==1&&ans[1]==1&&treeNode==null)
        {
            treeNode=root;
        }
        return ans;
    }


}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left,TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


