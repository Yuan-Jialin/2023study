package Week2.day1.ACwing98;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 15:15
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,a,b;
        int t;
        t=sc.nextInt();
        while(t-->0)
        {


            n=sc.nextLong();
            a=sc.nextLong();
            b=sc.nextLong();
            point nowa=calc(n,a-1);
            point nowb=calc(n,b-1);
            double dx= nowa.x-nowb.x;
            double dy= nowa.y-nowb.y;
            double ans=(Math.sqrt(dx*dx+dy*dy)*10);
            System.out.printf("%.0f\n",ans);

        }



    }

    static class point{
        point(long a,long b)
        {
            x=a;
            y=b;
        }
        long x;
        long y;
    }
    static  point calc(long  n,long m)
    {   if(n==0)
        return new point(0,0);
        long len=1L<<(n-1);
        long cnt=1L<<(n*2-2);
        point now=calc(n-1,m%cnt);
        long x= now.x;
        long y= now.y;
        long z=m/cnt;
        if (z==0)
            return new point(y,x);
        if (z==1)
            return new point(x,y+len);
        if (z==2)
            return new point(x+len,y+len);
        return new point(2*len-1-y,len-1-x);

    }


}