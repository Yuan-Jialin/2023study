package week2.day2_C;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n+1];
        long sum=0;

        for(int i=1;i<=n;i++){
            a[i]=sc.nextLong();
            sum=sum+a[i];
        }

        long all=0;

        for(int i=1;i<=n;i++)
        {   sum-=a[i];
            all=all+ a[i] *sum;
        }
        System.out.println(all);




    }
}