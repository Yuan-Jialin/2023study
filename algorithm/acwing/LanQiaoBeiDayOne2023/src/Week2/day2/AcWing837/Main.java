package Week2.day2.AcWing837;

import java.util.*;

/**
 * @Author 袁佳林
 * @Description 今天被甩了 草
 * @Date 2023/2/28 20:35
 */
public class Main {

    static int p[],size[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        p=new int[n+5];
        size=new int[n+5];
        for(int i=1;i<=n;i++){
            p[i]=i;
            size[i]=1;
        }
        while (m-->0){
        String command=sc.next();

        if(command.equals("C")){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=find(a),y=find(b);
            if(y==x)continue;
            size[x]+=size[y];
            p[y]=x;
        }else if(command.equals("Q1")){

            int a = sc.nextInt();
            int b = sc.nextInt();
            if(find(a) == find(b)) System.out.println("Yes");
            else System.out.println("No");

        }else {
            int a=sc.nextInt();
            System.out.println(size[find(a)]);
        }



        }
    }
    public static int find(int a){
        if(a!=p[a]) p[a]=find(p[a]);
        return p[a];
    }
}
class Solution {
    HashMap<Integer,Integer>v;
    int x;
    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        v=new HashMap<>();
        x=0;
        for(int i=0;i<inorder.length;i++){
            v.put(inorder[i],i);
        }
        return build(preorder,inorder,0,preorder.length);
    }
    public TreeNode build(int[]p,int []i,int l,int r){
        if(l>r)
            return null;
        TreeNode now=new TreeNode(p[x]);
        int mid=v.get(p[x]);
        x++;
        now.left=build(p,i,l ,mid-1);
        now.right=build(p,i,mid+1,r);
        return now;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||preorder.length==0)
            return null;
        Deque<TreeNode>v=new ArrayDeque<>();
        v.push(new TreeNode(preorder[0]));
        for(int i=1;i<preorder.length;i++){
            
        }
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        System.out.println(n);
        int ans=0;
        while (n>0){
            if((n>>1&1)==1)
                ans++;
            n>>=1;

        }
        return ans;
    }


        public int add(int a, int b) {
            int ans=0;
            int p=0;
            for(int i=0;i<32;i++){
                int x=(a>>i)&1;
                int y=(b>>i)&1;
                if((x&y)==1){
                    if(p==1)
                    {
                        ans=ans|(1<<i);
                    }
                    else{
                        p=1;
                    }
                }
                else if((x|y)==1)
                {
                    if(p==1)
                    {
                        continue;
                    }
                    ans=ans|(1<<i);

                }
                else{
                    if(p==1)
                    {
                        ans=ans|(1<<i);
                        p=0;
                    }

                }
            }
            return ans;
        }

    public double myPow(double x, int n) {
        double ans=1;
        if(x==1||x==0)
            return x;
        long p=n;
        if(n<0){
            p=-p;
            x=1/x;
        }
        while(p!=0){
            if ((p&1)==1){
                ans*=x;
            }
            x*=x;
            p>>=1;
        }
        return ans;
    }

    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer>v=new Stack<>();
        int root=Integer.MAX_VALUE;
        for(int i=postorder.length-1;i>=0;i--)
        {
            if(postorder[i]>root)return false;
            while (!v.isEmpty()&&v.peek()>postorder[i])
                root=v.pop();
            v.add(postorder[i]);
        }
        return true;

    }

    public int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int n : nums) {
            ret ^= n;
        }
        int div = 1;
        while ((div & ret) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for (int n : nums) {
            if ((div & n) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a, b};
    }

    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }



}


 //Definition for a binary tree node.
class TreeNode {
     int val;
      TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
  }
