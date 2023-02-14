#include <cstdio>
#include <cstring>
#include <iostream>
#include <algorithm>

using namespace std;

typedef long long LL;

const int N = 100010;

int n, k;
LL s[N], cnt[N];

int main()
{
    scanf("%d%d", &n, &k);
    for (int i = 1; i <= n; i ++ )
    {
        scanf("%lld", &s[i]);
        s[i] += s[i - 1];
    }

    LL res = 0;
    cnt[0] = 1;
    for (int i = 1; i <= n; i ++ )
    {
        res += cnt[s[i] % k];
        cnt[s[i] % k] ++ ;
    }

    printf("%lld\n", res);

    return 0;
}

