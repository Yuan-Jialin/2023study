#include <iostream>

using namespace std;
/**
 * @Author 袁佳林
 * @Description 今天被甩了 草
 * @Date 2023/2/28 20:35
 */
const int N = 100010;

int n, m;
int p[N], s[N];

int find(int x){
    if(p[x] != x) p[x] = find(p[x]);
    return p[x];
}

int main(){
    scanf("%d%d", &n, &m);
    for(int i = 1; i <= n; i ++){
        p[i] = i;
        s[i] = 1;
    }

    while(m --)
    {
        char op[5];
        int a, b;
        scanf("%s", op);
        if(op[0] == 'C'){ //合并
            scanf("%d%d", &a, &b);
            if(find(a) == find(b)) continue;
            s[find(b)] += s[find(a)];
            p[find(a)] = find(b);
        }
        else if(op[1] == '1'){ //Q1
            scanf("%d%d", &a, &b);
            if(find(a) == find(b)) puts("Yes");
            else puts("No");
        }
        else{
            scanf("%d", &a);
            printf("%d\n", s[find(a)]);
        }
    }

    return 0;
}
