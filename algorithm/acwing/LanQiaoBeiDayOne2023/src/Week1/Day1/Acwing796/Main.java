package Week1.Day1.Acwing796;

import java.util.Scanner;

public class Main {

    static long map[][];
    static long sum[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        sum=new long[n+1][m+1];
        map=new long[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                map[i][j]=sc.nextLong();
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++)
            {
                sum[i][j]=sum[i][j-1]+sum[i-1][j]-sum[i-1][j-1]+map[i][j];
            }
        }

        while ((p--)>0){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            System.out.println(get(x1,y1,x2,y2));
        }


    }

    public static long get(int x1,int y1 ,int x2,int y2){
        return sum[x2][y2]-sum[x2][y1-1]-sum[x1-1][y2]+sum[x1-1][y1-1];
    }
}
