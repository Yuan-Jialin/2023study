#include <iostream>
#include <cstring>
#include <algorithm>

using namespace std;

typedef long long LL;

const int N = 100010;

int n, m;
int a[N], b[N];

bool check(int mid)
{
    LL res = 0;
    for (int i = 0; i < n; i ++ )
        if (a[i] >= mid)
            res += (a[i] - mid) / b[i] + 1;
    return res >= m;
}

int main()
{
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; i ++ ) scanf("%d%d", &a[i], &b[i]);

    int l = 0, r = 1e6;
    while (l < r)
    {
        int mid = l + r + 1 >> 1;
        if (check(mid)) l = mid;
        else r = mid - 1;
    }

    LL res = 0, cnt = 0;
    for (int i = 0; i < n; i ++ )
        if (a[i] >= r)
        {
            int c = (a[i] - r) / b[i] + 1;
            int end = a[i] - (c - 1) * b[i];
            cnt += c;
            res += (LL)(a[i] + end) * c / 2;
        }

    printf("%lld\n", res - (cnt - m) * r);
    return 0;
}

