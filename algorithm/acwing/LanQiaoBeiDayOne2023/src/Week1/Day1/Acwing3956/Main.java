package Week1.Day1.Acwing3956;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 1; i < n; i++) {
            a[i] += a[i - 1];
        }
        long sum = a[n - 1] / 3;
        int b[] = new int[n];

        //System.out.println("all:"+a[n-1]);
        for (int i = n - 3; i >= 0; i--) {
            if (a[i + 1] == 2 * sum) {
                b[i] = b[i + 1] + 1;
            } else
                b[i] = b[i + 1];

        }
        long ans = 0;
        for (int i = 0; i < n - 2; i++) {
            if (a[i] == sum)
                ans += b[i];
        }
        if (a[n - 1] % 3 == 0)
            System.out.println(ans);
        else
            System.out.println(0);
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int biao[]=new int[1000000+2];
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            if(biao[a]==1){
                ans[0]=a;
                ans[1]=nums[i];
                return ans;
            }
            biao[nums[i]]=1;
        }
        return ans;
    }
}