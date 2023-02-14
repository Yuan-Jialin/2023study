#include<iostream>
using namespace std;

int a[100010];
long long ans, cnt;
int main()
{
    int n;
    scanf("%d",&n);
    for(int i = 1;i <= n;i ++)
    {
        scanf("%d", &a[i]);
        a[i] += a[i-1];
    }
    if(a[n] % 3){
        puts("0\n");
        return 0;
    }
    for(int i = 3;i <= n;i++)
    {
        if (a[i - 2] == a[n] / 3) cnt ++;
        if (a[n] - a[i - 1] == a[n] / 3) ans += cnt;
    }
    printf("%d\n", ans);
    return 0;
}

