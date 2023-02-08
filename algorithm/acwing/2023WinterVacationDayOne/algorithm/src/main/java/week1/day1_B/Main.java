package week1.day1_B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        if(n<3)
        {
            System.out.println(0);
        }
        else
        {
            long gL2R[]=new long[n];
            long hL2R[]=new long[n];
            Arrays.fill(gL2R,0);
            Arrays.fill(hL2R,0);

            for(int i=1;i<n;i++)
            {
                if(str.charAt(i-1)=='G') {
                    gL2R[i] = gL2R[i - 1] + 1;
                    hL2R[i]=0;
                }
                else
                {
                    gL2R[i]=0;
                    hL2R[i]=hL2R[i-1]+1;
                }
            }
            long gR2L[]=new long[n];
            long hR2L[]=new long[n];
            Arrays.fill(gR2L,0);
            Arrays.fill(hR2L,0);

            for(int i=n-2;i>=0;i--)
            {
                if(str.charAt(i+1)=='G')
                {
                    gR2L[i]=gR2L[i+1]+1;
                    hR2L[i]=0;
                }
                else {
                    gR2L[i]=0;
                    hR2L[i]=hR2L[i+1]+1;
                }
            }
            //GGGGGGGGGGGGGGGGGGGGGGGGG
            //GGGGGGGGGGGGGGGGGGGGGGGG
            long ans=0;
            for(int i=0;i<n;i++)
            {
                if(str.charAt(i)=='G')
                {
                    ans=ans+hL2R[i]*hR2L[i];
                    ans+= Math.max(hR2L[i] - 1, 0);
                    ans+= Math.max(hL2R[i] - 1, 0);
                }
                else
                {
                    ans=ans+gL2R[i]*gR2L[i];

                    ans+= Math.max(gR2L[i] - 1, 0);
                    ans+= Math.max(gL2R[i] - 1, 0);
                }
            }
            System.out.println(ans);
            /*for (int i : gL2R) {
                System.out.printf(String.valueOf(i)+" ");
            }
            System.out.println();
            for (int i : gR2L) {
                System.out.printf(String.valueOf(i)+" ");
            }
            System.out.println();
            System.out.println(gL2R[25]);
            System.out.println(gR2L[25]);*/
        }
    }
}
