package week2.day1_A;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class way1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();

        Map<Integer,Integer> v =new HashMap<>();
        int dp[]=new int[n+1];

        int a;
        for(int i=1;i<=n;i++)
        {
            a=sc.nextInt();
            dp[i]=Math.max(dp[i-1],v.getOrDefault(x^a,0));
            v.put(a,i);
        }
        int l,r;
        while ((m--)>0){
            l=sc.nextInt();
            r=sc.nextInt();
            System.out.println(dp[r]>=l?"yes":"no");


        }




    }
}
