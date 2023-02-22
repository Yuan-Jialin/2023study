package Week1.Day2.AcWing100;

import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description 心情一般般
 * @Date 2023/2/17 10:18
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n + 1];
        long b;

        for (int i = 1; i <= n; i++)
            a[i] = sc.nextLong();
        long max = 0, min = 0;
        for (int i = n; i >= 2; i--) {
            b = a[i] - a[i - 1];
            if (b > 0) max += b;
            else min -= b;
        }
        System.out.println(Math.max(max, min));
        System.out.println(Math.abs(max - min) + 1);
    }
}
class Solution {
    public int[] exchange(int[] nums) {
         int n=nums.length;
         for(int i=0,j=n-1;i<j;){
             while (nums[i]%2==1&&i<j)
             {
                 i++;
             }
             while (nums[j]%2==0&&i<j){
                 j--;
             }
             int a=nums[i];
             nums[i]=nums[j];
             nums[j]=a;
         }
         return nums;
    }
}