package Week1.Day2.AcWing3729;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int b[] = new int[n + 5];
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                x = Math.min(x, i);
                int l = i - x + 1;
                int r = i;
                b[l]++;
                b[r + 1]--;


            }

            for (int i = 1; i <= n; i++)
                b[i] += b[i - 1];
            for (int i = 1; i <= n; i++) {
                if (b[i] > 0)
                    System.out.printf("%d ", 1);
                else
                    System.out.printf("%d ", 0);
            }
            System.out.println();

        }
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        Scanner sc=new Scanner(System.in);
        if(nums.length==0)
            return 0;
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            nums[i]+=Math.max(0,nums[i-1]);
            ans=Math.max(ans,nums[i]);
        }
        return ans;
    }
}
