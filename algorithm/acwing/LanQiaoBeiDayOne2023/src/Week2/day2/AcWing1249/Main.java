package Week2.day2.AcWing1249;

import java.io.*;
import java.util.Random;


/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 15:19
 */
public class Main {
    static int N = 20010;
    static int[] p = new int[N];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wt = new PrintWriter(new OutputStreamWriter(System.out));

        String[] s1 = bf.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);

        for (int i = 1; i <= n; i++) p[i] = i;
        while (m-- > 0) {
            String[] s2 = bf.readLine().split(" ");
            int a = Integer.parseInt(s2[0]);
            int b = Integer.parseInt(s2[1]);
            if (find(a) != find(b)) p[find(a)] = find(b);
        }
        int q = Integer.parseInt(bf.readLine());
        while (q-- > 0) {
            String[] s3 = bf.readLine().split(" ");
            int a = Integer.parseInt(s3[0]);
            int b = Integer.parseInt(s3[1]);
            if (find(a) == find(b)) wt.println("Yes");
            else wt.println("No");
        }
        wt.flush();
    }

    public static int find(int a) {
        if (a != p[a]) p[a] = find(p[a]);
        return p[a];
    }
}

class Solution {
    private int randRange(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private int countOccurences(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public int majorityElement(int[] nums) {
        Random rand = new Random();

        int majorityCount = nums.length / 2;

        while (true) {
            int candidate = nums[randRange(rand, 0, nums.length)];
            if (countOccurences(nums, candidate) > majorityCount) {
                return candidate;
            }
        }
    }

    public int[] constructArr(int[] a) {
        if(a==null||a.length==0)
            return new int[0];
        int n=a.length;
        int ans[]=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++)
        {
            ans[i]=ans[i-1]*a[i-1];
        }
        int r=1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]=ans[i]*r;
            r*=a[i];
        }
        return ans;
    }

}

