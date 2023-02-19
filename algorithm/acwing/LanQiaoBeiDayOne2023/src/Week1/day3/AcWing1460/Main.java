package Week1.day3.AcWing1460;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description common
 * @Date 2023/2/18 15:03
 */
public class Main {
    static int n;
    static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        str = sc.next();
        int l = 1, r = n;
        while (l < r) {
            int mid = l + r >> 1;
            if (check(mid)) r = mid;
            else l = mid + 1;
        }
        System.out.println(r);
    }

    public static boolean check(int mid) {
        HashSet<String> v = new HashSet<>();
        for (int i = 0; i + mid - 1 < str.length(); i++) {
            String substring = str.substring(i, i + mid);
            boolean contains = v.contains(substring);
            if (contains == true)
                return false;
            else
                v.add(substring);

        }
        return true;
    }

}


class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0)
            return 0;
        HashMap<Character,Integer>v=new HashMap<>();
        int dp[]=new int[s.length()+5];
        dp[0]=1;
        int end=0;
        for(int i=1;i<s.length();i++){
            Integer orDefault = v.getOrDefault(s.charAt(i), -1);
            if(orDefault<end)
            {
                dp[i]=1+dp[i-1];
                v.put(s.charAt(i),i);
            }
            else
            {
                end=orDefault+1;
                dp[i]=i-end+1;
                v.put(s.charAt(i),i);
            }
        }
        return dp[s.length()];
    }
}
