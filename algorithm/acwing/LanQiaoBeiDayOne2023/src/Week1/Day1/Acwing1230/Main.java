package Week1.Day1.Acwing1230;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long a[] = new long[n + 1];
        long ans = 0;

        long mod;
        int v[]=new int[(int) k];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
            a[i] += a[i - 1];
        }
        v[0]=1;
        for (int i = 1; i <= n; i++) {
            mod = (a[i] % k);
            ans += v[(int) mod];
            v[(int) mod]++;
        }
        System.out.println(ans);


    }
}

class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String ans="";
        for(int i=s1.length-1;i>=0;i--)
        {
            ans+=s1[i];
            System.out.println(s1[i]);
            if(i!=0) ans+=" ";
        }
        return ans;
    }
}
