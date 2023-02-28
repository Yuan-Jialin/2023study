package Week2.day2.AcWing836;

import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 15:56
 */
public class Main {
   static int p[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        p=new int[n+5];
        for(int i=1;i<=n;i++)
            p[i]=i;
        while (m-->0){

            String command=sc.next();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(command.equals("M")){
                p[find(b)]=find(a);
            }else{

                if(find(a)==find(b))
                    System.out.println("Yes");
                else
                    System.out.println("No");

            }

        }
    }

    public static int find(int a){
        if(a!=p[a])p[a]=find(a);
        return p[a];
    }
}
