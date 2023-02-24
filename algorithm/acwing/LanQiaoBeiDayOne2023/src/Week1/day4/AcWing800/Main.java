package Week1.day4.AcWing800;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/24 15:15
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long x=sc.nextLong();

        //int a[]=new int[n+1];
       // int b[]=new int[m+1];
        HashMap<Long,Integer>v=new HashMap<Long, Integer>();
        long a;
        for(int i=0;i<n;i++){
           a=sc.nextLong();
           v.put(a,i);
        }
        long b=sc.nextLong();
        for(int j=0;j<m;j++){
           b=sc.nextLong();
            long r=x-b;
            if(v.containsKey(r)){
                System.out.println(v.get(r)+" "+j);
            }

        }


    }

}
