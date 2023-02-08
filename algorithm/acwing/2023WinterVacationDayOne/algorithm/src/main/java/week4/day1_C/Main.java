package week4.day1_C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int t;
        int c;

        int num[]=new int[400000];
        for(int i=1;i<=n;i++){
            t=sc.nextInt();
            c=sc.nextInt();
            num[t+1]-=1;
            num[Math.max(0,t-c+1)]+=1;
        }
        for(int i=1;i<=250000;i++)
        {
            num[i]=num[i-1]+num[i];
        }
        while ((m--)>0){
            int x=sc.nextInt();
            System.out.println(num[x+k]);
        }

    }
}
