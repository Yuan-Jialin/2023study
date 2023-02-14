#include <cstdio>

int n, m, a[114514];

int main()
{
    scanf("%d%d", &n, &m);
    for (int i = 1; i <= n; i ++ ) scanf("%d", &a[i]), a[i] += a[i - 1];

    while (m -- )
    {
        int l, r;
        scanf("%d%d", &l, &r);
        printf("%d\n", a[r] - a[l - 1]);
    }

    return 0;
}