package week1.day2_D;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=0;

        for(int i=1;i<=n;i++)
            ans+=get(i,k);
        System.out.println(ans);
    }

    public static int get(int n,int k)
    {   int num=0;

        while (n>0)
        {
            if(n%10==k)
                num++;
            n/=10;
        }

        return num;

    }
}
