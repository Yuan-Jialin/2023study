package Week1.day4.AcWing3768;

import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/22 21:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int ans=0;
        int now=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='x'){
                ans=ans+now>2?now-2:0;
                now=0;

            }
            else{
                now++;
            }
        }
        ans=ans+now>2?now-2:0;
        System.out.println(ans);
    }
}

class Solution {
    int all=0;
    int biao[][];
    public int movingCount(int m, int n, int k) {
        biao=new int[m][n];
        dfs(0,0,k);
        return all;
    }

    public boolean check(int m,int n,int k){
        int ans=0;
        while (m!=0){
            ans+=m%10;
            m/=10;
        }
        while (n!=0){
            ans+=n%10;
            n/=10;
        }
        if(ans>k)
            return false;
        else
            return true;
    }

    public void dfs(int x,int y,int k){
        all++;
        biao[x][y]=1;
        int direction[][]={{1,0},{-1,0},{0,1},{0,-1}};

        for (int[] dir : direction) {
         int nx=x+dir[0];
         int ny=y+dir[1];
         if(nx<0||nx>=biao.length||ny<0||ny>=biao[0].length||biao[nx][ny]==1)
             continue;
         if(check(nx,ny,k))
          dfs(nx,ny,k);

        }

    }

}