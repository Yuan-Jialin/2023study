#include <iostream>
using namespace std;
const int N = 1e5 + 10;
int n,m,f[N];
/**
 * @Author 袁佳林
 * @Description
 * @Date 2023/2/28 15:56
 */
int find(int x){
    if(x != f[x])f[x] = find(f[x]);
    return f[x];
}

int main(){
    scanf("%d%d",&n,&m);

    for(int i = 1 ; i <= n ; i ++)f[i] = i;

    while (m --){
        char c;
        int a,b;
        cin>>c>>a>>b;
        a = find(a);
        b = find(b);
        if(c == 'M')f[a] = b;
        else{
            if(a == b)printf("Yes\n");
            else printf("No\n");
        }
    }
}

