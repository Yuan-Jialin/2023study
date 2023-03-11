package Week2.day2.AcWing1249;

import java.io.*;
import java.util.*;


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
        if (a == null || a.length == 0)
            return new int[0];
        int n = a.length;
        int ans[] = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * a[i - 1];
        }
        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * r;
            r *= a[i];
        }
        return ans;
    }


    public int lastRemaining(int n, int m) {
        return f(m, n);
    }

    //f表示，对于有n个数的数组，每次按题目要求删后，剩下的数的下标
    int f(int m, int n) {
        if (n == 1)
            return 0;
        int x = f(m - 1, n);
        //删除掉低m-1的数后，还剩下一个n-1的数组，x是对于一个n-1的数组最后剩下来的数的下标，也就是从开始数了x+1个数
        //删掉 m-1 后 下标就从m开始
        return ((m - 1) + x + 1) % n;
    }


    public boolean isNumber(String s) {
        Map<State, Map<CharType, State>> transfer = new HashMap<State, Map<CharType, State>>();
        Map<CharType, State> initialMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_SPACE, State.STATE_INITIAL);
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
            put(CharType.CHAR_SIGN, State.STATE_INT_SIGN);
        }};
        transfer.put(State.STATE_INITIAL, initialMap);
        Map<CharType, State> intSignMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_POINT, State.STATE_POINT_WITHOUT_INT);
        }};
        transfer.put(State.STATE_INT_SIGN, intSignMap);
        Map<CharType, State> integerMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_INTEGER);
            put(CharType.CHAR_EXP, State.STATE_EXP);
            put(CharType.CHAR_POINT, State.STATE_POINT);
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_INTEGER, integerMap);
        Map<CharType, State> pointMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
            put(CharType.CHAR_EXP, State.STATE_EXP);
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_POINT, pointMap);
        Map<CharType, State> pointWithoutIntMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
        }};
        transfer.put(State.STATE_POINT_WITHOUT_INT, pointWithoutIntMap);
        Map<CharType, State> fractionMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_FRACTION);
            put(CharType.CHAR_EXP, State.STATE_EXP);
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_FRACTION, fractionMap);
        Map<CharType, State> expMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
            put(CharType.CHAR_SIGN, State.STATE_EXP_SIGN);
        }};
        transfer.put(State.STATE_EXP, expMap);
        Map<CharType, State> expSignMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
        }};
        transfer.put(State.STATE_EXP_SIGN, expSignMap);
        Map<CharType, State> expNumberMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_NUMBER, State.STATE_EXP_NUMBER);
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_EXP_NUMBER, expNumberMap);
        Map<CharType, State> endMap = new HashMap<CharType, State>() {{
            put(CharType.CHAR_SPACE, State.STATE_END);
        }};
        transfer.put(State.STATE_END, endMap);

        int length = s.length();
        State state = State.STATE_INITIAL;

        for (int i = 0; i < length; i++) {
            CharType type = toCharType(s.charAt(i));
            if (!transfer.get(state).containsKey(type)) {
                return false;
            } else {
                state = transfer.get(state).get(type);
            }
        }
        return state == State.STATE_INTEGER || state == State.STATE_POINT || state == State.STATE_FRACTION || state == State.STATE_EXP_NUMBER || state == State.STATE_END;
    }

    public CharType toCharType(char ch) {
        if (ch >= '0' && ch <= '9') {
            return CharType.CHAR_NUMBER;
        } else if (ch == 'e' || ch == 'E') {
            return CharType.CHAR_EXP;
        } else if (ch == '.') {
            return CharType.CHAR_POINT;
        } else if (ch == '+' || ch == '-') {
            return CharType.CHAR_SIGN;
        } else if (ch == ' ') {
            return CharType.CHAR_SPACE;
        } else {
            return CharType.CHAR_ILLEGAL;
        }
    }

    enum State {
        STATE_INITIAL,
        STATE_INT_SIGN,
        STATE_INTEGER,
        STATE_POINT,
        STATE_POINT_WITHOUT_INT,
        STATE_FRACTION,
        STATE_EXP,
        STATE_EXP_SIGN,
        STATE_EXP_NUMBER,
        STATE_END
    }

    enum CharType {
        CHAR_NUMBER,
        CHAR_EXP,
        CHAR_POINT,
        CHAR_SIGN,
        CHAR_SPACE,
        CHAR_ILLEGAL
    }

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;
        boolean dp[][] = new boolean[len + 2][len + 2];
        for (int i = 0; i < len; i++)
            dp[i][i] = true;
        int ans = 1, begin = 0;
        char[] chars = s.toCharArray();
        for (int i = 2; i <= len; i++) {
            for (int j = 0; j < len; j++) {
                int l = j, r = j + i - 1;
                if (r >= len) {
                    break;
                }
                if (chars[l] != chars[r]) {
                    continue;
                } else {
                    if (dp[l + 1][r - 1]) {
                        dp[l][r] = true;
                    } else {
                        dp[l][r] = false;
                    }
                }
                if (dp[l][r] == true) {
                    ans = i;
                    begin = j;
                }

            }

        }
        return s.substring(begin, begin + ans);
    }

    public String convert(String s, int numRows) {

        Character map[][] = new Character[numRows][s.length()];

        char[] chars = s.toCharArray();
        int dir[][] = {{1, 0}, {-1, 1}};
        int way = 0, x = 0, y = 0;

        for (int i = 0; i < s.length(); i++) {
            map[x][y] = chars[i];
            if (x == numRows - 1)
                way = 1;
            if (x == 0)
                way = 0;
            x += dir[way][0];
            y += dir[way][1];
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++)
            for (int j = 0; j < s.length(); j++) {
                if (map[i][j] == null) {
                    continue;
                } else {
                    ans.append(map[i][j]);
                }
            }
        return String.valueOf(ans);
    }

    public int reverse(int x) {
        if (x == 0)
            return x;
        Integer a = x;
        String s = a.toString();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        int end = stringBuilder.length() - 1;
        if (a < 0)
            end--;
        long ans = 1;
        for (int i = 0; i <= end; i++) {
            ans += (stringBuilder.charAt(i) - '0');
            ans *= 10;
        }
        if (a < 0) ans *= -1;
        if (ans > Integer.MAX_VALUE)
            return 0;
        if (ans < Integer.MIN_VALUE)
            return 0;
        return (int) ans;
    }

    public boolean isPalindrome(int x) {
        Integer a = x;
        String s = a.toString();
        for(int i=0,j=s.length()-1;i<=j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
    public int maxArea(int[] height) {
        if(height.length<=1)
            return 0;

    }

}

