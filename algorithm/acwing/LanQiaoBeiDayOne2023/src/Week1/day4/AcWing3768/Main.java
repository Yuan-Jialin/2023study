package Week1.day4.AcWing3768;

import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/22 21:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int ans=0;
        int now=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='x'){
                ans=ans+now>2?now-2:0;
                now=0;

            }
            else{
                now++;
            }
        }
        ans=ans+now>2?now-2:0;
        System.out.println(ans);
    }
}
