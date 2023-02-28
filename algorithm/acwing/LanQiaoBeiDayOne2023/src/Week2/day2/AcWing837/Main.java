package Week2.day2.AcWing837;

import java.util.Scanner;

/**
 * @Author 袁佳林
 * @Description 今天被甩了 草
 * @Date 2023/2/28 20:35
 */
public class Main {

    static int p[],size[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        p=new int[n+5];
        size=new int[n+5];
        for(int i=1;i<=n;i++){
            p[i]=i;
            size[i]=1;
        }
        while (m-->0){
        String command=sc.next();

        if(command.equals("C")){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=find(a),y=find(b);
            if(y==x)continue;
            size[x]+=size[y];
            p[y]=x;
        }else if(command.equals("Q1")){

            int a = sc.nextInt();
            int b = sc.nextInt();
            if(find(a) == find(b)) System.out.println("Yes");
            else System.out.println("No");

        }else {
            int a=sc.nextInt();
            System.out.println(size[find(a)]);
        }



        }
    }
    public static int find(int a){
        if(a!=p[a]) p[a]=find(p[a]);
        return p[a];
    }
}
