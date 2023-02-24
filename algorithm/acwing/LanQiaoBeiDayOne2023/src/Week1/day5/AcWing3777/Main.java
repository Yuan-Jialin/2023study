package Week1.day5.AcWing3777;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/24 21:03
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int a[]=new int[n+1];
            List<Integer>v=new ArrayList<>();
            //w
            for(int i=0;i<n;i++){
               if(str.charAt(i)=='W'&&a[i]%2==0)
                   continue;
               else if(str.charAt(i)=='B'&&a[i]%2==1){

                    continue;
               }
               else{
                   v.add(i);
                   a[i]+=1;
                   a[i+1]+=1;
               }

            }
            if(a[n]==0){
                if(v.size()==0)
                {
                    System.out.println(0);
                    continue;
                }
                System.out.println(v.size());
                for (Integer integer : v) {
                    System.out.printf("%d ",integer);
                }
                System.out.println();
                continue;
            }
            Arrays.fill(a,0);
            v=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='B'&&a[i]%2==0)
                    continue;
                else if(str.charAt(i)=='W'&&a[i]%2==1){

                    continue;
                }
                else{
                    v.add(i);
                    a[i]+=1;
                    a[i+1]+=1;
                }

            }
            if(a[n]==0){
                if(v.size()==0)
                {
                    System.out.println(0);
                    continue;
                }
                System.out.println(v.size());
                for (Integer integer : v) {
                    System.out.printf("%d ",integer);
                }
                System.out.println();
                //continue;
            }else{
                System.out.println("-1");
            }



        }
    }
}
