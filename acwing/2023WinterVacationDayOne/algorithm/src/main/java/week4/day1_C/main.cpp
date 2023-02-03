#include <bits/stdc++.h>
using namespace std;

const int N = 2e5 + 10;

int b[N];

int main()
{
    int n, m, k;
    scanf("%d%d%d", &n, &m, &k);
    for (int i = 1; i <= n; i ++ )
    {
        int t, c;
        scanf("%d%d", &t, &c);
        b[max(1, t - k - c + 1)] ++ ;
        b[max(1, t - k + 1)] -- ;
    }
    for (int i = 1; i < N; i ++ ) b[i] += b[i - 1];
    while (m -- )
    {
        int q;
        scanf("%d", &q);
        printf("%d\n", b[q]);
    }
    return 0;
}

